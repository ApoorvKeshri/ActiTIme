package QSpseliniumrevisied;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class VbaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
public void openBrower() {
	Reporter.log("Openbrowser",true);
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterClass
public void closeBroswer() {
	Reporter.log("CloseBroswer",true);
	driver.close();
}
@BeforeMethod
public void login() {
	Reporter.log("Login",true);
	driver.get("https://demo.actiTime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='login']")).click();
}
@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
	driver.findElement(By.id("Logout")).click();
}
}
