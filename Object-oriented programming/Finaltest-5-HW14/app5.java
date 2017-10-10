import java.io.*;
class Staff extends Member implements HealthInsurance 
{
   protected int seniority;
   public Staff(String name,String phone,int income,int seniority)
   {
      super(name,phone,income);
	  setSeniority(seniority);
	  
   }
   public int getAmount(int income)
   {
      return "�L��ú�ǰ��O�B�~�ɥR�t��";
   }
   public void setSeniority(int i)
   {
      if(i>0)
      seniority=i;
	  else
	  seniority=0;
   }
   public int getSeniorty()
   {
      return seniority;
   }
   public String getStaff()
   {
      if(seniority<1)
	     return "���q���u";
	  else if(seniority<3)
	     return "�Ʋժ�";
	  else if(seniority<6)
	     return "�ժ�";
	  else
	     return "�g�z";
   }
   public void showProfile()
   {
	   super.showProfile();
	   System.out.println("your seniority:"+getSeniorty()+",and you are "+getStaff()+"insurance"+getAmount(income));
	   
   }
   
}
class Student extends Member implements HealthInsurance 
{
   protected int grade;
   protected String major;
   public Student(String name,String phone,int income,int grade,String major)
   {
      super(name,phone,income);
	  setMajor(major);
	  setGrade(grade);
   }
   public int getAmount(int income)
   {
      return income*0.002;
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
	   System.out.println("your major:"+getMajor()+",and your grade:"+getGrade()+"insurance"+getAmount(income));
}
}
class Teacher extends Member implements HealthInsurance 
{
   protected String department;
   protected int seniority;
   public Teacher(String name,String phone,int income,String department,int seniority)
   {
      super(name,phone,income);
      setDepartment(department);
	  setSeniority(seniority);
      
   }
   public int getAmount(int income)
   {
      return income*seniority*0.002;
   }
   public void setDepartment(String str)
   {
      department=str;
   }
   public void setSeniority(int i)
   {
      if(i>0)
      seniority=i;
	  else
	  seniority=0;
   }
   public String getDepartment()
   {
      return department;
   }
   public int getSeniorty()
   {
      return seniority;
   }
   public void showProfile()
   {
	   super.showProfile();
	   System.out.println("your department:"+getDepartment()+",and your seniority:"+getSeniorty()+"insurance"+getAmount(income));
	   
   }
}
interface HealthInsurance 
{
   public int getAmount(int income);
   
}
public class app5{
	public static void main(String args[])throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
	  String name=null;
	  String phone=null;
	  int  income=0;
	  int seniority=0;  //�~��
	  int i;
	  
	 Member member=new member[3];
	  for(i=0;i<3;i++)
	  {
		  if(i=0)
		  System.out.println("�ǥ�\n*************");
		  if(i=1)
		  System.out.println("¾��\n*************");
		  if(i=2)
		  System.out.println("�Юv\n*************");
		  
		  System.out.println("�п�J�W�r");
			name=buf.readLine();
		  System.out.println("�п�J�q�ܡA�q�ܮ榡����XX-xxxxxxx,ex:07-1234567");
			phone=buf.readLine();
		  System.out.println("�п�J���J");
            income=Integer.parseInt(buf.readLine());	
		  if(i=0)
		  {
		  System.out.println("�п�J�D��");
	      major=buf.readLine();
		  student.setMajor(major);
	      System.out.println("�п�J�~��");
	      grade=Integer.parseInt(buf.readLine());
		  student.setGrade(grade);
		  member[0]=new Student(name,phone,income,grade,major);
		  }
		  if(i=1)
		  {
		  System.out.println("�п�J����");
	      department=buf.readLine();
	      System.out.println("�п�J�~��");
	      seniority=Integer.parseInt(buf.readLine());
		  member[1]=new Teacher(name,phone,income,department,seniority);
		  }
		  if(i=2)
		  {
	      System.out.println("�п�J�A���~��");
	      seniority=Integer.parseInt(buf.readLine());
		  member[2]=new Staff(name,phone,income,seniority);
		  }
	  }
	  int j;
	  for (j=0;j<3; j++ )
	  {
         output += "\nMember " + j + " is a " +
            member[j].showProfile();
	  }			
   }
}