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
System.out.println("\n�п�J�A�n�X����\n �Τl��1,�Ѫꬰ2,����3,�ά�4");
str=buf.readLine();
strr1=Integer.parseInt(str);
double d = Math.random();
m = (int)(d*4)+1;
 if(m>strr1)
	{System.out.println("�q��Ĺ�F");
	c++;}   
 if(m==strr1)
	System.out.println("�A�̥���");
 if(m<strr1)
	{System.out.println("�AĹ�F!!");
	b++;}

System.out.println("�O�_�n�~�򪱤U�h�A��y�h�A�q�@���A��n�h���X:");
st=buf.readLine();
pa=st.charAt(0);
}while(pa=='y');
System.out.println("�AĹ�F"+b+"��");
System.out.println("�q��Ĺ�F"+c+"��");

}
}