package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox3 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("create new account")).click();
	Thread.sleep(3000);
	WebElement monthlist=driver.findElement(By.id("month"));
	Select s=new Select(monthlist);
	s.selectByIndex(10);
	Thread.sleep(3000);
	s.selectByValue("7");
	Thread.sleep(3000);
	s.selectByVisibleText("jan");
}
}
