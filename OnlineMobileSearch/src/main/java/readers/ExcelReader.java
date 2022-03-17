package readers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	static int row;
	static int column;

	// excel reader
	public static Object[][] dataExcelReader(String sheetName) throws IOException {

		String basePath = System.getProperty("user.dir");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(basePath + "/src/test/resources/user_creds.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet(sheetName);

		int rowCount = sheet.getLastRowNum();
		row = rowCount + 1;
		int columnCount = sheet.getRow(0).getLastCellNum();
		column = columnCount;
		Object[][] tesData = new String[rowCount + 1][columnCount];
//		System.out.println(rowCount);
//		System.out.println(columnCount);

		for (int i = 0; i <= rowCount; i++) {
			XSSFRow r = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				XSSFCell c = r.getCell(j);
				tesData[i][j] = cellData(c);
//				System.out.println(c);

			}
		}
		return tesData;
	}

	public static String cellData(XSSFCell cell) {
		String cellValue = null;
		if (cell.getCellType() == CellType.STRING) {
			cellValue = cell.getStringCellValue();
		} else if (cell.getCellType() == CellType.NUMERIC) {
			cellValue = String.valueOf((int) cell.getNumericCellValue());
		} else if (cell.getCellType() == CellType.BOOLEAN) {
			cellValue = String.valueOf(cell.getBooleanCellValue());
		}
		return cellValue;
	}

	// excel writer
	public void excelWriter(String[][] testdata, String filename, String sheetName) throws Exception {
		String basePath = System.getProperty("user.dir");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(basePath + "/src/test/resources/" + filename + ".xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet = wb.getSheet(sheetName);

		for (int i = 0; i < testdata.length; i++) {
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < testdata[0].length; j++) {
				XSSFCell cell = row.createCell(j);
				cell.setCellValue(testdata[i][j]);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Object[][] testdata = dataExcelReader("validUserCreds");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {
				System.out.println(testdata[i][j]);
			}
		}
	}

}
