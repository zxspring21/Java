import java.io.*;
public class app10{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String str,str1,st;
int strr1,str2,a=0,b=0,c=0;
int m,i,j=0;
char pa;
buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("\n請輸入你要出什麼拳\n 棒子為1,老虎為2,雞為3,蟲為4");
str=buf.readLine();
strr1=Integer.parseInt(str);

for(i=0;i<7+j;i++)
{

double d = Math.random();
m = (int)(d*4)+1;
 if(!(b==4)||(c==4))
 {

 if(m>strr1)
	{System.out.println("電腦贏了");
	c++;}   
 if(m==strr1)
	j++;
 if(m<strr1)
	{System.out.println("你贏了!!");
	b++;}
  }
 else
 break;
}
if(b==4)
System.out.println("\n\n你贏了");
if(c==4)
System.out.println("\n\n電腦贏了");

}
}