package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demolocator {
	static {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	}
	
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("file:///C:/Users/USER/eclipse-workspace/Automation/StaticWP/demo.html");//FTP
	driver.findElement(By.tagName("a")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.id("d1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.name("n1")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.className("c1")).click();
	Thread.sleep(2000);
	driver.close();
}
	
}

