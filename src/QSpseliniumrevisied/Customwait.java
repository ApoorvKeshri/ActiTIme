package QSpseliniumrevisied;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customwait {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("(//a)[1]")).click();
	int i=0;
	while(i<=100) {
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch (NoSuchElementException e) {
		 i++;
		}
	}
}
}
