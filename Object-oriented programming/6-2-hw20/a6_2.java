import java.io.*;
import java.util.*;

public class a6_2
{
    static void funca(int g[],int num)
    {
	System.out.println("  ****************排序****************");
	int i;
	Arrays.sort(g);	 	
        int j;
	for(i=0;i<num;i++)
     	   System.out.println("第"+(i+1)+"名   成績"+g[num-i-1]);
   }
   static void funcb(int g1[],int num,int search)
   {
          System.out.println("  ****************查詢***************");
          int i;
          int flag=0;
	  for(i=0;i<5;i++)
	  {
	     if(search==g1[i])
	     {
             System.out.println("找到了! 為第"+(i+1)+"個同學的成績");
	     flag=1;  } 
	  }
	  if(flag==0)
	  System.out.println("沒找到");
   }
   public static void main(String[] args)throws IOException
   {
      System.out.println("輸入學生人數");
	  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	  String str=buf.readLine();
	  int num=Integer.parseInt(str);
	  int g[]=new int[num];
	  int g1[]=new int[num];  //為了查詢成績，不被排序功能所影響保持的原陣列
	  
	  int i;
	  for(i=0;i<num;i++)
	  {   
	    System.out.println("輸入第"+(i+1)+"個的學生成績");
	    g[i]=Integer.parseInt(buf.readLine());
	    g1[i]=g[i];
	  }
	  
	  char in='2';
	  while(in=='2')
	  {
	    System.out.println("請輸入你要的功能(1)排序(2)查詢成績");
          
	    int fun=Integer.parseInt(buf.readLine());
	    if(fun==1)
               funca(g,num);
	    else if(fun==2)
	    {
	       System.out.println("請輸入你要查詢的值:");
	       int search=Integer.parseInt(buf.readLine());
               funcb(g1,num,search);  }
	    else
	    {
	       System.out.println("重新輸入");
               continue;  }
	    System.out.println("是否離開 (1)是 (2)不是");
	    String input=buf.readLine();
            in=input.charAt(0);
            if(in=='1')
            {System.out.println("程式結束");break;}
	    
          }
	  
   }   
}