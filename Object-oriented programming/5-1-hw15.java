import java.io.*;
public class app1
{
   public static void main(String[] args) throws IOException
   {
      BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("��J�Ĥ@�Ӽƭ�");
      String str1=buf.readLine();
      int num1=Integer.parseInt(str1);
      System.out.println("��J�ĤG�Ӽƭ�");
      String str2=buf.readLine();
      int num2=Integer.parseInt(str2);
      System.out.println("��J+-*/");
      op=readLine().charAt(0);
      calculate(num1,num2,op);         
   }   
   public static void calculate(int num1,int num2,char op)
   {
       switch case(op)
	{
	case '+':
	{
	println("�Ĥ@�Ӽƭ�"num1+"+"�ĤG�Ӽƭ�"num+"num1+num2);
	break;
	}
	{case '-':
	println("�Ĥ@�Ӽƭ�"num1+"-"�ĤG�Ӽƭ�"num+"num1-num2);
	break;}
	{case '*':
	println("�Ĥ@�Ӽƭ�"num1*"+"�ĤG�Ӽƭ�"num+"num1*num2);
	break;}
	case '/':
	{println("�Ĥ@�Ӽƭ�"num1+"/"�ĤG�Ӽƭ�"num+"num1/num2);
	break;}
	}
   } 
}