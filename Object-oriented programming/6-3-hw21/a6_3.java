import java.io.*;
import java.util.*;
class Login
{
  public String acc,pwd,email;
  public void setacc(String acc)
   {
      this.acc=acc;
   }
   public String getacc()
   {
      return acc;
   }
   public void setpwd(String pwd)
   {
      this.pwd=pwd;
   }
   public String getpwd()
   {
      return pwd; 
   }
   public Login(String acc,String pwd,String email)
   {   
      this.acc=acc;
      this.pwd=pwd;
      this.email=email;       
   }
   
}

public class a6_3
{
   public static void main(String[] args)throws IOException
   {
      BufferedReader input=
         new BufferedReader(new InputStreamReader(System.in));
      Login[] data=new Login[50];
      int time=0;
      set(data,time);
   }
   public static void show(String email)
   {
	   int[] months = {1,2,3,4,5,6,7,8,9,10,11,12};
	   Date date=new Date();
	   String a=date.toString();
       Calendar rightNow = Calendar.getInstance();
	   System.out.printf(email.substring(0,email.indexOf("@"))+"你好，歡迎你來自"+email.substring(email.indexOf("@")+1,email.length())+"您的註冊時間是");
	   if(email.indexOf("tw")>=0)
	     System.out.printf("中華民國"+(rightNow.get(Calendar.YEAR)-1911)+"年"+months[rightNow.get(Calendar.MONTH)]+"月"+rightNow.get(Calendar.DATE)+"日"+a.substring(11,13)+"時"+a.substring(14,16)+"分"+a.substring(17,19)+"秒");
	   else
	   {
	   System.out.printf("%d/",months[rightNow.get(Calendar.MONTH)]);
	   System.out.printf("%s/",rightNow.get(Calendar.DATE));
	   System.out.printf("%s   ",rightNow.get(Calendar.YEAR));
	   System.out.println(a.substring(11,16));
	   }
   }
   public static int set(Login[] data,int time)throws IOException
   {
      int member=50;
      BufferedReader input=
         new BufferedReader(new InputStreamReader(System.in));
      
      String account,password,email;
      int func=2;
	  int inputaccounttimes=1;   /* 帳號註冊人數*/
    while(func==2)
    { 
      if(time==0)
      {
         System.out.println("/*************註冊***************/");
	 System.out.println("請輸入你的帳號");
         account=input.readLine();
         time++;
         /*與下面設置密碼有點雷同*/
         System.out.println("請輸入你的密碼");
         password=input.readLine();
         int pwdtag=1;
	 while(pwdtag==1)
     {
   	    System.out.println("請再輸入一次你的密碼");

            if(password.compareTo(input.readLine())==0)
            {   
               pwdtag=0;
               int emailtag=1;
                while(emailtag==1)
				{
				  System.out.println("請設立你的email");
                  email=input.readLine();
					if(email.indexOf("@")>=0)
					{
					   emailtag=0;
                       data[0]=new Login(account,password,email);
						break;
					}
					else
					continue;
					}
					show(data[0].email);
				  System.out.println();	
				  System.out.println("請你輸入(1)->離開註冊程式 否則輸入(2)->繼續註冊");
	              func=Integer.parseInt(input.readLine());
				}
			else
            continue;
			}
      }
      else
      {
         System.out.println("請輸入你的帳號");
         String s=input.readLine();
		 int i;
         
         for(i=0;i<inputaccounttimes;i++)
         {
            for(;;)
			{
 			   if(s.compareTo(data[i].getacc())==0)
			   {  
			   System.out.println("你的帳號有人使用過了   請重新輸入帳號");
			   s=input.readLine();
			   continue;  
			   }
			   break;
			}
		 }
	 System.out.println("請輸入你的密碼");
         password=input.readLine();
         int pwdtag=1;
	  while(pwdtag==1)
      {
   	    System.out.println("請再輸入一次你的密碼");

            if(password.compareTo(input.readLine())==0)
            {   
               pwdtag=0;
               int emailtag=1;
                while(emailtag==1)
				{
					System.out.println("請設立你的email");
					email=input.readLine();
                    if(email.indexOf("@")>=0)
	                {
		             emailtag=0;
					 
                       if(inputaccounttimes<50)
                       {
                          data[inputaccounttimes]=new Login(s,password,email);
						  show(data[inputaccounttimes++].email);
						  break;
                       }
					}
					else
						continue;
				}
				System.out.println();	
				System.out.println("請你輸入(1)->離開註冊程式 否則輸入(2)->繼續註冊");
				func=Integer.parseInt(input.readLine()); 
			}
			else
            {  
               continue;
			}   
      }
         
               
	 
    }  //else
  }//while
      return 0;
    } //set
   
   
} //class