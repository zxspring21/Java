import java.io.*;
public class app4 
{
	public static void main(String[] args) throws IOException
	{
	      
		  BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("安安，可愛的使用者，您想使用(1)小數或是(2)整數");
		  String str=buf.readLine();
	      int num=Integer.parseInt(str);
	      if(num==1)
	      {
	    	System.out.println("輸入第一個數值");
	      	String str1=buf.readLine();
	      	double num1=Double.parseDouble(str1);
	      	System.out.println("輸入第二個數值");
	      	String str2=buf.readLine();
	      	double num2=Double.parseDouble(str2);
	      	System.out.println("輸入+-*/");
	      	char op=buf.readLine().charAt(0);
	      	calculatedouble(num1,num2,op);  
	      }
	      if(num==2)
	      {  
	    	  System.out.println("輸入第一個數值");
	    	  String str1=buf.readLine();
	    	  int num1=Integer.parseInt(str1);
	    	  System.out.println("輸入第二個數值");
	    	  String str2=buf.readLine();
	    	  int num2=Integer.parseInt(str2);
	    	  System.out.println("輸入+-*/");
	    	  char op=buf.readLine().charAt(0);
	    	  calculate(num1,num2,op);         
	      }
	   }   
	   public static void calculate(int num1,int num2,char op)
	   {
		   switch(op)
		   {
		   case '+':plus(num1,num2);break;
		   case '-':sub(num1,num2);break;
		   case '*':mul(num1,num2);break;
		   case '/':div(num1,num2);break;
		   }
	   }
	   
	   public static void calculatedouble(double num1,double num2,char op)
	   {   switch(op)
		   {
		   case '+':plusdouble(num1,num2);break;
		   case '-':subdouble(num1,num2);break;
		   case '*':muldouble(num1,num2);break;
		   case '/':divdouble(num1,num2);break;
		   }
	   }
	   public static void plusdouble(double num1,double num2)
	   {
		   System.out.printf("%f+%f=%f",num1,num2,num1+num2);
	   }
	   public static void subdouble(double num1,double num2)
	   {
		   System.out.printf("%f-%f=%f",num1,num2,num1-num2);
	   }
	   public static void muldouble(double num1,double num2)
	   {
		   System.out.printf("%f*%f=%f",num1,num2,num1*num2);
	   }
	   public static void divdouble(double num1,double num2)
	   {
		   System.out.printf("%f/%f=%f",num1,num2,num1/num2);
	   }
	   
	   public static void plus(int num1,int num2)
	   {
		   System.out.printf("%d+%d=%d",num1,num2,num1+num2);
	   }
	   public static void sub(int num1,int num2)
	   {
		   System.out.printf("%d-%d=%d",num1,num2,num1-num2);
	   }
	   public static void mul(int num1,int num2)
	   {
		   System.out.printf("%d*%d=%d",num1,num2,num1*num2);
	   }
	   public static void div(int num1,int num2)
	   {
		   System.out.printf("%d/%d=%d",num1,num2,num1/num2);
	   }
	   }