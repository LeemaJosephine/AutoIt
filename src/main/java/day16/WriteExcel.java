package day16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Get into the workbook
		
		XSSFWorkbook book= new XSSFWorkbook();
		
		//Create the sheet
		
		XSSFSheet sheet = book.createSheet("details");
		
		// Store the details -> Name (String) Age(int) City(String)
		
		Object[][] data = {
				
				{"Name","Age","City"},
				{"Ajay",20,"Delhi"},
				{"Arun",25,"Chennai"},
				{"Anbu",23,"Mumbai"}
				
		};
		
		// Put the data into the sheet
		
		int rowCount =0;
		
		// for each to get into each row
		
		for(Object[] row1 : data) {
			
			XSSFRow row = sheet.createRow(rowCount++);
			
			int columnCount = 0;
			
			// for each to get the columns
			
			for(Object col : row1) {
				
				XSSFCell cell = row.createCell(columnCount++);
				
				// Checking the type of data and making the entry
				if(col instanceof String) {
					
					cell.setCellValue((String)col);
					
				} else if (col instanceof Integer) {
					
					cell.setCellValue((Integer)col);
				}
			}
			
		}
		
		try {
			FileOutputStream output = new FileOutputStream("D:\\NewWorkSpace\\ExcelFileOperation\\src\\main\\java\\day16\\StudentDetails.xlsx");
			book.write(output);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		book.close();
	}

}
