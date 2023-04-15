package qsp;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathAbsoutle {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3AJeans%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		
	WebElement a=driver.findElement(By.xpath("//h3[@class='product-brand' and text()='H&M']/..//div[@class='product-price']/span[1]"));
	 System.out.println(a.getText());
		driver.close();
	}
}
