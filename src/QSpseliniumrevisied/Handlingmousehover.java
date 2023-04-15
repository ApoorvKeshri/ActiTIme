package QSpseliniumrevisied;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingmousehover {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.vtiger.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement resource = driver.findElement(By.partialLinkText("Resources"));
	Actions q=new Actions(driver);
	q.moveToElement(resource).perform();
	driver.findElement(By.partialLinkText("Contact Us")).click();
	 String pn = driver.findElement(By.xpath("//p[contains(text(),\"Bengaluru\")]")).getText();
	System.out.println(pn);
}
}
