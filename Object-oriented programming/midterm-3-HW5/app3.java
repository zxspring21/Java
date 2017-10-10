import java.io.*;
import java.util.*;

class Book 
{
	   private String titl;
	   private String publisher;
	   private String author;
	   private String publishDate;
	   private int money;
	   
	   public int setTitle(String s)
	   {
		   titl=s;
		   return 0;
	   }
	   public int setPublisher(String s)
	   {
		   publisher=s;
		   return 0;
	   }
	   public int setAuthor(String s)
	   {
		   author=s;
		   return 0;
	   }
	   public int setPublishDate(String s)
	   {
		   publishDate=s;
		   return 0;
	   
	   }
	   public int setMoney(int v)
	   {
		   if(v>0)
		   money=v;
		   else
			   v=0;money=v;
		   return 0;
	   }
	   public int show()
	   {
		   System.out.println("書名"+titl+"出版商"+publisher+"作者"+author+"出版日期"+publishDate+"價格"+money);
		   return 0;
	   }
}

public class app3 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader
				   (new InputStreamReader(System.in));
		
		
	   Book book=new Book();
	   System.out.println("輸入書名");
       book.setTitle(buf.readLine());
	   System.out.println("輸入出版商");
       book.setPublisher(buf.readLine());
	   System.out.println("輸入作者");
       book.setAuthor(buf.readLine());
	   System.out.println("輸入出版日期");
       book.setPublishDate(buf.readLine());
	   System.out.println("輸入價格");
       book.setMoney(Integer.parseInt(buf.readLine()));
       book.show();
	}
}
