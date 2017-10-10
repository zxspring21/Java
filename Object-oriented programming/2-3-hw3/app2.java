import java.io.*;
public class app2{
public static void main (String[] args ) throws IOException
{
BufferedReader buf;
String num;
int str;
double a=0.0,b=0.0;
buf=new BufferedReader (new InputStreamReader (System.in));
System.out.println("請輸入班級人數：");
num=buf.readLine();
str=Integer.parseInt(num);
System.out.printf("\n國文：500*%d=%d",str,str*500);
if(str>=10){
   a=700*str*0.6;
   System.out.printf("\n英文：(700*%d)*0.6=%g",str,a);}
else{
   a=700*str;
   System.out.printf("\n英文：700*%d=%g",str,a);}
if(str>=8){
   b=400*str*0.5;
   System.out.printf("\n物理：(400*%d)*0.5=%g",str,b);}
else{
   b=400*str;
System.out.printf("\n物理：400*%d=%g",str,b);}
System.out.printf("\n作業系統：899*%d=%d",str,str*899);
}
}