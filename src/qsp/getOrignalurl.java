package qsp;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class getOrignalurl {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		String url=driver.getCurrentUrl();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		if(url.equals("https://www.selenium.dev/downloads/")) {
			System.out.println("url is navigating sucessfully fail and pass ");
		
			}
		else {
			System.out.println("url is not navigating succesfully ");
		}
		driver.close();
	}

}
