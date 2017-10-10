class a14_3
{
   public static void main(String[] args)
   {
      try
	  {
	  int a=Integer.valueOf(args[0]);
	  int b=Integer.valueOf(args[1]);
	  int c=a/b;
	  System.out.println("請輸入兩正數");
	  System.out.println(a+"/"+b+" = "+c);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	  	  System.out.println("您的輸入參數不足二個");
		  System.out.println(e);
	  }
	  catch(ArithmeticException p)
	  {
	  	  System.out.println("分母不可為0");
		  System.out.println(p);
	  }
	  finally
	  {
	     System.out.println("程式結束");
	  }
   } 
}