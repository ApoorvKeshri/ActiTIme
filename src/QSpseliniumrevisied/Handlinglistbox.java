package QSpseliniumrevisied;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlinglistbox {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(3000);
	WebElement monthlistbox=driver.findElement(By.id("month"));
	Select s=new Select(monthlistbox);
	s.selectByIndex(10);
	Thread.sleep(3000);
	s.selectByValue("7");
	Thread.sleep(3000);
	s.selectByVisibleText("Jun");
	Thread.sleep(3000);
	WebElement daylistbox=driver.findElement(By.id("day"));
	Select s1=new Select(daylistbox);
	s1.selectByIndex(21);
	Thread.sleep(3000);
	WebElement yearlistbox=driver.findElement(By.id("year"));
	Select s2=new Select(yearlistbox);
	s2.selectByVisibleText("1996");
	
	
}
}
