import java.io.*;
class account
{
   private String name,account,password;
   private int money;
   public void setaccount(String account)
   {
      this.account=account;
   }
   public String getaccount()
   {
      return account;
   }
   public void setpassword(String password)
   {
      this.password=password;
   }
   public String getpassword()
   {
      return password;
   }
   public account()
   {
   }
   public account(String account,String password)
   {
      this.account=account;
	  this.password=password;
   }
   public  void Login()throws IOException
   { 
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�A���b��");
		String a=input.readLine();
		System.out.println("�п�J�A���K�X");
		String b=input.readLine();
		
		if(a.compareTo(getaccount())==0 && b.compareTo(getpassword())==0 )	
		   System.out.println("�n�J���\");
		else
		{
		   System.out.println("�n�J����");
		   System.out.println("�O�_�n���s�n�J? (1)yes (2)no");
		   if(Integer.parseInt(input.readLine())==1)
		      Login();
		}  
		
   }
   public int withdraw()throws IOException
   {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�п�J�A�n���ڪ����B");
	int m=Integer.parseInt(input.readLine());
	    if(money==0)
	        System.out.println("�z���l�B��0�A���ڥ���");
	    else
	    {
		    if(m>money)
		     	 System.out.println("�z�����ڪ��B"+m+"�W�L�z�{�����B"+money+"�A���ڥ���");
		    else
		    {
			     money=money-m;
			     System.out.println("�����O�ޱz���ڪ����B"+m);
		    }
	    }
	return money;
   }
   public int deposit()throws IOException
   {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�п�J�A�n�s�ڪ����B");
	int m=Integer.parseInt(input.readLine());
    money=money+m;
	return money;
   }
   public  void serbalance()
   {
      System.out.println("�A���l�B��"+money);
   }
   
   
  
}
public class a7_3
{
    public static void main(String[] args)throws IOException
    {
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	  //String str=input.readLine();
	  //int num=Integer.parseInt(str);
	  account data=new account();
	  int i=1;
	  do
	  {
		  System.out.println("�ާ@���n: �ӽбb����~��n�J�A�A�ϥΨ�L�\��");
		  System.out.println("��J�ÿ�ܧA�n���\��G(1)�n�J(2)����(3)�s��(4)�d�߾l�B(5)�ӽбb��(6)���}");
		  int fun=Integer.parseInt(input.readLine());
		  if(fun==1) data.Login();
		  if(fun==2) data.withdraw();
		  if(fun==3) data.deposit();
		  if(fun==4) data.serbalance();
		  if(fun==5) applyaccount(data);
		  if(fun==6){ 	i=0;System.exit(0);   }
	  }while(i==1);
	  
	}
	public static void applyaccount(account data)throws IOException
   {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�п�J�A�n�ӽЪ��b��");
		String a=input.readLine();
		System.out.println("�п�J�A�n�ӽЪ��K�X");
		String p=input.readLine();
		data.setaccount(a);
		data.setpassword(p);
		
   }
   
}