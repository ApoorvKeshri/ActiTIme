package QSpseliniumrevisied;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogo {
static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
 Boolean logo =driver.findElement(By.xpath(("//img[@alt='Facebook']"))).isDisplayed();
	if(logo==true) {
		System.out.println("Logo is displayed and pass");
}
	else {
		System.out.println("Logo is displayed and fail");
	}
	driver.quit();
}
}
