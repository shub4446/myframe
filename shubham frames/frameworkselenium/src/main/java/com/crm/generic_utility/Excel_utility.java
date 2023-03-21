package com.crm.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_utility {
	/**
	 * this is to get data from excel file just give sheetname row and cell number as an input here
	 * excel sheet used is trip_book.xlsx
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 * @aurthor shubham
	 */
	public String getexcelvalues_trip(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream(ipathconstant_excel.EXCELFILE_PATH_BOOK);
		Workbook wb= WorkbookFactory.create(fis1);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();	
		return data;
	}
	/**
	 * 
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getexcelvalues_book(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream(ipathconstant_excel.EXCELFILE_PATH_BOOK);
		Workbook wb= WorkbookFactory.create(fis1);
		String data=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();	
		return data;
	}
	
	//selector
	public String getexcelvalues_bydataformattor(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream(ipathconstant_excel.EXCELFILE_PATH_BOOK);
		Workbook wb= WorkbookFactory.create(fis1);
		DataFormatter db=new DataFormatter();
		return db.formatCellValue(wb.getSheet(sheet).getRow(row).getCell(cell));
	}
	//mmt
	public String getexcelvalues_bydataformattor_for_mmt(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis1=new FileInputStream(ipathconstant_excel.ExcelFILE_path_trip);
		Workbook wb= WorkbookFactory.create(fis1);
		DataFormatter db=new DataFormatter();
		return db.formatCellValue(wb.getSheet(sheet).getRow(row).getCell(cell));
	}



}
