import java.io.*;
public class app3{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String name,wei,hei;
double str,str1,str2,bmi;
buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("�п�J�m�W�G");
name=buf.readLine();



System.out.println("�п�J�魫�G");
wei=buf.readLine();
str1=Integer.parseInt(wei);

System.out.println("�п�J�����G");
hei=buf.readLine();
str2=Integer.parseInt(hei);

bmi=str1/((str2/100)*(str2/100));
System.out.println("�A��BMI="+bmi);

}
}