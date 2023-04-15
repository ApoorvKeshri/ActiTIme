package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAlloptionss {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("http://127.0.0.1:5500/multiSelect.html");
		WebElement cplistbox=driver.findElement(By.id("cp"));
		Select s=new Select(cplistbox);
		List<WebElement>allOptions=s.getOptions();
		for(int i=0;i<allOptions.size();i++) {
		String text=allOptions.get(i).getText();
		System.out.println(text);
		}
			driver.close();
		}

}
