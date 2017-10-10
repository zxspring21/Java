package hw6;

import java.io.*;

public class app6 {
	public static void main(String args[])throws IOException{
	   BufferedReader buf=new BufferedReader(new 
			   InputStreamReader(System.in));
	   int a=Integer.parseInt(buf.readLine());
	   int flag=1;
	   if(a==0)
		   System.exit(0);
	   else{
		   if(a==2)
			   System.out.println("Yes");
		   for(int i=2;i<a;i++){
			   if(a%i==0){
				   flag=0;
			   }
		   }
	   }
	   if(flag==0)
		   System.out.println("No");
	   if(flag==1)
		   System.out.println("Yes");
	}		
}
