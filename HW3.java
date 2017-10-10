package hw3;
import java.io.*;
public class app3 {
   private String name;
   private String number;
   private int birth_date=0;
   private int birth_month=0;
   private int birth_year=0;
	app3(){
   }
	void setName(String name){
		this.name=name;
	}
	void setNumber(String number){
		this.number=number;
	}
	void setDate(int date){
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
	int getYear(){
		return birth_year;
	}
	int getDate(){
		return birth_date;
	}
	String getName(){
		return name;
	}
   public static void main(String args[])throws IOException{
	   BufferedReader buf=new BufferedReader(new 
			   InputStreamReader(System.in));
	   System.out.println("請輸入你要輸入幾筆朋友資料:");
	   int n=Integer.parseInt(buf.readLine());
	   app3[] a=new app3[n];
	   int k=0;//計算比使用者年齡還大的人數
	   String str1=new String("");
	   
	   for(int i=0;i<=n;i++){
		  if(n==0)
			 str1+="使用者自身";
	      System.out.println("請輸入"+str1+"姓名:");
		     a[i].setName(buf.readLine());
	      System.out.println("請輸入"+str1+"學號:");
	   	     a[i].setNumber(buf.readLine());
	      System.out.println("請輸入"+str1+"出生年份:");
	         a[i].setYear(Integer.parseInt(buf.readLine()));
	      System.out.println("請輸入"+str1+"出生月份:");
	         a[i].setMonth(Integer.parseInt(buf.readLine()));
	      System.out.println("請輸入"+str1+"出生日:");
	         a[i].setDate(Integer.parseInt(buf.readLine()));
	   
	   }
	   for(int i=1;i<=n;i++){
	      if((a[i].getYear())>=(a[0].getYear())){
	         if((a[i].getMonth())>=(a[0].getMonth())){
	        	if((a[i].getDate())>=(a[0].getDate())){
	        	   k++;	
	        	}
	         }
	         
	      }
	   }
	  
	   String[] str=new String[50]; //儲存每月壽星
	   for(int h=0;h<50;h++)
 		  str[h]="";
 	   for(int i=1;i<=n;i++){
	      for(int b=1;b<=12;b++){
	    	  if(a[i].getMonth()==b){
	    		  str[i]+=a[i].getName()+" ";
	    	  }
	      }
	   }
	   //印出每一月份壽星
	   for(int b=1;b<=12;b++){
		   for(int i=1;i<=n;i++){
		       if(str[i]=="")
		    	   str[i]="無";
		       else
			   System.out.println(b+"月壽星:"+str[i]);
		   
		   }
	   }
   }
}
