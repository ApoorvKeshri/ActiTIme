ackage qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingpropertyFile {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scroll(0,documentbody.scrollheight");
	Thread.sleep(3000);
	j.executeScript("window.scrollto10,0 "));
}
}
