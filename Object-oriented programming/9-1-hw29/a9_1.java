import java.io.*;
import java.lang.Math.*;

class Teacher extends Person
{
   private String id;
   private String department;
   private double bmi;
   private String gender;
   public Teacher(String id,String department,String name,String age,String gender,int height,int weight)
   {
      super(name,age,height,weight);
	  this.id=id;
      this.department=department;
	  this.gender=gender;
	  this.calcBmi();
   }
   public void calcBmi()
   {
      bmi=(double)getWeight()/((double)getHeight()/100*(double)getHeight()/100);
	  String bmii=(String.valueOf(this.bmi)).substring(0,5);
	  if(bmi<18.5)
	  System.out.println("bmi :"+bmii+"(過輕)");
	  else if(bmi<24.5)
	  System.out.println("bmi :"+bmii+"(正常)");
	  else 
	  System.out.println("bmi :"+bmii+"(過重)");   
	  
	  
   }
   public void showProfile()
   {
      super.showProfile();
	  System.out.println("性別:"+this.gender);
	  System.out.println(" id :"+this.id);
	  System.out.println("department:"+this.department);
      this.calcBmi();
	  System.out.println("**************");
	  
	 
   }
   
}
public class a9_1
{
   public static void main(String[] args)throws IOException
   {
      Teacher a=new Teacher("101","補教界","盧柏瑋","19","男生",167,70);
      Teacher b=new Teacher("101121231","料理界","黃小妹","40","女生",177,70);
      Teacher c=new Teacher("123456","開計程車","郝帥","25","男生",190,65);
	  a.showProfile();
	  b.showProfile();
	  c.showProfile();
   }
}