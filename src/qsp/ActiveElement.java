package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
  driver.switchTo().activeElement().sendKeys("java");
  
 driver.close();   
}
}
