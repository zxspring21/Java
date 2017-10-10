import java.io.*;
public class app7{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String str,str1;
int strr1,str2,a,b;
int m;
double d = Math.random();
buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("請輸入你要猜幾次拳");
str1=buf.readLine();
str2=Integer.parseInt(str1);


for(a=1;a<=str2;a++)
{

  
System.out.println("\n請輸入你要出什麼拳\n 剪刀為1,石頭為2,布為3");
str=buf.readLine();
strr1=Integer.parseInt(str);
m = (int)(d*3)+1;
 if(m>strr1)
	System.out.println("電腦贏了");   
 if(m==strr1)
	System.out.println("你們平手");
 if(m<strr1)
	System.out.println("你贏了!!");
}

}
}