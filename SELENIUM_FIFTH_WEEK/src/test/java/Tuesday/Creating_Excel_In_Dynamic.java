package Tuesday;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creating_Excel_In_Dynamic {
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/TestData/Data2.xlsx");
		
		XSSFWorkbook wk=new XSSFWorkbook();
		
		XSSFSheet sheet=wk.createSheet("Data");
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Rows : ");
		int rows=sc.nextInt();
		System.out.println("Number of Cells : ");
		int cells=sc.nextInt();
		for(int r=0;r<=rows;r++) {
			
			XSSFRow Crow =sheet.createRow(r);
			for (int c=0;c<cells;c++) {
				XSSFCell Ccell =Crow.createCell(c);
				Ccell.setCellValue(sc.next());
			}
		}
		XSSFRow row1=sheet.createRow(0);
				row1.createCell(0).setCellValue("OKk");
				row1.createCell(1).setCellValue("skfml");
		wk.write(file);
		wk.close();
		file.close();
		System.out.println("File Created");
	}
	
}
