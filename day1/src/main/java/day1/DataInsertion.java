package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataInsertion {

public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("insert into employee values(103,'Shreya',80000,'Mumbai')");
		
		conn.close();
	}
}
