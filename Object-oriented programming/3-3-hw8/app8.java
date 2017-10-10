import java.io.*;
public class app8{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String str,str1;
int strr1,str2,a=0,b=0;
int m;

buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("請輸入你要贏幾次才算贏：\n");
str1=buf.readLine();
str2=Integer.parseInt(str1);

while(b<str2)
{

System.out.println("\n請輸入你要出什麼拳\n 棒子為1,老虎為2,雞為3,蟲為4");
str=buf.readLine();
strr1=Integer.parseInt(str);
double d = Math.random();
m = (int)(d*4)+1;
a++;
 if(m>strr1)
	System.out.println("電腦贏了");   
 if(m==strr1)
	System.out.println("你們平手");
 if(m<strr1)
	{System.out.println("你贏了!!");
	b++;}
}
System.out.println("經過了"+a+"回合你贏了"+b+"次");
}
}