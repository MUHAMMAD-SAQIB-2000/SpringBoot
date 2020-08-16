import java.sql.*;

@SuppressWarnings("unused")
public class MainClass 
{
	public static void main(String[] args) throws Exception 
	{
		DriverClass.runSetup();
		System.out.println("_+_+_++_+_+_+_+_+_+_+_");
		DriverClass.allDataDisplay();
		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*");
		//DriverClass.insertData();
		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*");
		//DriverClass.insertDataPstatement();
		System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*");
		
		
	}

}
