package javaapplication1;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Node2 extends java.lang.Thread {

    Socket socket;//------------------------------------------------------------�]�wSocket���F�n�i������ǰe���
    DataInputStream receive;//--------------------------------------------------������ƥΨ쪺�ܼ�
    DataOutputStream send;//----------------------------------------------------�ǰe��ƥX�h�Ψ쪺�ܼ�
    int name;//-----------------------------------------------------------------1:��ܸ`�IB  2:��ܸ`�IC
    //��ܱ����쪺COST;
    //--------------------------------------------------------------------------Distance_array[0]:name�`�I��A�`�I��COST;
    //--------------------------------------------------------------------------Distance_array[1]:name�`�I��B�`�I��COST;
    //--------------------------------------------------------------------------Distance_array[2]:name�`�I��C�`�I��COST;
    int[] Distance_array = new int[3];//----------------------------------------
    String[] str_array;//-------------------------------------------------------�s��q���A���ݶǨӪ�byte�ഫ���r�ꪺ���

    public Node2(String IP, int Port, int use) throws UnknownHostException, IOException
    {
        this.name = use;//-------------------------------------------------this.name 1:��ܸ`�IB  2:��ܸ`�IC
        this.socket = new Socket(IP, Port);//------------------------------���wSocket���s��IP�Pport
        receive = new DataInputStream(this.socket.getInputStream());//-----������ƥΨ쪺�ܼ�
        send = new DataOutputStream(this.socket.getOutputStream());//------�ǰe��ƥX�h�Ψ쪺�ܼ�
       
    }

    public void run()  {
        try {
            Main.F_SendCost(); //-------------------------------------------------���N��l��COST�H��B�MC
        } catch (IOException ex)//----------------------------------------------�p�G�{���X���|���X
        {
            Logger.getLogger(Node2.class.getName()).log(Level.SEVERE, null, ex);
        }

        String Str = null;//----------------------------------------------------�]��Str�r���ܼơA�ΨӱN�q�Ȥ�ݶǨӪ�����ର�r���(�Ȥ�ݸ�Ƭ�byte)
        while (true) {
            byte[] msg = new byte[5];//-----------------------------------------byte[] msg�ܼƥΨӦs�񤭭�byte�����A���ݸ�� �]���a�Ϫ���Ƥ@�ճ̤j��5byte

            try {
                receive.read(msg);//--------------------------------------------���ݱ������A���ǨӸ��
            } catch (IOException e)//-------------------------------------------�p�G�{���X���|���X
            {
                e.printStackTrace();//------------------------------------------�L�X���~�T��
            }
            Str = new String(msg);//--------------------------------------------�N���쪺�����^�r��
            str_array = Str.split(",");//---------------------------------------�N�r��H�r�������j��{�r��}�C

            //==================================================================�H�U�N�����쪺COST��J�}�C
            Distance_array[0] = Integer.parseInt(str_array[0]);//-----------------�N�ഫ�Ӫ��r����(���w��Int���A)�A�s��bCost���
            Distance_array[1] = Integer.parseInt(str_array[1]);
            Distance_array[2] = Integer.parseInt(str_array[2]);
            try {
            //==================================================================�N���쪺COST�Ǧ^Main.java �åB�ˬd�ݤ��ݭn��s
                Main.check(Distance_array, name);//------------------------------�����ƮɡA�n�z�L�D�{��Main.java��check�禡�ˬd�O�_���̤p���|�A�p�G���n�i���s
                                                //------------------------------ Check(Cost��, B�I��C�I)
            } catch (IOException ex) //-----------------------------------------�p�G�{���X���|���X
            {
                Logger.getLogger(Node2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
