package javaapplication1;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Node2 extends java.lang.Thread {

    Socket socket;//------------------------------------------------------------設定Socket為了要進行網路傳送資料
    DataInputStream receive;//--------------------------------------------------接收資料用到的變數
    DataOutputStream send;//----------------------------------------------------傳送資料出去用到的變數
    int name;//-----------------------------------------------------------------1:表示節點B  2:表示節點C
    //表示接收到的COST;
    //--------------------------------------------------------------------------Distance_array[0]:name節點到A節點的COST;
    //--------------------------------------------------------------------------Distance_array[1]:name節點到B節點的COST;
    //--------------------------------------------------------------------------Distance_array[2]:name節點到C節點的COST;
    int[] Distance_array = new int[3];//----------------------------------------
    String[] str_array;//-------------------------------------------------------存放從伺服器端傳來的byte轉換為字串的資料

    public Node2(String IP, int Port, int use) throws UnknownHostException, IOException
    {
        this.name = use;//-------------------------------------------------this.name 1:表示節點B  2:表示節點C
        this.socket = new Socket(IP, Port);//------------------------------指定Socket的連結IP與port
        receive = new DataInputStream(this.socket.getInputStream());//-----接收資料用到的變數
        send = new DataOutputStream(this.socket.getOutputStream());//------傳送資料出去用到的變數
       
    }

    public void run()  {
        try {
            Main.F_SendCost(); //-------------------------------------------------先將原始的COST寄給B和C
        } catch (IOException ex)//----------------------------------------------如果程式出錯會跳出
        {
            Logger.getLogger(Node2.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Str = null;//----------------------------------------------------設立Str字串變數，用來將從客戶端傳來的資料轉為字串用(客戶端資料為byte)
        while (true) {
            byte[] msg = new byte[5];//-----------------------------------------byte[] msg變數用來存放五個byte的伺服器端資料 因為地圖的資料一組最大為5byte

            try {
                receive.read(msg);//--------------------------------------------等待接收伺服器傳來資料
            } catch (IOException e)//-------------------------------------------如果程式出錯會跳出
            {
                e.printStackTrace();//------------------------------------------印出錯誤訊息
            }
            Str = new String(msg);//--------------------------------------------將收到的資料轉回字串
            str_array = Str.split(",");//---------------------------------------將字串以逗號當做間隔轉程字串陣列

            //==================================================================以下將接收到的COST放入陣列
            Distance_array[0] = Integer.parseInt(str_array[0]);//-----------------將轉換來的字串資料(必定為Int型態)，存放在Cost表裡
            Distance_array[1] = Integer.parseInt(str_array[1]);
            Distance_array[2] = Integer.parseInt(str_array[2]);
            try {
            //==================================================================將收到的COST傳回Main.java 並且檢查需不需要更新
                Main.check(Distance_array, name);//------------------------------收到資料時，要透過主程式Main.java的check函式檢查是否找到最小路徑，如果有要進行更新
                                                //------------------------------ Check(Cost表, B點或C點)
            } catch (IOException ex) //-----------------------------------------如果程式出錯會跳出
            {
                Logger.getLogger(Node2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
