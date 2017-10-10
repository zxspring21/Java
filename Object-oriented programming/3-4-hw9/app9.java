import java.io.*;
public class app9{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String str,str1,st;
int strr1,str2,a=0,b=0,c=0;
int m;
char pa;
buf=new BufferedReader (new InputStreamReader (System.in));

do
{
System.out.println("\n請輸入你要出什麼拳\n 棒子為1,老虎為2,雞為3,蟲為4");
str=buf.readLine();
strr1=Integer.parseInt(str);
double d = Math.random();
m = (int)(d*4)+1;
 if(m>strr1)
	{System.out.println("電腦贏了");
	c++;}   
 if(m==strr1)
	System.out.println("你們平手");
 if(m<strr1)
	{System.out.println("你贏了!!");
	b++;}

System.out.println("是否要繼續玩下去，按y則再猜一次，按n則跳出:");
st=buf.readLine();
pa=st.charAt(0);
}while(pa=='y');
System.out.println("你贏了"+b+"次");
System.out.println("電腦贏了"+c+"次");

}
}