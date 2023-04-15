package QSpseliniumrevisied;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAutoSuggestion {
	
	static {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone x");
		Thread.sleep(3000);
		List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'iphone x')]"));
		int count = allSugg.size();
		Thread.sleep(3000);
		/*for (WebElement we : allSugg) {
			System.out.println(we.getText());
		}*/
		for (int i = 0; i < count; i++) {
			String text=allSugg.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
