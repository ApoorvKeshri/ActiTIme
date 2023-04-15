package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PntHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement lgBtn=driver.findElement(By.name("login"));
		int height= lgBtn.getSize().getHeight();
		int width=lgBtn.getSize().getHeight();
		System.out.println(height);
		System.out.println(width);
		driver.close();
	}

}
