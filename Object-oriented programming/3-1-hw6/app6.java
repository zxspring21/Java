import java.io.*;
public class app6{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String name,wei,hei,id,str;
double str1,str2,bmi;
char sex;
buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("�п�J�m�W�G");
name=buf.readLine();

System.out.println("�п�J�����Ҧr���G");
str=buf.readLine();

System.out.println("�п�J�����G");
hei=buf.readLine();
str2=Integer.parseInt(hei);

System.out.println("�п�J�魫�G");
wei=buf.readLine();
str1=Integer.parseInt(wei);

bmi=str1/((str2/100)*(str2/100));
sex=str.charAt(1);
if(sex=='1')
System.out.println("���ͧA�n");
else
System.out.println("�p�j�p�n");
System.out.println("�A��BMI="+bmi);
if(bmi>=18.5)
   System.out.println("���`");
   else if(bmi>=23)
        System.out.println("�L��");
        else if(bmi>=25.0)
	     System.out.println("�έD(�Ĥ@��)");
	     else if(bmi>=30.0)
  	          System.out.println("�έD(�ĤG��)");
		  else if(bmi>35)
			System.out.println("�έD(�ĤT��)");
else
System.out.println("�L��");



}
}