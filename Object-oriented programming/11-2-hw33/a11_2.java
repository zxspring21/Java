import java.io.*;
abstract class shape
{
   private int length;
   private int width;
   private int radius;
   void setradius(int radius)
   {
      if(radius>0)
	  this.radius=radius;
	  else
	  radius=1;
   }
   int getradius()
   {
      return radius;
   }
   
   void setwidth(int width)
   {
      if(width>0)
	  this.width=width;
	  else
	  width=1;
   }
   int getwidth()
   {
      return width;
   }
   
   void setlength(int length)
   {
      if(length>0)
	  this.length=length;
	  else
	  length=1;
   }
   int getlength()
   {
      return length;
   }
   public abstract double circumference();
   public abstract double area();  

} 
class circle extends shape
{
   public double circumference()
   {
        return getradius()*3.14*2;
   }
   public double area()
   {
      return (double)getradius()*getradius()*3.14;
   }
}
class rectangle extends shape
{
   public double circumference()
   {
      return getwidth()*2+getlength()*2;
   }
   public double area()
   {
      return getwidth()*getlength();
   }
}
class a11_2
{
   public static void main(String[] args)throws IOException
   {
      BufferedReader input=
         new BufferedReader(new InputStreamReader(System.in));
		
	  shape mycircle=new circle();
	  System.out.println("請輸入你的半徑");
	  int r=Integer.parseInt(input.readLine());
	  mycircle.setradius(r);
      shape myrectangle=new rectangle();
	  System.out.println("請輸入你矩形的長");
	  int len=Integer.parseInt(input.readLine());
	  myrectangle.setlength(len);
	  System.out.println("請輸入你矩形的寬");
	  int wid=Integer.parseInt(input.readLine());
	  myrectangle.setwidth(wid);
	  System.out.println("長方形的長"+myrectangle.getlength()+"長方形的寬"+myrectangle.getwidth()+"長方形的周長"+myrectangle.circumference()+"長方形的面積"+myrectangle.area());
	  System.out.println("圓形的半徑"+mycircle.getradius()+"              圓形的周長"+mycircle.circumference()+"圓形的面積"+mycircle.area());
	  
   }
}