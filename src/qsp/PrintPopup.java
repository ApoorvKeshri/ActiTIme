package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.peer.RobotPeer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_TAB);
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyPress(KeyEvent.VK_RIGHT);
	r.keyPress(KeyEvent.VK_RIGHT);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_1);
	r.keyPress(KeyEvent.VK_MINUS);
	r.keyPress(KeyEvent.VK_2);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
}
