import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
import java.io.*;
public class game extends JFrame{
	AudioClip ac;
	JButton [] b1;
	JButton send;
	Checkbox [] cb=new Checkbox[3];
	JLabel playerimage;
	JLabel computerimage;
	JTextArea textarea;
	/*Graphics drawOffScreen;
	Icon img1;*/
	int win=0,lose=0,die=0,bout=0,mode=0;
	int raceRoud=7,winTimes=4;
	/*******/
	public game() {
	ac=Applet.newAudioClip(ClassLoader.getSystemResource("music/Give Thanks.wav"));
	ac.loop();
	ac.play();

	setSize(800, 600);
	setTitle("�Υ��Ѫ����Y��");
	/********Menu********/
	JMenuBar bar = new JMenuBar();
	JMenu file = new JMenu("File"); //�[�JFile���
	file.setMnemonic('F');
	JMenuItem quit = new JMenuItem("Quit");
	quit.setMnemonic('Q');
	quit.addActionListener(new QuitActionListener());
	file.add(quit);
	JMenu about = new JMenu("About"); //�[�JAbout���
	about.setMnemonic('A');
	JMenuItem author = new JMenuItem("Author");
	author.setMnemonic('u');
	author.addActionListener(new AuthorActionListener());
	about.add(author);
	bar.add(file);
	bar.add(about);
	this.setJMenuBar(bar);
	/******Menu********/
	JLabel choosemode = new JLabel("��ܼҦ�");
	JLabel chooseplayer = new JLabel("��ܪ��a");
	JLabel playerlabel = new JLabel("   ���a");
	JLabel computerlabel = new JLabel("�q��   ");
	cb[0]=new Checkbox("�C�ԥ|��",true);
	cb[1]=new Checkbox("�@��w��Ĺ");
	cb[2]=new Checkbox("�T�Ԩ��");
	CheckboxGroup grp=new CheckboxGroup();
	b1=new JButton[4];
	b1[0]=new JButton("�Τl");
	b1[1]=new JButton("�Ѫ�");
	b1[2]=new JButton("��");
	b1[3]=new JButton("��");
	textarea=new JTextArea("�Υ��Ѫ����Y�ξ��Z",8,16);
	/*****************/

	Container container1 = new Container();
	Container container2= new Container();
	Container container3 = new Container();
	Container container4 = new Container();
	BorderLayout border= new BorderLayout(2,5);
	GridBagLayout gridbag = new GridBagLayout();
	container1.setLayout(gridbag); //�]�w�ƪ��覡��FLowLayout
	container2.setLayout(gridbag);
	container3.setLayout(gridbag);
	container4.setLayout(gridbag);
	send=new JButton("�T�w(�粒���⧹��)");
	this.setLayout(border);
	this.add(container1,border.NORTH);
	this.add(container2,border.WEST);
	this.add(container3,border.CENTER);
	this.add(container4,border.EAST);
	
	CheckBoxHandler handler = new CheckBoxHandler();
	container3.add(computerlabel);
	container3.add(playerlabel);
	container1.add(choosemode);
	container4.add(textarea);
	this.add(send,border.SOUTH);
	send.addActionListener(new WindowsListener());
	/*****************/
	for(int i=0;i<3;i++){
		cb[i].setCheckboxGroup(grp);//�]��ܼҦ�
		cb[i].addItemListener( handler );
		container1.add(cb[i]);//�[�J�T�ؼҦ�
	}
	container2.add(chooseplayer);//�[�J��ܪ��a
	for(int k=0;k<4;k++){
		//��ܪ��a
		b1[k].addActionListener(new WindowsListener());
		container2.add(b1[k]);
	}
	textarea.setEditable(false);//show
	

	/********************/
	
	//this.setVisible(true);
	
}

private class CheckBoxHandler implements ItemListener {//�ɨ�
	// respond to checkbox events
	public void itemStateChanged( ItemEvent event ){
		if ( event.getSource() == cb[0] ){//�ɨ�Ҧ�
			mode=0;
		}
		if ( event.getSource() == cb[1] ){
			mode=1;
		}
		if ( event.getSource() == cb[2] ){
			mode=2;
		}
	} // end method itemStateChanged
} // end private inner class CheckBoxHandler
/*********************************************************************************/
public void compute(){
	if(bout==0){
		for(int i=0;i<3;i++){
			cb[i].setEnabled(false);
		}
		switch(mode){
			case 0:
				raceRoud=7;
				winTimes=4;
				break;
			case 1:
				raceRoud=1;
				winTimes=1;
				break;
			case 2:
				raceRoud=3;
				winTimes=2;
				break;
		}
    }
	int p=playerimage.getDisplayedMnemonic();
	int c=computerimage.getDisplayedMnemonic();
	int j;
	String str="";
	if((p-c)==-1 || (p-c)==3){
		j=0;
		win++;
	}
	else if((p-c)==1 || (p-c)==-3){
		j=1;
		lose++;
	}
	else {
		j=2;
		die++;
	}
	switch(j){
		case 0:
			str="���a���";
			break;
		case 1:
			str="�q�����";
			break;
		case 2:
			str="����";
			break;
	}
	bout++;
	textarea.setText(str);
	textarea.append("\n��"+bout+"��\n\n\n���aĹ"+win+"��\n"+"�q��Ĺ"+lose+"��\n"+"����"+die+"��\n");
	raceRoud--;
	Result();
}
public void Result(){
		boolean over=false;
		//System.out.print(win+" "+winTimes);
		if(win>=winTimes){
			ResultShow(0);
			over=true;
		}
		else if(lose>=winTimes){
			ResultShow(1);
			over=true;
		}
		else if(raceRoud<1 && win<winTimes && lose<winTimes){
			if(win>lose){
				ResultShow(0);
			}
			else if(win<lose){
				ResultShow(1);
			}
			else{
				ResultShow(2);
			}
			over=true;
		}
		if(over){
			//System.out.print("����");
			for(int i=0;i<3;i++){
				cb[i].setEnabled(true);
			}
			win=lose=die=bout=0;
		}
}
public void ResultShow(int i){
		ac.stop();
		switch (i){
			case 0:
				JOptionPane.showMessageDialog(null,"���ɵ����A���aĹ");
				break;
			case 1:
				JOptionPane.showMessageDialog(null,"���ɵ����A�q��Ĺ");
				break;
			case 2:
				JOptionPane.showMessageDialog(null,"���ɵ����A����");
				break;
		}
		ac.loop();
}

private class WindowsListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent evt) {
		//System.out.println(evt);
		int i,ran;
		if(evt.getSource()==b1[0]){
			playerimage.setDisplayedMnemonic(0);
		}
		if(evt.getSource()==b1[1]){
			playerimage.setDisplayedMnemonic(1);
		}
		if(evt.getSource()==b1[2]){
			playerimage.setDisplayedMnemonic(2);
		}
		if(evt.getSource()==b1[3]){
			playerimage.setDisplayedMnemonic(3);
		}
		if(evt.getSource()==send){
			ran=((int)(Math.random()*4));
			computerimage.setDisplayedMnemonic(ran);
			compute();
		}
	}
}
//���UQuit���ƥ��ť��
private class QuitActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent evt) {
	System.exit(0);
	}
}
//���UAuthor���ƥ��ť��
private class AuthorActionListener implements ActionListener {
@Override
	public void actionPerformed(ActionEvent evt) {
	JOptionPane.showMessageDialog(null, "�@�̡G         �c�f޳\n���ɦѮv�Gù�s��\n���֡G         Give Thanks");
	}
}
public static void main(String[] args) {
	game gamego = new game();
	gamego.setVisible(true);
	gamego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}