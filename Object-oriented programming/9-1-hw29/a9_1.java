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
	  System.out.println("bmi :"+bmii+"(�L��)");
	  else if(bmi<24.5)
	  System.out.println("bmi :"+bmii+"(���`)");
	  else 
	  System.out.println("bmi :"+bmii+"(�L��)");   
	  
	  
   }
   public void showProfile()
   {
      super.showProfile();
	  System.out.println("�ʧO:"+this.gender);
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
      Teacher a=new Teacher("101","�ɱЬ�","�c�f޳","19","�k��",167,70);
      Teacher b=new Teacher("101121231","�Ʋz��","���p�f","40","�k��",177,70);
      Teacher c=new Teacher("123456","�}�p�{��","�q��","25","�k��",190,65);
	  a.showProfile();
	  b.showProfile();
	  c.showProfile();
   }
}