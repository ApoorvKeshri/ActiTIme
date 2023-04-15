package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowNum = wb.getSheet("InvalidLogin").getLastRowNum();
		//System.out.println(rowNum);
		for (int i = 1; i <= rowNum; i++) {
			String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).getStringCellValue();
			//System.out.println(un);
			String pwd= wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pwd);
		}
	}

}
