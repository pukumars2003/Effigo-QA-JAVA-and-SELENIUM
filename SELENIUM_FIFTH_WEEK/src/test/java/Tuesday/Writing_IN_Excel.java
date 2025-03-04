package Tuesday;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_IN_Excel {
	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/TestData/Data1.xlsx");
		
		XSSFWorkbook wk=new XSSFWorkbook();
		
		XSSFSheet sheet=wk.createSheet("Data");
		
		XSSFRow row1=sheet.createRow(0);
				row1.createCell(0).setCellValue("OKk");
				row1.createCell(1).setCellValue("skfml");
		wk.write(file);
		wk.close();
		file.close();
		System.out.println("File Created");
	}
	
	
}
