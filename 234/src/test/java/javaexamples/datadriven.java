package javaexamples;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadriven 
{

	
	/*public static String directorypath = "C:\\Users\\kkumar5\\eclipse-workspace\\autotest\\234\\excelfile.xlsx";
	
	
	public static HashMap<String,String>  excel(String sheetname,int set) throws InvalidFormatException, IOException
	{
		XSSFWorkbook wb = null;
		XSSFSheet ws = null;
		File f = new File("C:\\Users\\kkumar5\\GIT\\radiobuttonprogramme\\234\\excelfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		 ws = wb.getSheet(sheetname);
		 
		 Row excelrow = ws.getRow(0);
		 Row excelset = ws.getRow(set);
		 HashMap<String,String> hs = new HashMap<String,String>();
		 
		 for(int j=0;j<=excelrow.getLastCellNum();j++)
		 {
			 String key = excelrow.getCell(j).getStringCellValue();
			// System.out.println(key);
			 String value = excelset.getCell(j).getStringCellValue();
		//System.out.println(value);

			 hs.put(key, value);
		 }
		 wb.close();
		 fis.close();
		return hs ;
	}
		 */
		

	
	public  HashMap<String, String> ReadExcelFile(String sheetName, int Set)
			throws IOException {
		File excelFile = new File("C://Users//kkumar5//GIT//radiobuttonprogramme//234//excelfile.xlsx");		
		FileInputStream excelInputStream = new FileInputStream(excelFile);
		Workbook excelWorkbook = null;

		// Assuming XLSX here. If XLS use HSSFWorkbook
		excelWorkbook = new XSSFWorkbook(excelInputStream);

		// Read the sheet inside the excel workbook
		Sheet excelSheet = excelWorkbook.getSheet(sheetName);

		// Get the number of rows
		// int rowCount =
		// excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();

		// Read all the rows
		// for (int i=0;i<=rowCount;i++){
		Row excelRow = excelSheet.getRow(0);
		Row excelSet = excelSheet.getRow(Set);

		HashMap<String, String> test = new HashMap<String, String>();

		// Now we need to read all the cell (column) values in each row
		for (int j = 0; j < excelRow.getLastCellNum(); j++) {
			// Output value to the console for now
			String key = excelRow.getCell(j).getStringCellValue();
			String value = excelSet.getCell(j).getStringCellValue();
			test.put(key, value);
		}

		// Close the file stream
		excelWorkbook.close();
		excelInputStream.close();
		return test;

	}

	@Test
	public void main()throws InterruptedException, IOException
	{
	
		HashMap<String,String> oem = ReadExcelFile("Sheet1",1);

		String.valueOf(oem.get("OEM_Name"));

	
	}
}