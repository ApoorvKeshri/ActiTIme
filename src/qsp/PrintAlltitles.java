package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlltitles {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	driver.findElement(By.id("apple-signin-button")).click();
	driver.findElement(By.id("login-facebook-button")).click();
	Set<String> allwhd=driver.getWindowHandles();
	for(String wh:allwhd) {
		driver.switchTo().window(wh);
		String tittle=driver.getTitle();
		System.out.println(tittle);
	}
	driver.quit();
}
}
 