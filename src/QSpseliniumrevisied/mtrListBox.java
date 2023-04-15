package QSpseliniumrevisied;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mtrListBox {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:5500/multiSelect.html");
	
	 WebElement mtrlistbox = driver.findElement(By.id("MTR"));
	 Select s=new Select(mtrlistbox);
	 String text = s.getWrappedElement().getText();
	 System.out.println(text);
	 driver.close();
}
}


