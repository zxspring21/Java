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
	  System.out.println("�~�~:"+this.annualsalary);
	  System.out.println("¾��:"+this.position);
	  System.out.println("***************");
   }

}
public class a10_1
{ 
   public static void main(String[] args)
   {
      setemployee a=new setemployee("�f޳","�c","124567",50000,"�{���u�{�v");
      setemployee b=new setemployee("�k�H","�q","0912345678",100000,"�`�g�z");
	  a.showProfile();
	  b.showProfile();
   }
}