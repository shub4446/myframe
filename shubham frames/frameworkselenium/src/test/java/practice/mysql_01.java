package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class mysql_01 {

	public static void main(String[] args) throws SQLException {
		Driver driverref=new Driver();
		DriverManager.registerDriver(driverref);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra", "root", "root");
		Statement stat=conn.createStatement();
		String selectquery="select* from student";
		ResultSet result=stat.executeQuery(selectquery);
		
		while(result.next()) {
			System.out.println(result+"\t"+result.getString(2)+"\t"+result.getString(3));
		}
		
		conn.close();
	
	}

}
