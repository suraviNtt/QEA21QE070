package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PSexample2 {

public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt = conn.prepareStatement("insert into qaeeg values(? ,?)");
		pstmt.setInt(1, 109);
		pstmt.setString(2, "Bangalore");
		pstmt.setInt(1, 111);
		pstmt.setString(2, "Bangalore");
		pstmt.setInt(1, 112);
		pstmt.setString(2, "Bangalore");
		pstmt.executeUpdate();
		
		conn.close();
	}
}
