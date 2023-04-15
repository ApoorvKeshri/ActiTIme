package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAutosel {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> autoSugg= driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count =autoSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++){
			String text=autoSugg.get(i).getText();
			System.out.println(text);
		}
		autoSugg.get(7).click();
		driver.close();
	}
}
