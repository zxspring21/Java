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
	   System.out.println("�ǥ͡G"+getname()+"�A�t�O�G"+getdepartment()+"�A�Ǹ��G"+id+"�A�~�šG"+grade);
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
	   System.out.println("�Ѯv�G"+getname()+"�A�t�O�G"+getdepartment()+"�A�б¬�ءG"+subject);
	}
}
class a11_3
{
	public static void main(String[] args)throws IOException
	{
	BufferedReader input=
	new BufferedReader(new InputStreamReader(System.in));
	member[] addresbook=new member[5];
	System.out.println("�п�J�A�O(1)�ǥ�(2)�Ѯv");
	int sel=Integer.parseInt(input.readLine());
		if(sel==1)
		{
		   int i;
		   for(i=0;i<5;i++)
		   {
			   System.out.println("�п�J�m�W");
			   String name=input.readLine();
			   System.out.println("�п�J�t��");
			   String department=input.readLine();
			   System.out.println("�п�J�Ǹ�");
			   int id=Integer.parseInt(input.readLine());
			   System.out.println("�п�J�~��");
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
			   System.out.println("�п�J�m�W");
			   String name=input.readLine();
			   System.out.println("�п�J�t�O");
			   String department=input.readLine();
			   System.out.println("�п�J�б¬��");
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