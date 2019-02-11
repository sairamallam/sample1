package disconnection.dataBase.DataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBaseConnection implements DatabaseInterface {
	
	Connection con=null;
	PreparedStatement ps=null;
	String DriverClass="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:orcl";
	String username="agrabo";
	String password="agrabo";

	
	
	String username1="raipurbo1";
	String password1="raipurbo1";
	String password2="raipurbo1";

 


public Connection getConnection2()
{
	
	try{
		Class.forName(DriverClass);
		con = DriverManager.getConnection(url,username,password);
		 
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return con;
	
}



public Connection getRaipurConnection2()
{
	
	try{
		Class.forName(DriverClass);
		con = DriverManager.getConnection(url,username1,password1);
		 
		}catch(Exception e)
		{
			System.out.println(e);
		}
	return con;
	
}
	

}
