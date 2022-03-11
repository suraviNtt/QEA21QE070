package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

	public void excelWriter(String[][] testdata , String filename , String sheetName) throws Exception {
		String basePath = System.getProperty("user.dir");
		FileInputStream fis=null;
		try {
			fis = new FileInputStream(basePath+"/src/test/resources/"+filename+".xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		for(int i = 0 ; i < testdata.length ; i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j = 0 ; j < testdata[0].length ; j++) {
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(testdata[i][j]);
			}
		}
	}
}
