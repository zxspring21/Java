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

System.out.println("�п�J�A�n�q�X����");
str1=buf.readLine();
str2=Integer.parseInt(str1);


for(a=1;a<=str2;a++)
{

  
System.out.println("\n�п�J�A�n�X����\n �ŤM��1,���Y��2,����3");
str=buf.readLine();
strr1=Integer.parseInt(str);
m = (int)(d*3)+1;
 if(m>strr1)
	System.out.println("�q��Ĺ�F");   
 if(m==strr1)
	System.out.println("�A�̥���");
 if(m<strr1)
	System.out.println("�AĹ�F!!");
}

}
}