import java.io.*;
public class app3
{
   public static void main (String[] args ) throws IOException
   {
	
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("��J�ǥͼ�");
	String str=buf.readLine();
	int num=Integer.parseInt(str);

	int a[]=new int[num];
	int b[]=new int[10];

	int m;
	for(int i=0;i<num;i++)
 	{
       	   System.out.printf("��J��%d�Ӿǥͪ����Z�G\n",i+1);
  	   a[i]=Integer.parseInt(buf.readLine());
	   System.out.printf("a[%d]=%d\n",i,a[i]);
	}

	for(int i=0;i<num;i++)
	{
	m=a[i]/10;	   
	b[m]++;
	System.out.printf("a[%d]=%d\n",i,a[i]);
	}
	for(m=0;m<10;m++)
	System.out.printf("%d~%d��%d��\n",1+m*10,(m+1)*10,b[m]);
	
	
	
	  
	
}
}