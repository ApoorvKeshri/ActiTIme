package QSpseliniumrevisied;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoPom {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  @Test
  public static void main(String [] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.actitime.com/");
	  WebElement untBx=driver.findElement(By.id("username"));
	  driver.navigate().refresh();
	  untBx.sendKeys("admin");
  }
}
