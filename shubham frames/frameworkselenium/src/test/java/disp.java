import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class disp {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis1= new FileInputStream("./trip_book.xlsx");
		Workbook wb=WorkbookFactory.create(fis1); 
		String d1 = wb.getSheet("journey").getRow(0).getCell(0).getStringCellValue();
		String d2 =wb.getSheet("journey").getRow(1).getCell(0).getStringCellValue();
		System.out.println(d1);
		System.out.println(d2);
		FileInputStream fis3= new FileInputStream("./trip_book.xlsx");
		Workbook wb2=WorkbookFactory.create(fis3); 
		String d4 = wb2.getSheet("journey").getRow(0).getCell(0).getStringCellValue();
		FileInputStream fis4= new FileInputStream("./trip_book.xlsx");
		Workbook wb1=WorkbookFactory.create(fis4); 
		String d3 =wb1.getSheet("journey").getRow(1).getCell(0).getStringCellValue();
		System.out.println(d3);
		System.out.println(d4);
	}

}
