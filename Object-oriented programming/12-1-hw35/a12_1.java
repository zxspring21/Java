import java.io.*;
interface shapes
{
   
   abstract String getshapename();
   abstract double length();
   abstract double area();
}
class square  implements shapes
{
   private double sidelength;
   private String name="正方形";
   public square(double sidelength)
   {
      this.sidelength=sidelength;
   }
   public String getshapename()
   {
      return name;
   }
   public double length()
   {
      return sidelength*4;
   }
   public double area()
   {
      return sidelength*sidelength;
   }
   
}
class rectangle  implements shapes
{
   private double lengt;
   private double width;
   private String name="長方形";
   public rectangle(double lengt,double width)
   {
      this.lengt=lengt;
	  this.width=width;
   }
   public String getshapename()
   {
	  return name;  
   }
   public double length()
   {
      return (lengt+width)*2;
   }
   public double area()
   {
      return lengt*width;
   }
   
}
class circle  implements shapes
{
   private double radius;
   private String name="圓形";
   public circle(double radius)
   {
      this.radius=radius;
   }
   public String getshapename()
   {
      return name;
   }
   public double length()
   {
      return radius*6.28;
   }
   public double area()
   {
      return radius*radius*3.14;
   }
   
}
public class a12_1
{
   public static void main(String[] args)
   {
      square s=new square(10);
      rectangle r=new rectangle(20,10);
      circle c=new circle(10);
	  outputstring(s);
	  outputstring(r);
	  outputstring(c);
	  
   }
   public static void outputstring(shapes obj)
   {
      System.out.println(obj.getshapename()+"周長："+(float)obj.length()+"面積："+obj.area());
   }
}