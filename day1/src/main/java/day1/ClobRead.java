package day1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClobRead {

public static void main(String[] args) throws SQLException, Exception {
		
		String url = "jdbc:mysql://localhost/qae70";
		String username = "root";
		String password = "";
		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select cv from resume where eid = 100");
		while(rs.next()) {
			Clob clob = rs.getClob(1);
			Reader r = clob.getCharacterStream();
			FileWriter fw = new FileWriter("E:\\cloboutput.txt");
			int i;
			while((i=r.read()) != -1) {
				fw.write(i);
			}
			fw.close();
			i++;
			
		}
		
		
		
	}
}
