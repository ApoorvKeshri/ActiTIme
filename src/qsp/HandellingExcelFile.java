package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;



public class HandellingExcelFile {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
	
	FileInputStream fis = new FileInputStream("./resources/testscript.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String url = wb.getSheet("CreateCustomer").getRow(0).getCell(1).getStringCellValue();
	String un = wb.getSheet("CreateCustomer").getRow(1).getCell(1).getStringCellValue();
	String pwd = wb.getSheet("CreateCustomer").getRow(2).getCell(1).getStringCellValue();
	
	WebDriver driver=new ChromeDriver();
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
}
}
