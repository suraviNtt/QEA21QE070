package day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobWrite {

public static void main(String[] args) throws SQLException, Exception {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		PreparedStatement pstmt = conn.prepareStatement("insert into documents values(? ,?)");
		
			InputStream inputStream = new FileInputStream("E:\\avatargirl.jpg");
		
		pstmt.setInt(1,100 );
		pstmt.setBlob(2, inputStream);
		
		pstmt.executeUpdate();
		
		conn.close();
	}
}
