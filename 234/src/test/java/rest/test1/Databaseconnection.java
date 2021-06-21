package rest.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Databaseconnection
{
	static final String DB_URL = "jdbc:oracle:thin:@q1entp-scan.res.prod.global:1521/Q1ENTP_USERS_SERVICE";

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//step1 load the driver class  
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		//step2 create  the connection object  

		Connection con=DriverManager.getConnection( DB_URL,"RESULTS","f_nUxR1E");
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from doc_owner.stage_dealer_element_attrib");  
		while(rs.next())  
		{
			rs.next();
			System.out.println(rs.getString(3));
			break;
		}
		rs.close();
		stmt.close();
		con.close();
	}catch(SQLException se){
		//Handle errors for JDBC
		se.printStackTrace();
		}catch(Exception e){
		//Handle errors for Class.forName
		e.printStackTrace();
	

}
	}
}
