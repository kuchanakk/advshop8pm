package exceldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldrive {
	
	static String excelpath = "\\resource\\excel\\testdata.xlsx";
	
	
	
	public String readdata(int row , int clm) throws IOException {
		String path1 =System.getProperty("user.dir");
		
		FileInputStream fis = new FileInputStream(path1+excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		return wb.getSheet("Sheet2").getRow(row).getCell(clm).getStringCellValue();	
		
	}
	
	
	public void writedata(int row , int clm , String value) throws IOException {
		String path1 =System.getProperty("user.dir");

		FileInputStream fis = new FileInputStream(path1+excelpath);
		XSSFWorkbook wb = new XSSFWorkbook(fis);	
		wb.getSheet("Sheet2").getRow(row).createCell(clm).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		fos.close();
		
	}
	
	

}
