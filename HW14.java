import java.io.*;
interface Paintable {
	 abstract double circu();
	 abstract double area();
}

abstract class Shape implements Paintable{
	public double circulength;
	public double Area;
	public int length;
	public int width;
	public double circu(){
		return circulength;
	}
	public double area(){
		return Area;
	}

}
class Circle extends Shape implements Paintable{
	public int Radius;
	public Circle() {
	Radius = 0;
	}
	public Circle(int r) {
		Radius = r;
	}
	public double circu(){
	   return	2*Math.PI*Radius;
	}
	public double area(){
	   return  Math.PI*Radius*Radius;
	}
	
}
class Rectangle extends Shape implements Paintable{
	public int Length;
	public int Height;
	public Rectangle() {
	Length = 0;
	Height = 0;
	}
	public Rectangle(int Len, int High) {
	Length = Len;
	Height = High;
	}
    public double circu(){
	   return 2*(Length+Height);
	}
	public double area(){
	   return  Length*Height;	
	}

}

public class a7 {
	public static void main(String args[])throws IOException{
		BufferedReader buf=new BufferedReader
				(new InputStreamReader (System.in));
		System.out.println("請輸入圓形半徑:");
		int r=Integer.parseInt(buf.readLine());
		System.out.println("請輸入方形長度:");
		int length=Integer.parseInt(buf.readLine());
		System.out.println("請輸入方形寬度:");
		int width=Integer.parseInt(buf.readLine());
		Circle c=new Circle(r);
		Rectangle R=new Rectangle(length,width);
		System.out.println("圓形\n半徑:"+(double)r+
				"==>周長:"+c.circu()+"，面積:"
				+c.area());
		System.out.println("方形\n長:"+(double)length+
   "，寬:"+(double)width+"==>周長:"+R.circu()+"，面積:"
				+R.area());
	}

}
