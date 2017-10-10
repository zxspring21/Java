public class Date
{
   private int day;
   private int month;
   private int year;
   public Date(int day,int month,int year)
   {
      setbirthDate(day,month,year);
	  setmonth(month);
	  setyear(year);
   }
   public void setbirthDate(int day,int month,int year)
   {
      if(month==2 && day==29 && (year%400==0)||year%4==0&&year%100!=0){
	     setday(day);		 		 
	  }
	  if(((month%2==1)&&(month<8))||(month==8)||((month%2==0)&&(month>8))){
	     setday(day);
	  }
	  else if(month==2 && day==28 && !(year%400==0)||year%4==0&&year%100!=0){
	     setday(day);
	  }
	  else{
	     setday(day);
	  }
   }
   public void setday(int day)
   {
      this.day=day;
   }
   public void setmonth(int month)
   {
      if(month<13&&month>0)
	  {
	  this.month=month;
	  }
   }
   public void setyear(int year)
   {
      this.year=year;
   }
}
