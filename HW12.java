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
			 System.out.println("�M��W��:"+name);
			 System.out.println("�ۤ����q:"+company);
			 System.out.println("�q��m�W:"+singer);
			 System.out.println("�o��~��:"+publish_date);
			 System.out.println("�w��:"+price);
	}
}
public class a5 {
	public static void main(String args[])throws IOException{
	 BufferedReader buf=new BufferedReader
				(new InputStreamReader (System.in));
	 System.out.println("�п�J�����ɰۤ��ƶq:");
	 int num=Integer.parseInt(buf.readLine());
	 Album[] a=new Album[num];
	 for(int i=0;i<num;i++){
		a[i]= new Album();
		System.out.println("�п�J��"+(i+1)+"�i�ۤ���T:");
		System.out.println("�п�J�M��W��:");
		  a[i].setName(buf.readLine());
		System.out.println("�п�J�ۤ����q:");
		  a[i].setCompany (buf.readLine()) ;
		System.out.println("�п�J�q��m�W:");
		  a[i].setSinger(buf.readLine());
		System.out.println("�п�J�o��~��:");
		  a[i].setPublishDate(buf.readLine()) ;
		System.out.println("�п�J�w��:");
		  a[i].setPrice(Integer.parseInt(buf.readLine())) ;
	 }
	 for(int i=0;i<num;i++){
		 if(i==0)
		 System.out.println("�t�Τ��Ҧ��ۤ���T:");
		 System.out.println("No"+(i+1)+".");
		 a[i].show();
	 }
	
	}
}
