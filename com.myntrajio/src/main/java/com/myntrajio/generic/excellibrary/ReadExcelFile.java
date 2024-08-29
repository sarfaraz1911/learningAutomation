package com.myntrajio.generic.excellibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.myntrajio.generic.commonlibrary.FrameWorkConstant;

public class ReadExcelFile implements FrameWorkConstant {

	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public Workbook wb = null;

	public String readData(String sheet, int row, int column) {
		// Step 1 :Convert physical file into java readable object by
		// FileInputStream
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// step 2:open the wokbook by creating WB- factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// step 3: fetch the data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		// step 4: close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return data;
	}

	public void writeData(int column, int row, String sheet, int data) {
		// Step 1:// Step 1 :Convert physical file into java readable object by
		// FileInputStream
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// step 2: open the wokbook by creating WB- factory
		try {
			wb = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// step 3:write the data
		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
		// step 4:convert data from java type to physical file
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// step 5: write the EXcel
		try {
			wb.write(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// step 6: close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void displayData(String sheet, int row, int column) {

		// Step 1 :Convert physical file into java readable object by
		// FileInputStream
		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Step 2: Create the WorkBook

		try {
			WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// write the data
		String data = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();

		// Step 4: print the data
		System.out.println(data);

		// step 5: close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readMultipleData() {
		// step 1: :Convert physical file into java readable object by
		// FileInputStream

		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// step 2:open the workbook by reating WB-factory
		try {
			WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// how to fetch the multiple data

		// fetch the last row count
		int count = wb.getSheet("Register").getLastRowNum();

		// fetch data of students details
		for (int i = 1; i <= count; i++) {
			String data = wb.getSheet("Register").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}
		// close the workbook
		try {
			wb.close();
		} catch (IOException e) {
			// TODO Auto-generated catch 
			e.printStackTrace();
		}
	}

}
