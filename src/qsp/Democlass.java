package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Democlass {
static {
	System.setProperty("webdriver.driver.chrome","./driver/chromedriver.exe");
}
public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	Runtime.getRuntime().exec("notepad");
	Robot r=new Robot();
	Thread.sleep(1000);
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_Q);
	r.keyRelease(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_P);
}
}
