package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
	public static String[][] excelData() throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./data/Data001.xlsx");

		XSSFSheet ws= wb.getSheetAt(0);

		int rowCount = ws.getLastRowNum();


		int columnCount= ws.getRow(0).getLastCellNum();
		
		System.out.println(rowCount);
		System.out.println(columnCount);
		
		
		String [][]data= new String [rowCount][columnCount];
		
		
		for(int i=1; i<=rowCount; i++) {
			
			
			for (int j=0; j<columnCount; j++) {
				
				
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				
				
				data[i-1][j]= cellValue;
			}
			
			
		}
		
		
		wb.close();
		
		
		return data;


	}


}
