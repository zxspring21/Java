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
	   System.out.printf(email.substring(0,email.indexOf("@"))+"�A�n�A�w��A�Ӧ�"+email.substring(email.indexOf("@")+1,email.length())+"�z�����U�ɶ��O");
	   if(email.indexOf("tw")>=0)
	     System.out.printf("���إ���"+(rightNow.get(Calendar.YEAR)-1911)+"�~"+months[rightNow.get(Calendar.MONTH)]+"��"+rightNow.get(Calendar.DATE)+"��"+a.substring(11,13)+"��"+a.substring(14,16)+"��"+a.substring(17,19)+"��");
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
	  int inputaccounttimes=1;   /* �b�����U�H��*/
    while(func==2)
    { 
      if(time==0)
      {
         System.out.println("/*************���U***************/");
	 System.out.println("�п�J�A���b��");
         account=input.readLine();
         time++;
         /*�P�U���]�m�K�X���I�p�P*/
         System.out.println("�п�J�A���K�X");
         password=input.readLine();
         int pwdtag=1;
	 while(pwdtag==1)
     {
   	    System.out.println("�ЦA��J�@���A���K�X");

            if(password.compareTo(input.readLine())==0)
            {   
               pwdtag=0;
               int emailtag=1;
                while(emailtag==1)
				{
				  System.out.println("�г]�ߧA��email");
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
				  System.out.println("�ЧA��J(1)->���}���U�{�� �_�h��J(2)->�~����U");
	              func=Integer.parseInt(input.readLine());
				}
			else
            continue;
			}
      }
      else
      {
         System.out.println("�п�J�A���b��");
         String s=input.readLine();
		 int i;
         
         for(i=0;i<inputaccounttimes;i++)
         {
            for(;;)
			{
 			   if(s.compareTo(data[i].getacc())==0)
			   {  
			   System.out.println("�A���b�����H�ϥιL�F   �Э��s��J�b��");
			   s=input.readLine();
			   continue;  
			   }
			   break;
			}
		 }
	 System.out.println("�п�J�A���K�X");
         password=input.readLine();
         int pwdtag=1;
	  while(pwdtag==1)
      {
   	    System.out.println("�ЦA��J�@���A���K�X");

            if(password.compareTo(input.readLine())==0)
            {   
               pwdtag=0;
               int emailtag=1;
                while(emailtag==1)
				{
					System.out.println("�г]�ߧA��email");
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
				System.out.println("�ЧA��J(1)->���}���U�{�� �_�h��J(2)->�~����U");
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