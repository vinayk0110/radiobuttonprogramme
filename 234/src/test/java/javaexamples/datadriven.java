package javaexamples;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;


import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven 
{

	
	public static String directorypath = "C:\\Users\\kkumar5\\eclipse-workspace\\autotest\\234\\excelfile.xlsx";
	
	
	public static HashMap<String,String>  excel(String sheetname,int set) throws InvalidFormatException, IOException
	{
		XSSFWorkbook wb = null;
		XSSFSheet ws = null;
		File f = new File(directorypath);
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
		

			 hs.put(key, value);
		 }
		 wb.close();
		 fis.close();
		return hs ;
		 
		 
		

	

	
	

	
	
	}
	public static void main(String[] args) throws InvalidFormatException, IOException
	{

	HashMap<String,String> oem = excel("Sheet1",1);
	
	{
	oem.get("username").toString();
		
	}
	
	

	}
}

