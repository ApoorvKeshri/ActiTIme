package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAligment {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actiTime.com");
		int x1=driver.findElement(By.id("username")).getLocation().getX();
		int y1=driver.findElement(By.name("pwd")).getLocation().getY();
		Thread.sleep(3000);
		if(x1==y1) {
			System.out.println("username and password are alinged and pass");
		}
		else {
			System.out.println("username and password textbox are not properly alinged and fail");
		}
		driver.close();
	}
}
