import java.io.*;
import java.lang.*;
class rec
{
	private int length;
	private int width;
	public int setlength(int length_1)
	{
		length=length_1;
		//System.out.println("�A�]�w����:"+length);
		return length;
	}
	public int setwidth(int width_1)
	{
		width=width_1;
		//System.out.println("�A�]�w���e:"+width);
		return width;
	}
	public int perr()  
	{
		int all=length*2+width*2;
		//System.out.println("�A���x���P��:"+all);
		return all;
	}
	public int ab()  
	{
		int alll=length*width;
		//System.out.println("�A���x�����n:"+alll);
		return alll;
	}
	public double der()  
	{
		double c=Math.sqrt(length*length+width*width);
		//System.out.println("�A���﨤�u����:"+c);
		return c;
	}
	public void printall()
	{
		System.out.printf("��%d�e%d�P��%d���n%d�﨤�u����%f",setlength(1),setwidth(2),perr(),ab(),der());
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
