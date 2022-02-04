package day1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClobWrite {

public static void main(String[] args) throws SQLException, Exception {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt = conn.prepareStatement("insert into resume values(? ,?)");
		
			FileReader inputStream = new FileReader("E:\\testfile.txt");
		
		pstmt.setInt(1,100 );
		pstmt.setClob(2, inputStream);
		
		pstmt.executeUpdate();
		
		conn.close();
	}
}
