

public class hw2
 {
    public static void main(String args[]) 
   {
     int i =3 ; 
     System.out.print("oringinal i is "); 
     System.out.println(i);
      
     i = 4; // 4 是Integer Literal 
     System.out.printf("i was changed to %d\n\n",i); //Java 1.5起也支援printf() 
     
     final int j = 3;  // j被宣告為常數
     System.out.print("oringinal j is "); 
     System.out.println(j); 
     System.out.printf("j was changed to %d\n\n",j); 

     int a1 = 100;  //可執行,沒問題
     long n1 = a1;  //可執行,al會先被轉型成long
     long n2 = 100; //可執行,100系統預設是int,會被轉型成long
     int a2 = (int)n2;  //n2是long型別,所以強制型別轉換成int,可能造成資料流失
      
     int a3 = (int)123.23;   //可執行,123.23系統預設double會轉換成int型別的123,資料流失
     int a4 = (int)123.23F;  //可執行,123.23系統預設float會轉換成int型別的123,資料流失
     byte a5 = 'A';          //可執行,a5=65

     float d = 123.3F;    //123.3系統預設double,所以須強制型別轉換成float
     a1 = a1 + (int)d;        //d必須強制轉換成int型態
     a1 += d;           // 可執行,但資料流失
 
     a2 = 123;      //"123"是字串,去掉雙引號變整數 
     a2 = (int)123; //"123"是字串,去掉雙引號變整數
     a2 = Integer.parseInt( "123" ); //利用Integer物件裡的方法將字串轉整數 
   } 
}