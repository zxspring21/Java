

public class hw2
 {
    public static void main(String args[]) 
   {
     int i =3 ; 
     System.out.print("oringinal i is "); 
     System.out.println(i);
      
     i = 4; // 4 �OInteger Literal 
     System.out.printf("i was changed to %d\n\n",i); //Java 1.5�_�]�䴩printf() 
     
     final int j = 3;  // j�Q�ŧi���`��
     System.out.print("oringinal j is "); 
     System.out.println(j); 
     System.out.printf("j was changed to %d\n\n",j); 

     int a1 = 100;  //�i����,�S���D
     long n1 = a1;  //�i����,al�|���Q�૬��long
     long n2 = 100; //�i����,100�t�ιw�]�Oint,�|�Q�૬��long
     int a2 = (int)n2;  //n2�Olong���O,�ҥH�j��O�ഫ��int,�i��y����Ƭy��
      
     int a3 = (int)123.23;   //�i����,123.23�t�ιw�]double�|�ഫ��int���O��123,��Ƭy��
     int a4 = (int)123.23F;  //�i����,123.23�t�ιw�]float�|�ഫ��int���O��123,��Ƭy��
     byte a5 = 'A';          //�i����,a5=65

     float d = 123.3F;    //123.3�t�ιw�]double,�ҥH���j��O�ഫ��float
     a1 = a1 + (int)d;        //d�����j���ഫ��int���A
     a1 += d;           // �i����,����Ƭy��
 
     a2 = 123;      //"123"�O�r��,�h�����޸��ܾ�� 
     a2 = (int)123; //"123"�O�r��,�h�����޸��ܾ��
     a2 = Integer.parseInt( "123" ); //�Q��Integer����̪���k�N�r������ 
   } 
}