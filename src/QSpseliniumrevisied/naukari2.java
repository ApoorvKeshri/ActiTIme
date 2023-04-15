package QSpseliniumrevisied;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukari2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
	driver.findElement(By.linkText("Login")).click();
	driver.findElement(By.xpath("//input[@placeholder='enter your actiTime email.id)"));
	driver.findElement((By.xpath("//button[@class='btn-primary-loginbutton')")));
}
}
