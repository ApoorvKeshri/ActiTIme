package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;


public class Sychronization {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) { 
	WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("https://demo.actiTime.com/");
 driver.findElement(By.id("username")).sendKeys("admin");
 driver.findElement(By.name("pwd")).sendKeys("manager");
 driver.findElement(By.id("loginLink")).click();

}
}
