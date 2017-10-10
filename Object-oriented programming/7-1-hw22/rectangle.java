import java.io.*;
import java.lang.*;
class rec
{
	private int length;
	private int width;
	public int setlength(int length_1)
	{
		length=length_1;
		//System.out.println("你設定的長:"+length);
		return length;
	}
	public int setwidth(int width_1)
	{
		width=width_1;
		//System.out.println("你設定的寬:"+width);
		return width;
	}
	public int perr()  
	{
		int all=length*2+width*2;
		//System.out.println("你的矩型周長:"+all);
		return all;
	}
	public int ab()  
	{
		int alll=length*width;
		//System.out.println("你的矩型面積:"+alll);
		return alll;
	}
	public double der()  
	{
		double c=Math.sqrt(length*length+width*width);
		//System.out.println("你的對角線長度:"+c);
		return c;
	}
	public void printall()
	{
		System.out.printf("長%d寬%d周長%d面積%d對角線長度%f",setlength(1),setwidth(2),perr(),ab(),der());
	}
}
public class rectangle {
	public static void main(String[] args)throws IOException
	{
	   rec length=new rec();
	   length.setlength(1);
	   rec width=new rec();
	   width.setwidth(2);
	   rec per=new rec();
	   per.perr();
	   rec abc=new rec();
	   abc.ab();
	   rec prall=new rec();
	   prall.printall();
	   
	   
	}

}
