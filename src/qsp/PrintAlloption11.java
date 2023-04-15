package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAlloption11 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
List<WebElement> allSugg=driver.findElements(By.xpath("(//input)[1])"));
int count=allSugg.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	String text=allSugg.get(i).getText();
	System.out.println(text);
}
allSugg.get(0).click();
}
}
