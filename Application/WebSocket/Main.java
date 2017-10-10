package javaapplication1;
import java.net.*;
import java.io.*;


public class Main{
	
    static Node2 node_B;//--------------�إ߸`�IB
    static Node2 node_C;//--------------�إ߸`�IC
    static int[][] Cost_map = {{0, 2, 7}, {999, 999, 999}, {999, 999, 999}};//----------------Cost����l���A

    public static void main(String[] args) throws UnknownHostException, IOException //-------�D�{��
    {
        //�s��
	    node_B = new Node2("203.64.91.105", 1000,1);//----�]�wB���s��(IP, port , 1(���B))
	    node_C = new Node2("203.64.91.105", 2000,2);//----�]�wC���s��(IP, port , 1(���C))
		
        //�}�l���ݱ������
	    node_B.start();//---------------------------------B����h�����
	    node_C.start();//---------------------------------C����h�����

        System.out.print("�s�u���\\n");//------------------���ɤW�z�ʧ@�إߦ��\ �L�X�s�u���\���T��
	    F_print();//---------------------------------------���L�̭�l��COST
    }
    //===============================================================check

    public synchronized static void check(int[] Distance_array, int name) throws IOException//--------�ˬd�O�_����C�����g �|���榹�ʧ@�O�w�g�q���A���ݨ��o���
    {
        boolean update = false;//----------------------------------------------- ��s���A��bool ���w�]��l��false ���᪺�P�_�p�G�ܬ�true��ܻݭn��sCost��
        //=======================================================================�H�U���L�X�����쪺���
		System.out.print("����Ӧ�"+name+"��COST��");
		for(int i=0;i<Main.Cost_map.length;i++)
			System.out.print(Distance_array[i]);
		System.out.println();


        //=======================================================================�H�W���L�X�����쪺���

        //=======================================================================�P�_�O�_�ݭn��s���
        for (int xin = 0; xin < Main.Cost_map.length; xin++)
        {
            if(Cost_map[name][xin]>Distance_array[xin])//---------------------------------------------------------------��ܸ��I�����P����ƻݭn�h�����s�y�q���ʧ@
            {
				Cost_map[name][xin]=Distance_array[xin];
				update=true;
            }
        }
        if (update) {//----------------------------------------------------------update=ture��ܻݭn��X�̤p�y�q��s
            F_print();//-----------------------------------------------------------���L�X��e��Cost�O��
            if (F_compute())//----------------------------------------------------�ݭn�ˬd�O�_�s�b�̤p�y�q true��ܦ� flase��ܵL
            {
				F_SendCost();
                //---------------------------------------------------���̤p�y�q����s�ݭn�NCost�ǵ���LB�I�PC�I
                //-------------------------------------------------------�M��A�L�X�ܤƫ᪺Cost�O��
				 System.out.print("Cost_map��s\n");
				F_print();
            }
        }
    }
    //===============================================================check����
    //===============================================================�p��COST

    synchronized static boolean F_compute() //-----------------------�p��̤p���|���{���֤�
    {
        int cost[]=new int[Cost_map.length];
        boolean can = false;//---------------------------------------�h�@�ӧP�_�������X����
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
    //=================================================================�p��COST����
    //=================================================================�NCost_map�}�C�L�X��

    synchronized static void F_print() //-------------------------------�L�XCost_map ���禡
    {
        for (int xin = 0; xin < Cost_map.length; xin++) {
            for (int yin = 0; yin < Cost_map.length; yin++) {
                System.out.print(Cost_map[xin][yin] + ",");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    //=================================================================�NCost_map�}�C�L�X��
    //=================================================================�NCOST�H��B�MC

    public synchronized static void F_SendCost() throws IOException {

        String s = "";
        byte[] str_byte = null;
        s = Integer.toString(Cost_map[0][0]) + "," + Integer.toString(Cost_map[0][1]) + "," + Integer.toString(Cost_map[0][2]);//�N�ۤv��COST�H�r�����Ϲj�ন�r��
        try//-------------------------------------------------------------------
        {
            str_byte = s.getBytes();//------------------------------------------�N�r����{byte
        
        	node_B.send.write(str_byte);//---------------------------------------�H��B�I
        	node_C.send.write(str_byte);//---------------------------------------�H��C�I
        }
        catch (IOException e)//-------------------------------------------------�p�G�{���X���|�L�X���~�T��
        {
           	e.printStackTrace();
        }
    }
}
