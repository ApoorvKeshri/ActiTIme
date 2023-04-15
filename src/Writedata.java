import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writedata {
public static void main(String[] args) throws IOException,EncryptedDocumentException {
	 FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
	 Workbook wb = WorkbookFactory.create(fis);
	  wb.getSheet("CreateCustomer").getRow(1).getCell(4).setCellValue("manual");
	  FileOutputStream fos = new FileOutputStream("./data/testscript.xlsx");
	  wb.write(fos);
	  wb.close();
	 
}


}

