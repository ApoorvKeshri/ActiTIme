package QSpseliniumrevisied;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertionTest {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  @Test
  public void VerifyTittle() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String etittle=driver.getTitle();
	  String atittle="soogle";
	  if(atittle.equals(atittle)) {
		  System.out.println("tittle is matching and pass");
	  }
	  else {
		  System.out.println("tittle is matching and fail");
	  }
	  driver.close();
	  
  }
}
