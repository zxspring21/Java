import java.io.*;
import java.util.*;

public class a6_2
{
    static void funca(int g[],int num)
    {
	System.out.println("  ****************�Ƨ�****************");
	int i;
	Arrays.sort(g);	 	
        int j;
	for(i=0;i<num;i++)
     	   System.out.println("��"+(i+1)+"�W   ���Z"+g[num-i-1]);
   }
   static void funcb(int g1[],int num,int search)
   {
          System.out.println("  ****************�d��***************");
          int i;
          int flag=0;
	  for(i=0;i<5;i++)
	  {
	     if(search==g1[i])
	     {
             System.out.println("���F! ����"+(i+1)+"�ӦP�Ǫ����Z");
	     flag=1;  } 
	  }
	  if(flag==0)
	  System.out.println("�S���");
   }
   public static void main(String[] args)throws IOException
   {
      System.out.println("��J�ǥͤH��");
	  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	  String str=buf.readLine();
	  int num=Integer.parseInt(str);
	  int g[]=new int[num];
	  int g1[]=new int[num];  //���F�d�ߦ��Z�A���Q�Ƨǥ\��Ҽv�T�O������}�C
	  
	  int i;
	  for(i=0;i<num;i++)
	  {   
	    System.out.println("��J��"+(i+1)+"�Ӫ��ǥͦ��Z");
	    g[i]=Integer.parseInt(buf.readLine());
	    g1[i]=g[i];
	  }
	  
	  char in='2';
	  while(in=='2')
	  {
	    System.out.println("�п�J�A�n���\��(1)�Ƨ�(2)�d�ߦ��Z");
          
	    int fun=Integer.parseInt(buf.readLine());
	    if(fun==1)
               funca(g,num);
	    else if(fun==2)
	    {
	       System.out.println("�п�J�A�n�d�ߪ���:");
	       int search=Integer.parseInt(buf.readLine());
               funcb(g1,num,search);  }
	    else
	    {
	       System.out.println("���s��J");
               continue;  }
	    System.out.println("�O�_���} (1)�O (2)���O");
	    String input=buf.readLine();
            in=input.charAt(0);
            if(in=='1')
            {System.out.println("�{������");break;}
	    
          }
	  
   }   
}