import java.io.*;
public class app4_4 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("��J�ǥͪ��H��");
		int member=Integer.parseInt(buf.readLine());
		int[][] grade=new int[member][3];
		for(int i=0;i<member;i++)
		{
			System.out.println("��"+(i+1)+"�P�ǽп�J���ɦ��Z.�������Z,�������Z");
			for(int j=0;j<3;j++)
			{
				grade[i][j]=Integer.parseInt(buf.readLine());
			}
				
		}
		score(grade);             //�`�N�A���Ograde[][]
	}
	static void score(int grade[][])
	{
		for(int i=0;i<3;i++)
		{	int sum=0;
			for(int j=0;j<3;j++)
			{
				if(j==0)
				{
					sum+=grade[i][j]*0.3;
					System.out.println("��"+(i+1)+"���ɦ��Z��"+grade[i][j]);
				}
				if(j==1)
				{
					sum+=grade[i][j]*0.3;
					System.out.println("��"+(i+1)+"�������Z��"+grade[i][j]);
				}
				if(j==2)
				{
					sum+=grade[i][j]*0.4;
					System.out.println("��"+(i+1)+"�������Z��"+grade[i][j]);
				}
			}
			System.out.println("��"+(i+1)+"��ǥ;Ǵ����Z��"+sum);
		}
	}
}
