import java.applet.Applet;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.sampled.*;

public class hw extends Applet //implements Runnable
{
    private Image fishAR;
	private Image fishBR;
	private Image fishAL;
	private Image fishBL;
	private Image trueFishL;
	private Image trueFishR;
	private Image backGround;
	private Image plant;
	private Thread1 t1;    
	private Thread2 t2;
	private Thread3 t3;
	private String str_fishAL,str_fishAR,str_fishBL,str_fishBR;
    int aX,aY,bX,bY,moveaX,moveaY,movebX,movebY,width,height,diraX=1,diraY=1,dirbX=-1,dirbY=1,cX,cY,movecX,movecY,dircX=1,dircY=1;              
    Image    OffScreen;                    
    Graphics drawOffScreen;               
	
    public void init() 
	{

		String str_fishAL = getParameter("fishAL");
		String str_fishBL = getParameter("fishBL");		
		String str_fishAR = getParameter("fishAR");
		String str_fishBR = getParameter("fishBR");
		String str_backGround = getParameter("backGround");
		String str_plant = getParameter("plant");
		String str_trueFishL = getParameter("trueFishL");
		String str_trueFishR = getParameter("trueFishR");
		fishAL = getImage(getDocumentBase(), str_fishAL);
		fishBL = getImage(getDocumentBase(), str_fishBL);
		fishAR = getImage(getDocumentBase(), str_fishAR);
		fishBR = getImage(getDocumentBase(), str_fishBR);
		trueFishL = getImage(getDocumentBase(), str_trueFishL);
		trueFishR = getImage(getDocumentBase(), str_trueFishR);
		backGround = getImage(getDocumentBase(), str_backGround);
		plant = getImage(getDocumentBase(),str_plant);

		aX      = 50;                         
		aY      = 60;                         
		bX		= 800;
		bY		= 200;
		cX		= 500;
		cY		= 100;
		width  = getSize().width;           
		height = getSize().height;          

		OffScreen     = createImage(width,height); 
		drawOffScreen = OffScreen.getGraphics();   
		
		t1 = new Thread1();
		t2 = new Thread2();
		t3 = new Thread3();
		t1.start();
		t2.start();
		t3.start();
		
	}
	class Thread1 extends Thread
	{
		
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

				moveaX = diraX*((int)(Math.random()*100)%3);
				moveaY = diraY*((int)(Math.random()*100)%3);
				aX = aX + moveaX;                   
				aY = aY + moveaY;                   
				
				if(aX >= (width - 182))
				{
					aX     = width - 182;
					diraX = -diraX;

				}
				if(aX <= 0)
				{
					aX = 0;
					diraX = -diraX;
				}
				if(aY >= (height - 91))
				{
					aY     = height - 91;
					diraY = -diraY;
				}
				if(aY <= 0)
				{
					aY = 0;
					diraY = -diraY;
				}	
			}
		}
	}

	class Thread2 extends Thread
	{
		
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

				movebX = dirbX*((int)(Math.random()*100)%3)*2;
				movebY = dirbY*((int)(Math.random()*100)%3)*2;
				bX = bX + movebX;                   
				bY = bY + movebY;                   

				if( ((bX<aX)&&((bX+109)>aX)) || ((bX>aX)&&(bX<(aX+182))))
				{				
					if( ((bY<aY)&&((bY+54)>aY)) || ((bY>aY)&&(bY<(aY+91))))
					{
						dirbX = -dirbX;
						dirbY = -dirbY;		
					}
				}
				if(bX >= (width - 109))
				{
					bX     = width - 109;
					dirbX = -dirbX;

				}
				if(bX <= 0)
				{
					bX = 0;
					dirbX = -dirbX;
				}
				if(bY >= (height - 54))
				{
					bY     = height - 54;
					dirbY = -dirbY;
				}
				if(bY <= 0)
				{
					bY = 0;
					dirbY = -dirbY;
				}	
			}
		}
	}
	class Thread3 extends Thread
	{
		
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

				movecX = dircX*((int)(Math.random()*100)%3);
				movecY = dircY*((int)(Math.random()*100)%3);
				cX = cX + movecX;                   
				cY = cY + movecY;                   
				
				if(cX >= (width - 213))
				{
					cX     = width - 213;
					dircX = -dircX;

				}
				if(cX <= 0)
				{
					cX = 0;
					dircX = -dircX;
				}
				if(cY >= (height - 87))
				{
					cY     = height - 87;
					dircY = -dircY;
				}
				if(cY <= 0)
				{
					cY = 0;
					dircY = -dircY;
				}	
			}
		}
	}
    public void paint(Graphics g) {
		
		
		drawOffScreen.drawImage(backGround,0,0,this);
		for(int i = 0;i<1082;i+=100)
		{
			drawOffScreen.drawImage(plant,i,398,this);
		}
		if(diraX < (diraX*-1))
		{
			drawOffScreen.drawImage(fishAL, aX, aY, this);
		}
		else if(diraX > (diraX*-1))
		{
			drawOffScreen.drawImage(fishAR, aX, aY, this);
		}
		if(dirbX < (dirbX*-1))
		{
			drawOffScreen.drawImage(fishBL, bX, bY, this);
		}
		else if(dirbX > (dirbX*-1))
		{
			drawOffScreen.drawImage(fishBR, bX, bY, this);
		}
		if(dircX < (dircX*-1))
		{
			drawOffScreen.drawImage(trueFishL, cX, cY, this);
		}
		else if(dircX > (dircX*-1))
		{
			drawOffScreen.drawImage(trueFishR, cX, cY, this);
		}
		g.drawImage(OffScreen,0,0,this);
    }

    public void update(Graphics g)        
   {
		paint(g);                           
   }

}

