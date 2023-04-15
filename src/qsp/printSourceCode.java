package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printSourceCode {
	static {
		System.setProperty("webdriver.chorme.driver","./driver/chormedriver.exe");
	}

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String htmlCode=driver.getPageSource();
	System.out.println(htmlCode);
    driver.close();
	}
}
