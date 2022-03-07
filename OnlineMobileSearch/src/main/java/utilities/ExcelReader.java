package utilities;

import java.io.File;

public class ExcelReader {

	public void excelReader() {
		PathReader pathReader = new PathReader();
		File f = new File(pathReader.getProjectPath()+pathReader.getTestDataFileLocation("user_creds"));
		
	}
}
