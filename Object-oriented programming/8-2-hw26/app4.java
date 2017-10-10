import java.io.*;
import java.math.*;
class triangle
{
	private int edge1;
	private int edge2;
	private int edge3;
	public triangle(int edge1,int edge2,int edge3)
	{
		if((edge1+edge2>edge3)&&(edge2+edge3>edge1)&&(edge3+edge1>edge2)&&(edge1-edge2<edge3)&&(edge2-edge3<edge1)&&(edge3-edge1<edge2))
		{
			this.edge1=edge1;
			this.edge2=edge2;
			this.edge3=edge3;
		}
		else
		{
			edge1=3;
			edge2=4;
			edge3=5;
		}
	}
	
	
	public int perimeter()
	{
	   int sum=edge1+edge2+edge3;
	   return sum;
	}
	public double area()
	{
		double a;
		double s=(edge1+edge2+edge3)/2;
		a=Math.sqrt(((s-edge1)*(s-edge2)*(s-edge3)*s));
		return a;
	}
	public void bi()
	{
		boolean p;
		if(Math.pow(edge3,2)==Math.pow(edge1,2)+Math.pow(edge2,2)||(Math.pow(edge2,2)==Math.pow(edge3,2)+Math.pow(edge1,2))||(Math.pow(edge1,2)==Math.pow(edge3,2)+Math.pow(edge2,2)))
			System.out.println("這是直角三角型");
		else
			System.out.println("這不是直角三角型");
	}
	public void show()
	{
		System.out.println("邊長"+edge1+"邊長"+edge2+"邊長"+edge3);
		System.out.println("周長"+perimeter());
		System.out.println("面積"+area());
		bi();
	}
	
}

public class app4{
	public static void main(String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("請輸入三邊長度");
		triangle abc=new triangle(Integer.parseInt(buf.readLine()),Integer.parseInt(buf.readLine()),Integer.parseInt(buf.readLine()));
		  
		abc.perimeter();
		abc.area();
		abc.bi();
		abc.show();
	}

}