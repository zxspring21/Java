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
			 System.out.print("�M��W��:"+name);
			 if(company!="")
			 System.out.print(" �ۤ����q:"+company);
			 if(singer!="")
			 System.out.print(" �q��m�W:"+singer);
			 if(publish_date!="")
			 System.out.print(" �o��~��:"+publish_date);
			 System.out.println(" �w��:"+price);
	}
}
public class a6 {
	public static void main(String args[])throws IOException{
	 BufferedReader buf=new BufferedReader
				(new InputStreamReader (System.in));
	 System.out.println("�п�J�����ɰۤ��ƶq:");
	 int num=Integer.parseInt(buf.readLine());
	 Album[][] a=new Album[num][4];
	 for(int i=0;i<num;i++){
		System.out.println("�п�J��"+(i+1)+"�i�ۤ���T:");
		System.out.println("�п�J�M��W��:");
			String name=buf.readLine();
		System.out.println("�п�J�ۤ����q:");
		    String company=buf.readLine();
		System.out.println("�п�J�q��m�W:");
			String singer=buf.readLine();
		System.out.println("�п�J�o��~��:");
			String publish_date=buf.readLine();
			a[i][0]= new Album(name);
			a[i][1]= new Album(name,company);
			a[i][2]= new Album(name,company,singer);
			a[i][3]= new Album(name,company,singer,publish_date);
			System.out.println("�п�J�w��:");
			int price=Integer.parseInt(buf.readLine());
			for(int k=0;k<4;k++){
			   a[i][k].setPrice(price) ;
			}
		
			
		
	 }
	 for(int i=0;i<num;i++){
		 if(i==0)
		 System.out.println("�t�Τ��Ҧ��ۤ���T:");
		 System.out.println("No"+(i+1)+".");
		 for(int k=0;k<4;k++)
		 a[i][k].show();
	 }
	
	}
}
