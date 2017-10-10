import java.io.*;
public class app3
{
   public static void main (String[] args ) throws IOException
   {
	
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("輸入學生數");
	String str=buf.readLine();
	int num=Integer.parseInt(str);

	int a[]=new int[num];
	int b[]=new int[10];

	int m;
	for(int i=0;i<num;i++)
 	{
       	   System.out.printf("輸入第%d個學生的成績：\n",i+1);
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
	System.out.printf("%d~%d有%d個\n",1+m*10,(m+1)*10,b[m]);
	
	
	
	  
	
}
}