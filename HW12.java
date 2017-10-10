import java.io.*;
class Album{
	Album(){
	}
	String name;
	String company;
	String singer;
	String publish_date;
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
			 System.out.println("專輯名稱:"+name);
			 System.out.println("唱片公司:"+company);
			 System.out.println("歌手姓名:"+singer);
			 System.out.println("發行年份:"+publish_date);
			 System.out.println("定價:"+price);
	}
}
public class a5 {
	public static void main(String args[])throws IOException{
	 BufferedReader buf=new BufferedReader
				(new InputStreamReader (System.in));
	 System.out.println("請輸入欲建檔唱片數量:");
	 int num=Integer.parseInt(buf.readLine());
	 Album[] a=new Album[num];
	 for(int i=0;i<num;i++){
		a[i]= new Album();
		System.out.println("請輸入第"+(i+1)+"張唱片資訊:");
		System.out.println("請輸入專輯名稱:");
		  a[i].setName(buf.readLine());
		System.out.println("請輸入唱片公司:");
		  a[i].setCompany (buf.readLine()) ;
		System.out.println("請輸入歌手姓名:");
		  a[i].setSinger(buf.readLine());
		System.out.println("請輸入發行年份:");
		  a[i].setPublishDate(buf.readLine()) ;
		System.out.println("請輸入定價:");
		  a[i].setPrice(Integer.parseInt(buf.readLine())) ;
	 }
	 for(int i=0;i<num;i++){
		 if(i==0)
		 System.out.println("系統內所有唱片資訊:");
		 System.out.println("No"+(i+1)+".");
		 a[i].show();
	 }
	
	}
}
