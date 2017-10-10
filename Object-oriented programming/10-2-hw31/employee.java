public class employee{ 

   private String firstname;
   private String lastname;
   private String phonenumber;
   private int salary;
   
   public employee(){
   }
   
   public employee(String firstname,String lastname,String phonenumber,int salary){
      this.firstname=firstname;
      this.lastname=lastname;
      this.phonenumber=phonenumber;
      this.salary=salary;
   }
   public void setfirstname(String firstname){ 
      this.firstname=firstname;
   }
   
   public void setlastname(String lastname){
      this.lastname=lastname;
   } 
   
   public void setphonenumber(String phonenumber){
      this.phonenumber=phonenumber;
   }
   
   public int setsalary(int salary){
      this.salary=salary;
	  return salary;
   }
   
   public String getfirstname(){
      return firstname;
   }
   
   public String getlastname(){
      return lastname;
   }
   public String getphonenumber(){
      return phonenumber;
   }
   public int getsalary(){
      return salary;
   }
   
   public void showProfile(){
      System.out.print("©m");
	  System.out.println("¦W:"+lastname+firstname);
	  
   }
   
}