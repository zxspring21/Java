import java.io.*;
class Potted
{
	   private int count_w=0;
	   private int count_f=0;
	   private int count_pr=0;
	   private int count_pl=0;
   /*********************/
   public int getcount_w()
   {
      return count_w;
   }
   public int getcount_f()
   {
      return count_f;
   }
   public int getcount_pr()
   {
      return count_pr;
   }
   public int getcount_pl()
   {
      return count_pl;
   }
   /**********************/
   public void setcount_w(int count_w)
   {
      this.count_w=count_w;
   }
	public void setcount_f(int count_f)
   {
      this.count_f=count_f;
   }
   public void setcount_pr(int count_pr)
   {
      this.count_pr=count_pr;
   }
   public void setcount_pl(int count_pl)
   {
      this.count_pl=count_pl;
   }
}
class setPotted extends Potted
{
	   private int number;
	   private int action;
	/**********************/
    public setPotted(int number,int action)
   {
      this.number=number;
	  this.action=action;
	  activeaction();
   }
   public int getaction()
   {
      return action;
   }
   public void activeaction()
   {
		 if(getaction()==1)
			water();
		 if(getaction()==2)
			fertilize();
		 if(getaction()==3)
			prune();
		 if(getaction()==4)
			plant();
   }
   /************************/
   public void water()
   {    setcount_w(getcount_w()+1);
   }
   public void fertilize()
   {	setcount_f(getcount_f()+1);
   }
   public void prune()
   {	setcount_pr(getcount_pr()+1);
   }
   public void plant()
   {	setcount_pl(getcount_pl()+1);
   }
   /*************************/
   public void lookpot()
   {
      if(getcount_w()>0)System.out.println("\t\t澆花"+getcount_w()+"次");
	  if(getcount_f()>0)System.out.println("\t\t施肥"+getcount_f()+"次");
	  if(getcount_pr()>0)System.out.println("\t\t修剪"+getcount_pr()+"次");
	  if(getcount_pl()>0)System.out.println("\t\t播種"+getcount_pl()+"次");
   }
   
}
class a13_1
{
   public static void main(String[] args)throws IOException
   {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	  
	System.out.println("請輸入你要的功能\n******************\n");
	Potted[] sadfarm=new Potted[6];
	int j=0;
	int i,selction;
	do
	{
		System.out.println("請輸入你要對盆栽做的事\n (1)澆花(2)施肥(3)修剪(4)播種(5)離開");
	    selction=Integer.parseInt(input.readLine());
	    switch(selction)
		{
		   case 1:  sadfarm[j++]=new setPotted(j,1);break;
		   case 2:  sadfarm[j++]=new setPotted(j,2);break;
		   case 3:  sadfarm[j++]=new setPotted(j,3);break;
		   case 4:  sadfarm[j++]=new setPotted(j,4);break;
		   case 5:break;
		}
		System.out.println("\t繼續種新盆栽?           ->請輸入1\n\t還是查看現有的盆栽?  ->請輸入2\n\t或是離開  ->請輸入0");

	    i=Integer.parseInt(input.readLine());
		if(i==2)
		{
		   int p;
		      System.out.println("您的傷心農場裡");
		   for(p=0;p<j;p++)
		   {
		      System.out.println("\t第"+(p+1)+"個盆栽：\n");
			  ((setPotted)sadfarm[p]).lookpot();
		   }
		   break;
		}
	
	}while(i!=0);
	
	}

}