package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageesource {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
	try {
		driver.get("https://demo.actiTime.com/");
		System.out.println("page is load within 7sec and pass ");
		}
	catch(Exception e) {
		System.out.println("page is not loaded within 7 second and fail");
	}
	driver.close();
		
	}

}
