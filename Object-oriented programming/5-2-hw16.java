import java.io.*;
public class app2
{
	public static void main(String[] args)throws IOException
	{
	      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("��J�ǥͤH��:");
	      String str1=buf.readLine();
	      int num1=Integer.parseInt(str1);
	      grade(num1);
	}
	public static void grade(int num1)throws IOException
	{
			int [] str2=new int[num1];
		    int i;
			for(i=0;i<str2.length;i++)
		    {
		    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		    System.out.printf("��J��%d�Ӿǥͦ��Z=",i+1);
		    String str=buf.readLine();
			int num2=Integer.parseInt(str);
			str2[i]=num2;
		    }
		    System.out.printf("\n\n�@��J%d�Ӿǥͦ��Z",i);
	}
	
}
