package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.tagName(("//div[.='DEL - Delhi, India'])[2]"))).click();
 Thread.sleep(2000);
	driver.findElement(By.tagName("//div[.='Raja Bhoj Airport'])")).click();

}
}
