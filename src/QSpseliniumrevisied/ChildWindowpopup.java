package QSpseliniumrevisied;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowpopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://in.indeed.com/");
	String wh=driver.getWindowHandle();
	System.out.println(wh);
	driver.close();

}
}
