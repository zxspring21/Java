import java.io.*;
public class app1{
	public static void main(String[] args)throws IOException
	{
		  int[][] data=new int[3][5];  
		  int[] score=new int[3];  
		  int i;
	      BufferedReader buf=new BufferedReader
				   (new InputStreamReader(System.in));
	      for(i=0;i<3;i++)
	      {	  
	    	System.out.println("輸入國文成績，英文成績，數學成績，理化成績，歷史成績");
	    	int sum=0;
	    	for(int j=0;j<5;j++)
		    {
		    	data[i][j]=Integer.parseInt(buf.readLine());
		    	sum=sum+data[i][j];
		    }
	    	score[i]=sum/5;
	      }
	      			  if(score[0]>score[1])
	      				  if(score[1]>score[2])
	    	  System.out.println("第1位學生平均"+score[0]+"第2位學生平均"+score[1]+"第3位學生平均"+score[2]);
	    			  if(score[0]>score[2])
	    				  if(score[2]>score[1])
	    	  System.out.println("第1位學生平均"+score[0]+"第3位學生平均"+score[2]+"第2位學生平均"+score[1]);
	    			  if(score[1]>score[0])
	    				  if(score[0]>score[2])
	    	  System.out.println("第2位學生平均"+score[1]+"第1位學生平均"+score[0]+"第3位學生平均"+score[2]);
	    			  if(score[1]>score[2])
	    				  if(score[2]>score[0])
	    	  System.out.println("第2位學生平均"+score[1]+"第3位學生平均"+score[2]+"第1位學生平均"+score[0]);
	    			  if(score[2]>score[1])
	    				  if(score[1]>score[0])
	    	  System.out.println("第3位學生平均"+score[2]+"第2位學生平均"+score[1]+"第1位學生平均"+score[0]);	
	    			  if(score[2]>score[0])
	    				  if(score[0]>score[1])
	    	  System.out.println("第3位學生平均"+score[2]+"第1位學生平均"+score[0]+"第2位學生平均"+score[1]);
	      
	      
	      
	    	  
	      
	      
	}
}
