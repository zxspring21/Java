import java.io.*;
public class a14_1{
   public static void main (String[] args ) throws IOException
   {
		int i;
		do
		{
			i=1;
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
			System.out.println( );
			i=0;
			}
			finally
			{
			if(i==1)
			System.out.println("�{������");
			}
		
		}while(i==0);
	}
}