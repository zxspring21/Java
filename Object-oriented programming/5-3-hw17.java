import java.io.*;
public class app3 {
	public static void main(String[] args)throws IOException
	{
	      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("輸入學生人數:");
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
		    System.out.printf("輸入第%d個學生成績=",i+1);
		    String str=buf.readLine();
			int num2=Integer.parseInt(str);
			str2[i]=num2;
		    }
		    showgrade(str2);
	}
	
	public static void showgrade(int str2[])throws IOException
	{
	   int i;
	   for(i=0;i<str2.length;i++)
	   {
		  System.out.printf("第%d個學生成績為%d\n",i+1,str2[i]);
	   }
	}
	
}
