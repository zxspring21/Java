import java.io.*;
import java.util.*;
abstract class bank
{
   private int money;
   private int year,month,day;
   private double interest,total;
   void settotal(double total)
   {
      this.total=total;
   }
   double gettotal()
   {
      return total;
   }
   void setinterest(double interest)
   {
      this.interest=interest;
   }
   double getinterest()
   {  
      return interest;
   }
   void setdate(int year,int month,int day)
   {
      if(year>0)
	     this.year=year;
	  else
	     year=1;
	  if((month>0)&&(month<13))
	     this.month=month;
	  else 
	     month=1;
	  if((day>0)&&(day<32))
	     this.day=day;
	  else 
	     day=1;
   }
   int getmonth()
   {
      return month;
   } 
   void setmoney(int money)
   {
      this.money=money;
   }
   int getmoney()
   {
      return money;
   }
   public abstract double deposit();
   public abstract int calc();   
}
class citibank extends bank
{
   public double deposit()
   {
      double total;
      total=(double)getmoney()*getinterest()+getmoney();
	  return total;
	  
   }
   public int calc()
   {

      Date date=new Date();
	  Calendar rightNow = Calendar.getInstance();
	  
	  int time=rightNow.get(Calendar.MONTH)+1-getmonth();
	  if(time<3)        setinterest(0.015);
      else if(time<6)   setinterest(0.02);
      else if(time<13)  setinterest(0.03);
	  return time;
   }
}
class standard extends bank
{
   public double deposit()
   {
      double total;
      total=(double)getmoney()*getinterest()+getmoney();
	  return total;
   }
   public int calc()
   {
      double interset;
	  
      Date date=new Date();
	  Calendar rightNow = Calendar.getInstance();
	  int time=rightNow.get(Calendar.MONTH)+1-getmonth();
	  if(time<4)       setinterest(0.015);
      else if(time<6)  setinterest(0.03);
      else if(time<13) setinterest(0.04);
      
      return time;
   }
}
class a11_1
{
   public static void main(String[] args)throws IOException
   {
      BufferedReader input=
         new BufferedReader(new InputStreamReader(System.in));
		 
      Date date=new Date();
	  Calendar rightNow = Calendar.getInstance();
	  citibank firstaccount=new citibank();
	  standard secondaccount=new standard();
	  firstaccount.setdate(2012,5,1);
	  secondaccount.setdate(2012,5,1);
	  firstaccount.setmoney(20000);
	  secondaccount.setmoney(20000);
	  System.out.println("您一開始存入citibank的金額是20000元，經過了"+firstaccount.calc()+"個月後，你的金額為："+firstaccount.deposit());
	  
	  System.out.println("您一開始存入standard的金額是20000元，經過了"+ secondaccount.calc()+"個月後，你的金額為："+secondaccount.deposit());
   }
}