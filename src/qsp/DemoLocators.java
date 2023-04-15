package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("C:\\Users\\USER\\OneDrive\\Desktop\\Web techno\\amnchor.html");
    driver.findElement(By.tagName("a")).click();
    driver.navigate().back();
    driver.findElement(By.id("a")).click();
    driver.navigate().back(); 
	}

}
