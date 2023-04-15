package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectandDeselectAll {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:5500/multiSelect.html");
	WebElement mtrlistbox=driver.findElement(By.id("mtr"));
	Select s=new Select(mtrlistbox);
	List<WebElement>alloptions=s.getOptions();
	int count=alloptions.size();
	for(int i=0;i<count;i++) {
		s.selectByIndex(i);
	}
	for(int i=count-1;i>=0;i++) {
		s.deselectByIndex(i);
	}
}
}
