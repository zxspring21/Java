import java.io.*;
public class app8{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String str,str1;
int strr1,str2,a=0,b=0;
int m;

buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("�п�J�A�nĹ�X���~��Ĺ�G\n");
str1=buf.readLine();
str2=Integer.parseInt(str1);

while(b<str2)
{

System.out.println("\n�п�J�A�n�X����\n �Τl��1,�Ѫꬰ2,����3,�ά�4");
str=buf.readLine();
strr1=Integer.parseInt(str);
double d = Math.random();
m = (int)(d*4)+1;
a++;
 if(m>strr1)
	System.out.println("�q��Ĺ�F");   
 if(m==strr1)
	System.out.println("�A�̥���");
 if(m<strr1)
	{System.out.println("�AĹ�F!!");
	b++;}
}
System.out.println("�g�L�F"+a+"�^�X�AĹ�F"+b+"��");
}
}