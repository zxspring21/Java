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

System.out.println("\n�п�J�A�n�X����\n �Τl��1,�Ѫꬰ2,����3,�ά�4");
str=buf.readLine();
strr1=Integer.parseInt(str);

for(i=0;i<7+j;i++)
{

double d = Math.random();
m = (int)(d*4)+1;
 if(!(b==4)||(c==4))
 {

 if(m>strr1)
	{System.out.println("�q��Ĺ�F");
	c++;}   
 if(m==strr1)
	j++;
 if(m<strr1)
	{System.out.println("�AĹ�F!!");
	b++;}
  }
 else
 break;
}
if(b==4)
System.out.println("\n\n�AĹ�F");
if(c==4)
System.out.println("\n\n�q��Ĺ�F");

}
}