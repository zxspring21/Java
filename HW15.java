import java.io.*;

class Rectangle{
	private int length;
	private int width;
	Rectangle(){
	   width=1;
	   length=1;
	}
	Rectangle(int len,int wid){
		length=len;
		width=wid;
	}
	public double Area(){
		return length*width;
	}
}
public class a8 {
   public static void main(String args[])throws IOException{
	   BufferedReader buf=new BufferedReader
				(new InputStreamReader (System.in));
	   System.out.println("若沒要求輸入，預設長度皆為:1");
	   Rectangle R1=new Rectangle(1,1);
	   System.out.println("請輸入第二個矩形的長:");
	   int len=Integer.parseInt(buf.readLine());
	   Rectangle R2=new Rectangle(len,1);
	   System.out.println("請輸入第三個矩形的寬:");
	   int wid=Integer.parseInt(buf.readLine());
	   Rectangle R3=new Rectangle(1,wid);
	   System.out.println("第一個矩形面積:"+R1.Area()+
			   "\n第二個矩形面積:"+R2.Area()+
			   "\n第三個矩形面積:"+R3.Area());
   }
}
