import java.io.*;

class Teacher extends Member
{
   protected String department;
   protected int seniority;
   public Teacher(String name,String phone,int income,String department,int seniority)
   {
      super(name,phone,income);
      setDepartment(department);
	  setSeniority(seniority);
      
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
	   System.out.println("your department:"+getDepartment()+",and your seniority:"+getSeniorty());
	   
   }
}
public class app2{
	public static void main(String args[])throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
	  String name=null;
	  String phone=null;
	  int  income=0;
	  
      String department=null;
	  int seniority=0;  //年資
	  System.out.println("請輸入部門");
	    department=buf.readLine();
	  System.out.println("請輸入年資");
	    seniority=Integer.parseInt(buf.readLine());
	  Teacher teacher=new Teacher(name,phone,income,department,seniority);
	  
	  teacher.showProfile();
   }
}