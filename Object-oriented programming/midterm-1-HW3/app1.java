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
	    	System.out.println("��J��妨�Z�A�^�妨�Z�A�ƾǦ��Z�A�z�Ʀ��Z�A���v���Z");
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
	    	  System.out.println("��1��ǥͥ���"+score[0]+"��2��ǥͥ���"+score[1]+"��3��ǥͥ���"+score[2]);
	    			  if(score[0]>score[2])
	    				  if(score[2]>score[1])
	    	  System.out.println("��1��ǥͥ���"+score[0]+"��3��ǥͥ���"+score[2]+"��2��ǥͥ���"+score[1]);
	    			  if(score[1]>score[0])
	    				  if(score[0]>score[2])
	    	  System.out.println("��2��ǥͥ���"+score[1]+"��1��ǥͥ���"+score[0]+"��3��ǥͥ���"+score[2]);
	    			  if(score[1]>score[2])
	    				  if(score[2]>score[0])
	    	  System.out.println("��2��ǥͥ���"+score[1]+"��3��ǥͥ���"+score[2]+"��1��ǥͥ���"+score[0]);
	    			  if(score[2]>score[1])
	    				  if(score[1]>score[0])
	    	  System.out.println("��3��ǥͥ���"+score[2]+"��2��ǥͥ���"+score[1]+"��1��ǥͥ���"+score[0]);	
	    			  if(score[2]>score[0])
	    				  if(score[0]>score[1])
	    	  System.out.println("��3��ǥͥ���"+score[2]+"��1��ǥͥ���"+score[0]+"��2��ǥͥ���"+score[1]);
	      
	      
	      
	    	  
	      
	      
	}
}
