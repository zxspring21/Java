import java.util.*;
public class Clock { 
	public static void main(String[] args)
	{	Calendar time=Calendar.getInstance(); 
		System.out.println("中華民國 "+time.get(Calendar.YEAR)+"年"+time.get(Calendar.MONTH)+"月"+time.get(Calendar.DATE)+"日"+time.get(Calendar.HOUR_OF_DAY)+"時"+time.get(Calendar.MINUTE)+"分"+time.get(Calendar.SECOND)+"秒");
	}
	
}