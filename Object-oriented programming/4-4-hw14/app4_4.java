import java.io.*;
public class app4_4 {
	public static void main(String[] args)throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("輸入學生的人數");
		int member=Integer.parseInt(buf.readLine());
		int[][] grade=new int[member][3];
		for(int i=0;i<member;i++)
		{
			System.out.println("第"+(i+1)+"同學請輸入平時成績.期中成績,期末成績");
			for(int j=0;j<3;j++)
			{
				grade[i][j]=Integer.parseInt(buf.readLine());
			}
				
		}
		score(grade);             //注意，不是grade[][]
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
					System.out.println("第"+(i+1)+"平時成績為"+grade[i][j]);
				}
				if(j==1)
				{
					sum+=grade[i][j]*0.3;
					System.out.println("第"+(i+1)+"期中成績為"+grade[i][j]);
				}
				if(j==2)
				{
					sum+=grade[i][j]*0.4;
					System.out.println("第"+(i+1)+"期末成績為"+grade[i][j]);
				}
			}
			System.out.println("第"+(i+1)+"位學生學期成績為"+sum);
		}
	}
}
