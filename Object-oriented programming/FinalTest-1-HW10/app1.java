import java.io.*;
class Member
{
   protected String name;
   protected String phone;
   protected int income;
   
   protected Member(String name,String phone,int income)
   {
      setName(name);
	  setPhone(phone);
	  setIncome(income);
   }
   public void setName(String str)
   {
      name=str;
   }
   public void setPhone(String str)
   {
      phone=str;
   }
   public void setIncome(int i)
   {
      if(i>0)
	     income=i;
	  else 
	     income=0;
   }
   public String getName()
   {
      return name;
   }
   public String getPhone()
   {
      return phone;
   }
   public int getIncome()
   {
      return income;
   }
   public void showProfile()
   {
      System.out.println("your name:"+getName()+",and your phone:"+getPhone()+",and your income:"+getIncome());
   }
}
public class app1
{
	public static void main(String args[])throws IOException
   {
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
	  String name=null;
	  String phone=null;
	  int  income=0;
      System.out.println("請輸入名字");
	    name=buf.readLine();
	  System.out.println("請輸入電話");
	    phone=buf.readLine();
	  System.out.println("請輸入收入");
        income=Integer.parseInt(buf.readLine());
      Member member=new Member(name,phone,income);
	  member.showProfile();
   }
}