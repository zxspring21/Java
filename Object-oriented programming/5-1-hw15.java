import java.io.*;
public class app1
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("輸入第一個數值");
      String str1=buf.readLine();
      int num1=Integer.parseInt(str1);
      System.out.println("輸入第二個數值");
      String str2=buf.readLine();
      int num2=Integer.parseInt(str2);
      System.out.println("輸入+-*/");
      op=readLine().charAt(0);
      calculate(num1,num2,op);         
   }   
   public static void calculate(int num1,int num2,char op)
   {
       switch case(op)
	{
	case '+':
	{
	println("第一個數值"num1+"+"第二個數值"num+"num1+num2);
	break;
	}
	{case '-':
	println("第一個數值"num1+"-"第二個數值"num+"num1-num2);
	break;}
	{case '*':
	println("第一個數值"num1*"+"第二個數值"num+"num1*num2);
	break;}
	case '/':
	{println("第一個數值"num1+"/"第二個數值"num+"num1/num2);
	break;}
	}
   } 
}