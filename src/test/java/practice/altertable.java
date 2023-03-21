package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class altertable {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
		Statement stat = conn.createStatement();
		String query="ALTER TABLE student ADD COLUMN email VARCHAR(40) NOT NULL";
		String query1="select * from student";
		int result = stat.executeUpdate(query);
		ResultSet result1=stat.executeQuery(query1);

		if(result==1) {

			System.out.println("usercreated");
		}
		else {
			System.out.println("user not created");
		}
		while(result1.next()) {
			System.out.println(result1.getInt(1)+"\t"+result1.getString(2)+"\t"+"\t"+result1.getString(3)+"\t"+result1.getString(4));
		}
		conn.close();		
	}
}
