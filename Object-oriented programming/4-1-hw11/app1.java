import java.io.*;
public class app1
{
   public static void main (String[] args ) throws IOException
   {
	
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�ǥͼ�");
	String str=buf.readLine();
	int num=Integer.parseInt(str);

	int a[]=new int[num];
	
	
	for(int i=0;i<num;i++)
 	{
       	   System.out.printf("��J��%d�Ӿǥͪ����Z�G\n",i+1);
  	   a[i]=Integer.parseInt(buf.readLine());
	   System.out.printf("a[%d]=%d\n",i,a[i]);
	}
	for(int i=0;i<num;i++)
	System.out.printf("a[%d]=%d\n",i,a[i]);
   }
}