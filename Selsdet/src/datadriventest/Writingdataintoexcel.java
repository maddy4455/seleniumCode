package datadriventest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writingdataintoexcel {

	public static void main(String[] args) throws IOException{
		FileOutputStream file=new FileOutputStream("C:\\Users\\yavyo\\Desktop\\Test5.file.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("Dataset1");
		XSSFSheet sheet2=workbook.createSheet("Dataset2");
		
		for(int i=0; i>=5;i++) {
			
			XSSFRow row1=sheet1.createRow(i);
			XSSFRow row2=sheet2.createRow(i);
			
			for(int j=0;j>3;j++) {
				
				row1.createCell(j).setCellValue("xyz");
				row2.createCell(j).setCellValue("abc");
			}
			
			
		}

	}

}
