package QSpseliniumrevisied;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readmultipledata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./resources/testscripts.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount=wb.getSheet("invaildlogin").getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			String un=wb.getSheet("invalidLogin").getRow(i).getCell(0).getStringCellValue();
			String pw=wb.getSheet("InvalidLogin").getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(un+""+pw);
		}
		
	}

}

