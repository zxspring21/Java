import java.io.*;
class account
{
   private String name,studentid,phonenumber;
   public String getname()
   {
      return name;
   }
   public String getstudentid()
   {
      return studentid;
   }
   public String getphonenumber()
   {
      return phonenumber;
   }
   public account(String name,String studentid,String phonenumber)
   {
      this.name=name;
	  this.studentid=studentid;
	  this.phonenumber=phonenumber;
   }
   public void getGrade()
   {
     
	  studentid.substring(4,7);
	  System.out.println(studentid.substring(7,8)+"�~��");
	  studentid.substring(8,studentid.length());
   }
 
   public int print()
   {
	  String a;
	  a="aaa";
	  switch(Integer.parseInt(studentid.substring(4,7)))
	  { 
		case 108:a="��u�t";break;
		case 134:a="�]�|�t";break;
	  }	  
	  String b;
	  b="bbb";
	  switch(Integer.parseInt(studentid.substring(7,8)))
      { 
	     case 1:b="�үZ";break;
		 case 2:b="�A�Z";break;
		 case 3:b="���Z";break;
		 case 4:b="�B�Z";break;
	  }	  
	  
	  System.out.println(getname()+ " �Ǹ�:"+getstudentid()+" �~��:"+studentid.substring(7,8)+"�~�� �q��:"+getphonenumber()+"�A"+a+"�A"+b+"�A"+studentid.substring(8,studentid.length()));
      return 0;
   }
}
class a8_4
{
   public static void main(String[] args)throws IOException
   {
      account contectbook=new account("����","1098108101","0938888888");
	  contectbook.getGrade();
	  contectbook.print();
      account contectbooks=new account("levis","1100134210","0912345678");
	  contectbooks.getGrade();
	  contectbooks.print();
   }
}