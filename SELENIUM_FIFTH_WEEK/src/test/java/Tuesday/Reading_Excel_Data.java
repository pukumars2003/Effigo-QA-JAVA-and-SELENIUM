package Tuesday;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel_Data {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/TestData/Data.xlsx");
		
		XSSFWorkbook wk=new XSSFWorkbook(file);
		
		XSSFSheet sheet=wk.getSheet("Data");
		
		int Trows=sheet.getLastRowNum();
		System.out.println("Number of rows: "+Trows);
		int Tcells=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of cells: "+Tcells);
		
		
		
		for(int r=0;r<=Trows;r++){
			
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<Tcells;c++) {
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println(" ");
		}
		
		
		
	}
	
	
		
}
