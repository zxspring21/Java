import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class demo extends Applet {

    private Image img_icon;    // 第一支魚
    private Image img_icon1;   // 第二支魚
    private Image img_icon2;   // 背景

    int f1x=50,f1y=60,f2X=200,f2Y=300;
    int f1moveX,f1moveY,f2moveX,f2moveY,width,height;
    int f1dirX=1,f1dirY=1,f2dirX=1,f2dirY=1;

    Thread newThread;                   //新執行緒

    Image    OffScreen;                    //次畫面
    Graphics drawOffScreen;                //繪製次畫面的Graphics實體

    public void init() 
    {

        // 從HTML內的參數來取得圖示的檔名
        String str_icon_name = getParameter("ICON_NAME");
        img_icon = getImage(getDocumentBase(), str_icon_name);
        String str_icon_name1 = getParameter("ICON_NAME1");
        img_icon1 = getImage(getDocumentBase(), str_icon_name1);
	String str_icon_name2 = getParameter("ICON_NAME2");
        img_icon2 = getImage(getDocumentBase(), str_icon_name2);

        width  = getSize().width;           //Applet的寬度
        height = getSize().height;          //Applet的高度

        OffScreen     = createImage(width,height); //建立次畫面
        drawOffScreen = OffScreen.getGraphics();   //取得次畫面的繪製類別
        fish1 newfish= new fish1();  
	newfish.start();
	fish2 newfish1= new fish2();  
	newfish1.start();
    }
	 
    public void paint(Graphics g) 
    {

      drawOffScreen.drawImage(img_icon2,0,0,this);
      drawOffScreen.drawImage(img_icon,f1X,f1Y,this);
      drawOffScreen.drawImage(img_icon1,f2X,f2Y,this);
      g.drawImage(OffScreen,0,0,this);
    }

    public void update(Graphics g)        
    {
      paint(g);                           
    }

   class fish1 extends Thread{
	public void run()
   {
      for(;;)           
      {
         repaint();                      

         try
         {
            Thread.sleep(50);           
         }
         catch(InterruptedException E){ }

         f1moveX = f1dirX*((int)(Math.random()*100)%3);
         f1moveY = f1dirY*((int)(Math.random()*100)%3);
         f1X = f1X + f1moveX;                   
         f1Y = f1Y + f1moveY;                  

 
         if(f1X >= (width - 30))
         {
            f1X     = width - 30;
            f1dirX = -f1dirX;
         }
         if(f1X <= 0)
         {
            f1X = 0;
            f1dirX = -f1dirX;
         }
         if(f1Y >= (height - 30))
         {
            f1Y     = height - 30;
            f1dirY = -f1dirY;
         }
         if(f1Y <= 0)
         {
            f1Y = 0;
            f1dirY = -f1dirY;
         }

      }
   }
   }
   class fish2 extends Thread{
	public void run()
   {
      for(;;)           
      {
         repaint();                      

         try
         {
            Thread.sleep(50);           
         }
         catch(InterruptedException E){ }

         f2moveX = f2dirX*((int)(Math.random()*100)%3+1);
         f2moveY = f2dirY*((int)(Math.random()*100)%3+1);
         f2X = f2X + f2moveX;                   
         f2Y = f2Y + f2moveY;                  

 
         if(f2X >= (width - 300))
         {
            f2X     = width - 300;
            f2dirX = -f2dirX;
         }
         if(f2X <= 0)
         {
            f2X = 0;
            f2dirX = -f2dirX;
         }
         if(f2Y >= (height - 30))
         {
            f2Y     = height - 30;
            f2dirY = -f2dirY;
         }
         if(f2Y <= 0)
         {
            f2Y = 0;
            f2dirY = -f2dirY;
         }

      }
   }
   }
 
   }
