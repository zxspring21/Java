import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
abstract class car{
	String name;
	String year;
	abstract public void drive();
	public void setName(String name){
		this.name=name;
	}
	public void setYear(String year){
		this.year=year;
	}
	public void showName(){
		System.out.println(name+"�T���A");
	}
	public void showYear(){
		System.out.println("�X����"+year+"�~�A");
	}
}
class AutoDriveCar extends car{
	public void drive(){
		System.out.println("�۰ʾr�p");
	}
	AutoDriveCar(){
		
	}
}
class TraditionalCar extends car{
    public void drive(){
    	System.out.println("��ʾr�p");
    		
	}
    TraditionalCar(){
    	
    }
}
public class a4 {
	public static void main(String args[])throws IOException{
		 BufferedReader buf=new BufferedReader
					(new InputStreamReader (System.in));
		 AutoDriveCar a=new AutoDriveCar();
		 TraditionalCar t=new TraditionalCar();
		 a.setName(buf.readLine());
		 a.setYear(buf.readLine());
		 t.setName(buf.readLine());
		 t.setYear(buf.readLine());
		 a.showName();
		 a.showYear();
		 a.drive();	
	 t.showName();
	 t.showYear();
	 t.drive();	}
}
