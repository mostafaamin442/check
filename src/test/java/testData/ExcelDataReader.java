package testData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	
	static FileInputStream fis = null;
	
	public Object[][] getExcelData() throws IOException
	{
		String filePath = System.getProperty("user.dir")+"\\testData\\TestData.xlsx";
		File scrFile = new File(filePath);
		fis = new FileInputStream(scrFile);
		
		///excel///
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int TotalRows= sheet.getLastRowNum()+1;
		int TotalColm = 10;
		String[][] arrExcel = new String[TotalRows][TotalColm];	
		
		for(int row = 0 ; row<TotalRows ; row++)
		{
			for(int	col = 0 ; col<TotalColm ; col++)
			{
				XSSFRow rowsh = sheet.getRow(row); 
				arrExcel[row][col] = rowsh.getCell(col).toString();
			}
		}		
		wb.close();
		return arrExcel;
	}
	
	
}
