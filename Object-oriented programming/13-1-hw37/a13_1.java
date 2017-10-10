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
      if(getcount_w()>0)System.out.println("\t\t���"+getcount_w()+"��");
	  if(getcount_f()>0)System.out.println("\t\t�I��"+getcount_f()+"��");
	  if(getcount_pr()>0)System.out.println("\t\t�װ�"+getcount_pr()+"��");
	  if(getcount_pl()>0)System.out.println("\t\t����"+getcount_pl()+"��");
   }
   
}
class a13_1
{
   public static void main(String[] args)throws IOException
   {
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	  
	System.out.println("�п�J�A�n���\��\n******************\n");
	Potted[] sadfarm=new Potted[6];
	int j=0;
	int i,selction;
	do
	{
		System.out.println("�п�J�A�n��֮ⰵ����\n (1)���(2)�I��(3)�װ�(4)����(5)���}");
	    selction=Integer.parseInt(input.readLine());
	    switch(selction)
		{
		   case 1:  sadfarm[j++]=new setPotted(j,1);break;
		   case 2:  sadfarm[j++]=new setPotted(j,2);break;
		   case 3:  sadfarm[j++]=new setPotted(j,3);break;
		   case 4:  sadfarm[j++]=new setPotted(j,4);break;
		   case 5:break;
		}
		System.out.println("\t�~��طs�֮�?           ->�п�J1\n\t�٬O�d�ݲ{�����֮�?  ->�п�J2\n\t�άO���}  ->�п�J0");

	    i=Integer.parseInt(input.readLine());
		if(i==2)
		{
		   int p;
		      System.out.println("�z���ˤ߹A����");
		   for(p=0;p<j;p++)
		   {
		      System.out.println("\t��"+(p+1)+"�Ӭ֮�G\n");
			  ((setPotted)sadfarm[p]).lookpot();
		   }
		   break;
		}
	
	}while(i!=0);
	
	}

}