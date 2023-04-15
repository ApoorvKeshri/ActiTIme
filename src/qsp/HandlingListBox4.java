package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox4 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[(@data-testid='open-registration-form-button')]")).click();
	Thread.sleep(3000);
	WebElement monthlist=driver.findElement(By.id("month"));
	Thread.sleep(2000);
	Select s=new Select(monthlist);
	s.selectByVisibleText("Jan");
	
}
}