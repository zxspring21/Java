package hw2;
import java.io.*;
public class app2 {
   private String name;
   private String number;
   private int birth_date;
   private int birth_month;
   private int birth_year;
	app2(){
   }
	void setName(String name){
		this.name=name;
	}
	void setNumber(String number){
		if(number.length()==10)
		this.number=number;
	}
	void setDate(int date){
	   birth_date=0;   
	if(getMonth()<=7){
		if(getMonth()%2!=0){
		   if((date<32)&&(date>0)){   
			   birth_date=date;
		   }
		}
		else{
			if((date<31)&&(date>0)){
			   birth_date=date;	
			}
		}
	}
	else{
		if(getMonth()%2!=1){
			   if((date<32)&&(date>0)){   
				   birth_date=date;
			   }
			}
			else{
				if((date<31)&&(date>0)){
				   birth_date=date;	
				}
			}
	}
			
	}
	void setMonth(int month){
		if((month>0)&&(month<13)){
		   birth_month=month;
		}
	}
	void setYear(int year){
		birth_year=year;
	}
	int getMonth(){
		return birth_month;
	}
   public static void main(String args[])throws IOException{
	   BufferedReader buf=new BufferedReader(new 
			   InputStreamReader(System.in));
	   app2 a=new app2();
	   System.out.println("請輸入姓名:");
	      a.setName(buf.readLine());
	   System.out.println("請輸入學號:");
	   	  a.setNumber(buf.readLine());
	   System.out.println("請輸入出生年份:");
	      a.setYear(Integer.parseInt(buf.readLine()));
	   System.out.println("請輸入出生月份:");
	      a.setMonth(Integer.parseInt(buf.readLine()));
	   System.out.println("請輸入出生日:");
	      a.setDate(Integer.parseInt(buf.readLine()));
	   
   }
}
