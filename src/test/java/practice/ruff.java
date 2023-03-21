package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.generic_utility.ipathconstant_excel;

public class ruff {
	public String getexcelvalues_trip() throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream(ipathconstant_excel.EXCELFILE_PATH_BOOK);
		Workbook wb= WorkbookFactory.create(fis1);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();	
		System.out.println(data);
		return data;
	}
}