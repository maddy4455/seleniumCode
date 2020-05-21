package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;

public class ReadingdataFromExcel {

	public static void main(String[] args) throws IOException {
		
		 FileInputStream file=new FileInputStream("C:\\Users\\yavyo\\Desktop\\Datadriven.file.xlsx");
		 
		 XSSFWorkbook workbook=new XSSFWorkbook(file);
		 XSSFSheet sheet=workbook.getSheet("sheet1");
		 int rowcount=sheet.getLastRowNum(); //returns the row count
		 
		 int colcount=sheet.getRow(0).getLastCellNum(); //returns the coloumn nmbr
		 
		 for(int i=0;i<rowcount;i++)
		 {
			XSSFRow  currentrow=sheet.getRow(i); //focused on current row
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print("  "   +value);
			}
			System.out.println();
		 }

	}

}
