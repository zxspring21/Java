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
	   System.out.println("�Y�S�n�D��J�A�w�]���׬Ҭ�:1");
	   Rectangle R1=new Rectangle(1,1);
	   System.out.println("�п�J�ĤG�ӯx�Ϊ���:");
	   int len=Integer.parseInt(buf.readLine());
	   Rectangle R2=new Rectangle(len,1);
	   System.out.println("�п�J�ĤT�ӯx�Ϊ��e:");
	   int wid=Integer.parseInt(buf.readLine());
	   Rectangle R3=new Rectangle(1,wid);
	   System.out.println("�Ĥ@�ӯx�έ��n:"+R1.Area()+
			   "\n�ĤG�ӯx�έ��n:"+R2.Area()+
			   "\n�ĤT�ӯx�έ��n:"+R3.Area());
   }
}
