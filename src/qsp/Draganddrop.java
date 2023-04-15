package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.vtiger.com/");
	WebElement source=driver.findElement(By.partialLinkText("Resources"));
	WebElement target=driver.findElement(By.partialLinkText("Customers"));
	Actions a=new Actions(driver);
	a.doubleClick();
}
}
