import java.util.*;
public class Clock { 
	public static void main(String[] args)
	{	Calendar time=Calendar.getInstance(); 
		System.out.println("���إ��� "+time.get(Calendar.YEAR)+"�~"+time.get(Calendar.MONTH)+"��"+time.get(Calendar.DATE)+"��"+time.get(Calendar.HOUR_OF_DAY)+"��"+time.get(Calendar.MINUTE)+"��"+time.get(Calendar.SECOND)+"��");
	}
	
}