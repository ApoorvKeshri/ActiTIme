package QSpseliniumrevisied;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingexcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./Automation/resources/commondata.property");
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet("createcustomer").getRow(1).getCell(4).setCellValue("fail");
	FileOutputStream fos=new FileOutputStream("./resources/testscripts.xlsx");
	wb.write(fos);
	wb.close();
}
}
