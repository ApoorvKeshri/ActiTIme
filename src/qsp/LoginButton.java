package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		boolean button=driver.findElement(By.xpath("//button[@name=\"login\"]")).isEnabled();
		Thread.sleep(400);
		if(true) {
		System.out.println("botton is enabled");
	}
		else {
			System.out.println("button is not enbaled");
		}
	}
}
	
	
	

