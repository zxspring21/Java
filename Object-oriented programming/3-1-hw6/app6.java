import java.io.*;
public class app6{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String name,wei,hei,id,str;
double str1,str2,bmi;
char sex;
buf=new BufferedReader (new InputStreamReader (System.in));

System.out.println("請輸入姓名：");
name=buf.readLine();

System.out.println("請輸入身分證字號：");
str=buf.readLine();

System.out.println("請輸入身高：");
hei=buf.readLine();
str2=Integer.parseInt(hei);

System.out.println("請輸入體重：");
wei=buf.readLine();
str1=Integer.parseInt(wei);

bmi=str1/((str2/100)*(str2/100));
sex=str.charAt(1);
if(sex=='1')
System.out.println("先生你好");
else
System.out.println("小姐妳好");
System.out.println("你的BMI="+bmi);
if(bmi>=18.5)
   System.out.println("正常");
   else if(bmi>=23)
        System.out.println("過重");
        else if(bmi>=25.0)
	     System.out.println("肥胖(第一度)");
	     else if(bmi>=30.0)
  	          System.out.println("肥胖(第二度)");
		  else if(bmi>35)
			System.out.println("肥胖(第三度)");
else
System.out.println("過輕");



}
}