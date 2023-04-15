package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScollbottom {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.bbc.com/");
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scroll(o,document.body.scrollheight");
	Thread.sleep(3000);
	j.executeScript("window.scrollTo10,0)");
}
}
