import java.io.*;
public class app3{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String name,wei,hei;
double str,str1,str2,bmi;
buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("請輸入姓名：");
name=buf.readLine();



System.out.println("請輸入體重：");
wei=buf.readLine();
str1=Integer.parseInt(wei);

System.out.println("請輸入身高：");
hei=buf.readLine();
str2=Integer.parseInt(hei);

bmi=str1/((str2/100)*(str2/100));
System.out.println("你的BMI="+bmi);

}
}