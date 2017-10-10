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
		System.out.printf("長%d寬%d周長%d面積%d對角線長度%f",length,width,perr(),ab(),der());
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
