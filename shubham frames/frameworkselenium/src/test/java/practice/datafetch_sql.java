package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class datafetch_sql {

	public static void main(String[] args) throws SQLException  {
	Driver driverref= new Driver();
	DriverManager.registerDriver(driverref);
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
	Statement stat = conn.createStatement();
	 String query = "select * from student " ;
	ResultSet res = stat.executeQuery(query);
	
	while(res.next()) {
		System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+"\t"+res.getString(3));
	}
	conn.close();		
	}

}
