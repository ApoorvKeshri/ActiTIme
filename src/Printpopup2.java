import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.math3.analysis.function.Minus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printpopup2 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(3000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	 r.keyPress(KeyEvent.VK_RIGHT);
	 r.keyPress(KeyEvent.VK_RIGHT);
	 r.keyPress(KeyEvent.VK_RIGHT);
	 r.keyPress(KeyEvent.VK_RIGHT);
	 Thread.sleep(3000);
	 r.keyPress(KeyEvent.VK_1);
	 r.keyPress(KeyEvent.VK_MINUS);
	 r.keyPress(KeyEvent.VK_2);
	 Thread.sleep(2000);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyPress(KeyEvent.VK_ENTER);
	
	
}

}
