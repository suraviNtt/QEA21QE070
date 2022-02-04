package day1;

import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BlobRead {

public static void main(String[] args) throws SQLException, Exception {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from documents");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			Blob blob = rs.getBlob(2);
			byte arr[] = blob.getBytes(1,(int) blob.length());
			FileOutputStream fo = new FileOutputStream("E:\\bloboutput.jpg");
			fo.write(arr);
			
		}
		
		
		
	}
}
