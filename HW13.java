import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Album{
	String name="";
	String company="";
	String singer="";
	String publish_date="";
	Album(String name){
		this.name=name;
	}
	Album(String name,String company){
		this.name=name;
		this.company=company;
	}
	Album(String name,String company,String singer){
		this.name=name;
		this.company=company;
		this.singer=singer;
	}
	Album(String name,String company,String singer,String publish_date){
		this.name=name;
		this.company=company;
		this.singer=singer;
		this.publish_date=publish_date;
		
	}
	
	int price;
	public void setName(String name){
		this.name=name;
	}
	public void setCompany (String company){
		this.company=company;
	}
	public void setSinger(String singer){
		this.singer=singer;
	}
	public void setPublishDate(String publish_date){
		this.publish_date=publish_date;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void show(){
			 if(name!="")
			 System.out.print("專輯名稱:"+name);
			 if(company!="")
			 System.out.print(" 唱片公司:"+company);
			 if(singer!="")
			 System.out.print(" 歌手姓名:"+singer);
			 if(publish_date!="")
			 System.out.print(" 發行年份:"+publish_date);
			 System.out.println(" 定價:"+price);
	}
}
public class a6 {
	public static void main(String args[])throws IOException{
	 BufferedReader buf=new BufferedReader
				(new InputStreamReader (System.in));
	 System.out.println("請輸入欲建檔唱片數量:");
	 int num=Integer.parseInt(buf.readLine());
	 Album[][] a=new Album[num][4];
	 for(int i=0;i<num;i++){
		System.out.println("請輸入第"+(i+1)+"張唱片資訊:");
		System.out.println("請輸入專輯名稱:");
			String name=buf.readLine();
		System.out.println("請輸入唱片公司:");
		    String company=buf.readLine();
		System.out.println("請輸入歌手姓名:");
			String singer=buf.readLine();
		System.out.println("請輸入發行年份:");
			String publish_date=buf.readLine();
			a[i][0]= new Album(name);
			a[i][1]= new Album(name,company);
			a[i][2]= new Album(name,company,singer);
			a[i][3]= new Album(name,company,singer,publish_date);
			System.out.println("請輸入定價:");
			int price=Integer.parseInt(buf.readLine());
			for(int k=0;k<4;k++){
			   a[i][k].setPrice(price) ;
			}
		
			
		
	 }
	 for(int i=0;i<num;i++){
		 if(i==0)
		 System.out.println("系統內所有唱片資訊:");
		 System.out.println("No"+(i+1)+".");
		 for(int k=0;k<4;k++)
		 a[i][k].show();
	 }
	
	}
}
