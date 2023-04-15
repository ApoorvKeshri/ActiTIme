package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelfilee {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Resources/testscript.xlsx");
	Workbook w=WorkbookFactory.create(fis);
	String data = w.getSheet("CreateCustomer").getRow(0).getCell(2).getStringCellValue();
	System.out.println(data);
}
}
