package QSpseliniumrevisied;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingdisableElements {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:5500/image/Disabled.html");
	driver.findElement(By.id("d1")).sendKeys("admin");
	RemoteWebDriver r=(RemoteWebDriver)driver;
	r.executeScript("document.getElementbyid('d2'),value='manager'");
}
}
