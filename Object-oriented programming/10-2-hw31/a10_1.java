import java.io.*;


class setemployee extends employee
{
   private String position;
   private int annualsalary;
   public setemployee(){
   }
   public setemployee(String firstname,String lastname,String phonenumber,int salary,String position)
   {
      super(firstname,lastname,phonenumber,salary);
	  this.position=position;
	  annualsalary=salary*12;
   }
   public void showProfile()
   {
      super.showProfile();
	  System.out.println("年薪:"+this.annualsalary);
	  System.out.println("職位:"+this.position);
	  System.out.println("***************");
   }

}
public class a10_1
{ 
   public static void main(String[] args)
   {
      setemployee a=new setemployee("柏瑋","盧","124567",50000,"程式工程師");
      setemployee b=new setemployee("男人","郝","0912345678",100000,"總經理");
	  a.showProfile();
	  b.showProfile();
   }
}