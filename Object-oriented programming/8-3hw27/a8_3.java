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
   public account(String name,String account,String password,int money)
   {
      this.name=name;
	  this.account=account;
	  this.password=password;
	  this.money=money;
   }
   public  void Login()throws IOException
   { 
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入你的帳號");
		String a=input.readLine();
		System.out.println("請輸入你的密碼");
		String b=input.readLine();
		
		if(a.compareTo(getaccount())==0 && b.compareTo(getpassword())==0 )
		{
		   System.out.println("登入成功");
		   int i=1;
		   do{
		   System.out.println("輸入並選擇你要的功能：(1)提款(2)存款(3)搜尋餘額(4)離開");
		   int fun=Integer.parseInt(input.readLine());
		   if(fun==1) withdraw();
		   if(fun==2) deposit();
		   if(fun==3) serbalance();
		   if(fun==4){ 	i=0;System.out.println("感謝你的使用，提款機程式結束");System.exit(0);   }
		   }while(i==1);
		}
		else
		{
		   System.out.println("登入失敗");
		   System.out.println("是否要重新登入? (1)yes (2)no");
		   if(Integer.parseInt(input.readLine())==1)
		      Login();
		}  
		
   }
   public int withdraw()throws IOException
   {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("請輸入你要提款的金額");
	int m=Integer.parseInt(input.readLine());
	    if(money==0)
	        System.out.println("您的餘額為0，提款失敗");
	    else
	    {
		    if(m>money)
		     	 System.out.println("您的提款金額"+m+"超過您現有金額"+money+"，提款失敗");
		    else
		    {
			     money=money-m;
			     System.out.println("妥善保管您提款的金額"+m);
		    }
	    }
	return money;
   }
   public int deposit()throws IOException
   {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("請輸入你要存款的金額");
	int m=Integer.parseInt(input.readLine());
    money=money+m;
	return money;
   }
   public  void serbalance()
   {
      System.out.println("你的餘額為"+money);
   }
   
   
  
}
public class a8_3
{
    public static void main(String[] args)throws IOException
    {
      BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	  //String str=input.readLine();
	  //int num=Integer.parseInt(str);
	  account data=new account("apple","aa","bb",123);
	  int i=1;
	  do
	  {
		  System.out.println("輸入並選擇你要的功能：(1)登入(2)申請帳號(3)離開");
		  int fun=Integer.parseInt(input.readLine());
		  if(fun==1) data.Login();
		  if(fun==2) applyaccount(data);
		  if(fun==3){ 	i=0;System.out.println("感謝你的使用，提款機程式結束");;System.exit(0);   }
	  }while(i==1);
	    
	  
	}
	public static void applyaccount(account data)throws IOException
   {
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("請輸入你要申請的帳號");
		String a=input.readLine();
		System.out.println("請輸入你要申請的密碼");
		String p=input.readLine();
		data.setaccount(a);
		data.setpassword(p);
		
   }
   
}