import java.io.*;
public class a14_2{
   public static void main (String[] args ) throws IOException
   {
	try{
		int a;
		BufferedReader buf =new BufferedReader (new InputStreamReader 
		(System.in));
		System.out.println("�п�J�z���~��:");
		a = Integer.parseInt(buf.readLine());
		System.out.println("�z���~�֬�:"+a);  
	}
	catch(NumberFormatException l)
	{
	System.out.println("�z��J�����O�Ʀr�A�Э��s��J�G");
	System.out.println(l);
	}
	finally
	{
	System.out.println("�{������");
	}
	}
}