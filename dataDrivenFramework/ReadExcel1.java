package dataDrivenFramework;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static  String[][] exceldata() throws IOException {
		XSSFWorkbook wb=new XSSFWorkbook("./data/Data1223.xlsx");
		XSSFSheet ws=wb.getSheetAt(0);
		int rowcount  =  ws.getLastRowNum();
		int columncount=  ws.getRow(0).getLastCellNum();
		
		
		String[][] data=new String[rowcount][columncount];
		for (int i = 1; i <=rowcount; i++) {
		for (int j = 0; j < columncount; j++) {
			
		String cellvalue=	ws.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j]=cellvalue;
		}
			
		}
		wb.close();
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
}
