import java.io.*;
class Staff extends Member
{
   protected int seniority;
   public Staff(String name,String phone,int income,int seniority)
   {
      super(name,phone,income);
	  setSeniority(seniority);
	  
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
	     return "普通員工";
	  else if(seniority<3)
	     return "副組長";
	  else if(seniority<6)
	     return "組長";
	  else
	     return "經理";
   }
   public void showProfile()
   {
	   super.showProfile();
	   System.out.println("your seniority:"+getSeniorty()+",and you are "+getStaff());
	   
   }
   
}
public class app4{
	public static void main(String args[])throws IOException{
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));  
	  String name=null;
	  String phone=null;
	  int  income=0;
	  int seniority=0;  //年資
	  System.out.println("請輸入名字");
	    name=buf.readLine();
	  System.out.println("請輸入電話，電話格式須為XX-xxxxxxx,ex:07-1234567");
	    phone=buf.readLine();
	  System.out.println("請輸入收入");
        income=Integer.parseInt(buf.readLine());	  
	  System.out.println("請輸入你的年資");
	    seniority=Integer.parseInt(buf.readLine());
	  Staff staff=new Staff(name,phone,income,seniority);
	  
	  staff.showProfile();
   }
}