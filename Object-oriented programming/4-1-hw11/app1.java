import java.io.*;
public class app1
{
   public static void main (String[] args ) throws IOException
   {
	
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入學生數");
	String str=buf.readLine();
	int num=Integer.parseInt(str);

	int a[]=new int[num];
	
	
	for(int i=0;i<num;i++)
 	{
       	   System.out.printf("輸入第%d個學生的成績：\n",i+1);
  	   a[i]=Integer.parseInt(buf.readLine());
	   System.out.printf("a[%d]=%d\n",i,a[i]);
	}
	for(int i=0;i<num;i++)
	System.out.printf("a[%d]=%d\n",i,a[i]);
   }
}