class a14_3
{
   public static void main(String[] args)
   {
      try
	  {
	  int a=Integer.valueOf(args[0]);
	  int b=Integer.valueOf(args[1]);
	  int c=a/b;
	  System.out.println("�п�J�⥿��");
	  System.out.println(a+"/"+b+" = "+c);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	  	  System.out.println("�z����J�ѼƤ����G��");
		  System.out.println(e);
	  }
	  catch(ArithmeticException p)
	  {
	  	  System.out.println("�������i��0");
		  System.out.println(p);
	  }
	  finally
	  {
	     System.out.println("�{������");
	  }
   } 
}