package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelfile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./resources/testscript.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data = wb.getSheet("CreateCustmer").getRow(1).getCell(2).getStringCellValue();
	System.out.println(data);
}
}
