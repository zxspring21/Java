import java.io.*;
import java.util.*;

class Book 
{
	   private String titl;
	   private String publisher;
	   private String author;
	   private String publishDate;
	   private int money;
	   
	   Book(String s)
	   {
		   titl=s;
	   }
	   Book(String s,String a)
	   {
		   titl=s;
		   publisher=a;
	   }
	   Book(String s,String a,String p)
	   {
		   titl=s;
		   publisher=a;
		   author=p;
	   
	   }
	   Book(String s,String a,String p,String d)
	   {
		   titl=s;
		   publisher=a;
		   author=p;
		   publishDate=d;
	   }
	   Book(String s,String a,String p,String d,int e)
	   {
		   titl=s;
		   publisher=a;
		   author=p;
		   publishDate=d;
		   if(e>0)
			   money=e;
			   else
				   e=0;money=e;
		  
	   }
	   public int show()
	   {
		   System.out.println("�ѦW"+titl+"�X����"+publisher+"�@��"+author+"�X�����"+publishDate+"����"+money);
		   return 0;
	   }
}

public class app3 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader
				   (new InputStreamReader(System.in));
		
		System.out.println("��J�ѦW,��J�X����.��J�X����,��J�X�����,��J����");
	   Book book1=new Book(buf.readLine());
	   Book book2=new Book(buf.readLine(),buf.readLine());
	   Book book3=new Book(buf.readLine(),buf.readLine(),buf.readLine());
	   Book book4=new Book(buf.readLine(),buf.readLine(),buf.readLine(),buf.readLine());
	   Book book5=new Book(buf.readLine(),buf.readLine(),buf.readLine(),buf.readLine(),buf.readLine());
	   
	  
       book.show();
	}
}
