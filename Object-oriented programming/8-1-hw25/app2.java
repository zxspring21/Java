import java.io.IOException;

class rec
{
	private int length;
	private int width;
	
	public rec(int width,int length)
	{
	   this.width=width;
	   this.length=length;
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
		System.out.printf("��%d�e%d�P��%d���n%d�﨤�u����%f",length,width,perr(),ab(),der());
	}
}

public class app2 
{
	public static void main(String[] args)throws IOException
	{
	   rec per=new rec(5,4);
	   per.perr();
	   per.ab();
	   per.printall();	   
	}	

}
