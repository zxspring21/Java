import java.io.*;
abstract class member
{
	private String name;
	private String department;
	public String getname()
	{
	   return name;
	}
	public String getdepartment()
	{
	   return department;
	}
	public member(String na,String de)
	{   
	   name=na;
	   department=de;
	}
	
	public abstract void show(); 
} 
class student extends member
{
	private String grade;
	private int id;
	public student(String name,String department,int id,String grade)
	{
	   super(name,department);
	   this.grade=grade;
	   this.id=id;
	}
	
	public void show()
	{
	   System.out.println("學生："+getname()+"，系別："+getdepartment()+"，學號："+id+"，年級："+grade);
	}

}
class teacher extends member
{
    private String subject;
	public teacher(String name,String department,String subject)
	{
	   super(name,department);
	   this.subject=subject;
	}
	public void show()
	{
	   System.out.println("老師："+getname()+"，系別："+getdepartment()+"，教授科目："+subject);
	}
}
class a11_3
{
	public static void main(String[] args)throws IOException
	{
	BufferedReader input=
	new BufferedReader(new InputStreamReader(System.in));
	member[] addresbook=new member[5];
	System.out.println("請輸入你是(1)學生(2)老師");
	int sel=Integer.parseInt(input.readLine());
		if(sel==1)
		{
		   int i;
		   for(i=0;i<5;i++)
		   {
			   System.out.println("請輸入姓名");
			   String name=input.readLine();
			   System.out.println("請輸入系級");
			   String department=input.readLine();
			   System.out.println("請輸入學號");
			   int id=Integer.parseInt(input.readLine());
			   System.out.println("請輸入年級");
			   String grade=input.readLine();		      
			   student st=new student(name,department,id,grade);
			   addresbook[i]=st;
		   }
		   for(i=0;i<5;i++)
		   {
		   addresbook[i].show();
		   }
		}
		if(sel==2)
		{
		   int i;
		   for(i=0;i<5;i++)
		   {
			   System.out.println("請輸入姓名");
			   String name=input.readLine();
			   System.out.println("請輸入系別");
			   String department=input.readLine();
			   System.out.println("請輸入教授科目");
			   String subject=input.readLine();	   
               teacher te=new teacher(name,department,subject);
			   addresbook[i]=te;
			}
			for(i=0;i<5;i++)
		   {
		   addresbook[i].show();
		   }
		}
		}
}