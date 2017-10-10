import java.io.*;
public class a14_2{
   public static void main (String[] args ) throws IOException
   {
	try{
		int a;
		BufferedReader buf =new BufferedReader (new InputStreamReader 
		(System.in));
		System.out.println("請輸入您的年齡:");
		a = Integer.parseInt(buf.readLine());
		System.out.println("您的年齡為:"+a);  
	}
	catch(NumberFormatException l)
	{
	System.out.println("您輸入的不是數字，請重新輸入：");
	System.out.println(l);
	}
	finally
	{
	System.out.println("程式結束");
	}
	}
}