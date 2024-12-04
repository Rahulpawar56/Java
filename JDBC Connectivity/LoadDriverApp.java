import java.sql.*;
public class LoadDriverApp
{
	public static void main(String x[])
	{
		//com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		//DriverManager.registerDriver(d);
		//System.out.println("Driver Loaded Succesfully...");
	
	try {	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcapp","root","Rahul");
		if(con!=null)
		{
			System.out.println("COnnected....");
		}
		else
		{
			System.out.println("Not COnnected....");
		}
	}
	catch(Exception ex)
	{
		System.out.println("Error "+ex.getMessage());
	}
	}

}