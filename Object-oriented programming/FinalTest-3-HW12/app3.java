import java.io.*;
abstract class Member
{
   protected String name;
   protected String phone;
   protected int income;
   
   protected Member(String name,String phone,int income){
      setName(name);
	  setPhone(phone);
	  setIncome(income);
   }
   public void setName(String str){
      name=str;
   }
   public void setPhone(String str){
      
	  if(str.indexOf("-")==2)
	     phone=str;
	  else 
	     phone=null;
   }
   public void setIncome(int i){
      if(i>0)
	     income=i;
	  else 
	     income=0;
   }
   public String getName(){
      return name;
   }
   public String getPhone(){
      return phone;
   }
   public int getIncome(){
      return income;
   }
   public void showProfile(){
      System.out.println("your name:"+getName()+",and your phone:"+getPhone()+",and your income:"+getIncome());
   }
}
class Student extends Member
{
   protected int grade;
   protected String major;
   public Student(String name,String phone,int income,int grade,String major)
   {
      super(name,phone,income);
	  setMajor(major);
	  setGrade(grade);
   }
   public void setMajor(String str)
   {
      major=str;
   }
   public void setGrade(int i)
   {
      grade=i;
   }
   public String getMajor()
   {
      return major;
   }
   public int getGrade()
   {
      return grade;
   }
   public void showProfile()
   {
	   super.showProfile();
	   System.out.println("your major:"+getMajor()+",and your grade:"+getGrade());
}
}
public class app3{
	public static void main(String args[])throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
	  String name=null;
	  String phone=null;
	  int  income=0;
	  String major=null;
	  int grade=0;
	  
	  System.out.println("�п�J�W�r");
	    name=buf.readLine();
	  System.out.println("�п�J�q�ܡA�q�ܮ榡����XX-xxxxxxx,ex:07-1234567");
	    phone=buf.readLine();
	  System.out.println("�п�J���J");
        income=Integer.parseInt(buf.readLine());	  
	  Student student=new Student(name,phone,income,grade,major);
	  
      System.out.println("�п�J�D��");
	     major=buf.readLine();
		 student.setMajor(major);
	  System.out.println("�п�J�~��");
	     grade=Integer.parseInt(buf.readLine());
		 student.setGrade(grade);
      student.showProfile();
   }
}