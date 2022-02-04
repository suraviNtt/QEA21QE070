package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PSexample {

public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt = conn.prepareStatement("insert into qaeeg values(? ,?)");
		pstmt.setInt(1, 108);
		pstmt.setString(2, "Bangalore");
		pstmt.executeUpdate();
		pstmt.setInt(1, 101);
		pstmt.setString(2, "Bangalore");
		pstmt.executeUpdate();
		pstmt.setInt(1, 102);
		pstmt.setString(2, "Bangalore");
		pstmt.executeUpdate();
		
		conn.close();
	}
}
