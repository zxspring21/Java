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
	   System.out.println("�п�J�A�n��J�X���B�͸��:");
	   int n=Integer.parseInt(buf.readLine());
	   app3[] a=new app3[n];
	   int k=0;//�p���ϥΪ̦~���٤j���H��
	   String str1=new String("");
	   
	   for(int i=0;i<=n;i++){
		  if(n==0)
			 str1+="�ϥΪ̦ۨ�";
	      System.out.println("�п�J"+str1+"�m�W:");
		     a[i].setName(buf.readLine());
	      System.out.println("�п�J"+str1+"�Ǹ�:");
	   	     a[i].setNumber(buf.readLine());
	      System.out.println("�п�J"+str1+"�X�ͦ~��:");
	         a[i].setYear(Integer.parseInt(buf.readLine()));
	      System.out.println("�п�J"+str1+"�X�ͤ��:");
	         a[i].setMonth(Integer.parseInt(buf.readLine()));
	      System.out.println("�п�J"+str1+"�X�ͤ�:");
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
	  
	   String[] str=new String[50]; //�x�s�C��جP
	   for(int h=0;h<50;h++)
 		  str[h]="";
 	   for(int i=1;i<=n;i++){
	      for(int b=1;b<=12;b++){
	    	  if(a[i].getMonth()==b){
	    		  str[i]+=a[i].getName()+" ";
	    	  }
	      }
	   }
	   //�L�X�C�@����جP
	   for(int b=1;b<=12;b++){
		   for(int i=1;i<=n;i++){
		       if(str[i]=="")
		    	   str[i]="�L";
		       else
			   System.out.println(b+"��جP:"+str[i]);
		   
		   }
	   }
   }
}
