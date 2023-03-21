package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class data_setting_to_db {

	public static void main(String[] args) throws SQLException {

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_yantra","root","root");
		Statement stat = conn.createStatement();
		String query="insert into student (id,first_name,address,phno_num,email) values ('15','suhan','uganda',881,'sbhute89@gmail.com')";
		String query1="insert into student (id,first_name,address,phno_num,email) values ('16','shan','austrlia',99,'sbhute89@gmail.com')";
		int result = stat.executeUpdate(query);
		int result1=stat.executeUpdate(query1);

		if(result==1 && result1==1) {

			System.out.println("usercreated");
		}
		else {
			System.out.println("user not created");
		}
	}
}
