import java.io.*;
interface shapes
{
   abstract String getshapename();
   abstract double length();
   abstract double area();
}
interface cylinder
{
   abstract void setheight(double height);
   abstract double surfacearea();
   abstract double volume();
}
class square  implements cylinder,shapes
{
   private double sidelength;
   private double height;
   private String name="square";
   public square(double sidelength,double height)
   {
      this.sidelength=sidelength;
	  setheight(height);
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
   
   public void setheight(double height)
   {
      this.height=height;
   }
   public double surfacearea()
   {
      return sidelength*sidelength*2+sidelength*height*4;
   }
   public double volume()
   {
      return sidelength*sidelength*height;
   }
   
}
class rectangle  implements cylinder,shapes
{
   private double lengt;
   private double width;
   private double height;
   private String name="rectangle";
   public rectangle(double lengt,double width,double height)
   {
      this.lengt=lengt;
	  this.width=width;
	  setheight(height);
   }
   public String getshapename()
   {
	  return name;  
   }

   public void setheight(double height)
   {
      this.height=height;
   }   
   public double length()
   {
      return (lengt+width)*2;
   }
   public double area()
   {
      return lengt*width;
   }
   
   public double surfacearea()
   {
      return lengt*width*2+lengt*height*2+height*width*2;
   }
   public double volume()
   {
      return lengt*width*height;
   }
   
}
class circle  implements cylinder,shapes
{
   private double radius;
   private double height;
   private String name="circle";
   public circle(double radius,double height)
   {
      this.radius=radius;
	  setheight(height);
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
   
   public void setheight(double height)
   {
      this.height=height;
   }
   public double surfacearea()
   {
      return radius*6.28*height+radius*radius*3.14*2;
   }
   public double volume()
   {
      return radius*radius*3.14*height;
   }
   
}
public class a12_2
{
   public static void main(String[] args)
   {
      square s=new square(10,2);
      rectangle r=new rectangle(20,10,2);
      circle c=new circle(10,2);
	  outputstring(s,s);
	  outputstring(r,r);
	  outputstring(c,c);
	  
   }
   public static void outputstring(shapes obj2,cylinder obj)
   {
      System.out.println(obj2.getshapename()+"\tªí­±¿n¡G"+(float)obj.surfacearea()+"\tÅé¿n¡G"+obj.volume());
   }
}