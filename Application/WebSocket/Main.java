package javaapplication1;
import java.net.*;
import java.io.*;


public class Main{
	
    static Node2 node_B;//--------------建立節點B
    static Node2 node_C;//--------------建立節點C
    static int[][] Cost_map = {{0, 2, 7}, {999, 999, 999}, {999, 999, 999}};//----------------Cost表的初始狀態

    public static void main(String[] args) throws UnknownHostException, IOException //-------主程式
    {
        //連接
	    node_B = new Node2("203.64.91.105", 1000,1);//----設定B的連接(IP, port , 1(表示B))
	    node_C = new Node2("203.64.91.105", 2000,2);//----設定C的連接(IP, port , 1(表示C))
		
        //開始等待接收資料
	    node_B.start();//---------------------------------B執行多執行緒
	    node_C.start();//---------------------------------C執行多執行緒

        System.out.print("連線成功\n");//------------------此時上述動作建立成功 印出連線成功的訊息
	    F_print();//---------------------------------------先印最原始的COST
    }
    //===============================================================check

    public synchronized static void check(int[] Distance_array, int name) throws IOException//--------檢查是否有更低的路經 會執行此動作是已經從伺服器端取得資料
    {
        boolean update = false;//----------------------------------------------- 更新狀態的bool 先預設初始為false 之後的判斷如果變為true表示需要更新Cost表
        //=======================================================================以下為印出接受到的資料
		System.out.print("收到來自"+name+"的COST為");
		for(int i=0;i<Main.Cost_map.length;i++)
			System.out.print(Distance_array[i]);
		System.out.println();


        //=======================================================================以上為印出接受到的資料

        //=======================================================================判斷是否需要更新資料
        for (int xin = 0; xin < Main.Cost_map.length; xin++)
        {
            if(Cost_map[name][xin]>Distance_array[xin])//---------------------------------------------------------------表示該點有不同的資料需要去執行更新流量的動作
            {
				Cost_map[name][xin]=Distance_array[xin];
				update=true;
            }
        }
        if (update) {//----------------------------------------------------------update=ture表示需要找出最小流量更新
            F_print();//-----------------------------------------------------------先印出當前的Cost費用
            if (F_compute())//----------------------------------------------------需要檢查是否存在最小流量 true表示有 flase表示無
            {
				F_SendCost();
                //---------------------------------------------------有最小流量的更新需要將Cost傳給其他B點與C點
                //-------------------------------------------------------然後再印出變化後的Cost費用
				 System.out.print("Cost_map更新\n");
				F_print();
            }
        }
    }
    //===============================================================check結束
    //===============================================================計算COST

    synchronized static boolean F_compute() //-----------------------計算最小路徑※程式核心
    {
        int cost[]=new int[Cost_map.length];
        boolean can = false;//---------------------------------------多一個判斷做為跳出條件
        int[][] temp = (int[][]) Cost_map.clone();
        for (int xin = 0; xin < Cost_map.length; xin++)
        {
			cost[xin]=0;
            for (int yin = 0; yin < Cost_map.length; yin++)
            {	
				cost[xin]=cost[xin]+temp[xin][yin];
            }
        }
		for (int xin = 0; xin < Cost_map.length; xin++){
			for (int yin = 0; yin < Cost_map.length; yin++){
				if(yin!=xin && yin!=0)
				if(temp[0][xin]>cost[yin]){
					Cost_map[0][xin]=cost[yin];
					can=true;
				}
			}
		}
        return can;
    }
    //=================================================================計算COST結束
    //=================================================================將Cost_map陣列印出來

    synchronized static void F_print() //-------------------------------印出Cost_map 的函式
    {
        for (int xin = 0; xin < Cost_map.length; xin++) {
            for (int yin = 0; yin < Cost_map.length; yin++) {
                System.out.print(Cost_map[xin][yin] + ",");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    //=================================================================將Cost_map陣列印出來
    //=================================================================將COST寄給B和C

    public synchronized static void F_SendCost() throws IOException {

        String s = "";
        byte[] str_byte = null;
        s = Integer.toString(Cost_map[0][0]) + "," + Integer.toString(Cost_map[0][1]) + "," + Integer.toString(Cost_map[0][2]);//將自己的COST以逗號當做區隔轉成字串
        try//-------------------------------------------------------------------
        {
            str_byte = s.getBytes();//------------------------------------------將字串轉程byte
        
        	node_B.send.write(str_byte);//---------------------------------------寄給B點
        	node_C.send.write(str_byte);//---------------------------------------寄給C點
        }
        catch (IOException e)//-------------------------------------------------如果程式出錯會印出錯誤訊息
        {
           	e.printStackTrace();
        }
    }
}
