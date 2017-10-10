import java.awt.*;
import java.awt.event.*;
class hw extends Frame
{
   private Closer Handler;

   int count=0;
   static Button btn=new Button("計算次數");
   static Button btn2=new Button("重來");
   static Label lab=new Label("你一共按下了0次");
   hw()
   {
      Handler=new Closer();
	  setTitle("homework1");
	  setSize(270,100);
	  setLayout(null);
	  btn.setBounds(10,30,120,30);
	  btn2.setBounds(140,30,120,30);
	  lab.setBounds(95,70,130,30);
	  add(btn);
	  add(btn2);
	  add(lab);
	  btn.addActionListener(new btnListener());
	  btn2.addActionListener(new btn2Listener());
	  addWindowListener(Handler);   //要加Handler!!!	  
	  show();
	  setVisible(true);
   
   }
   public static void main(String args[])
   {
      hw frm=new hw();
   }
   class btnListener implements ActionListener
   {
      int flag=0;
	  public void actionPerformed(ActionEvent a)
	  {   
	     
		 count++;
		 lab.setText("你一共按下了"+count+"次");
	     if((count%10)==0)flag=flag+1;
		 if(flag==3){
		             setBackground(Color.green);
	                 flag=0;
		 }
		 if(flag==2){setBackground(Color.yellow);}
		 if(flag==1){setBackground(Color.red);}
		
		
	  }
   }
   class btn2Listener implements ActionListener
   {
      public void actionPerformed(ActionEvent a)
	  {   
	     count=0;
		 lab.setText("你一共按下了"+count+"次");
	  }
   }
}
class Closer extends WindowAdapter
{
   public void windowClosing(WindowEvent e)
   {
      System.exit(0); //是extends!!!
   }
}