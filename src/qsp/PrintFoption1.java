package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFoption1 {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("http://127.0.0.1:5500/multiSelect.html");
	WebElement cpListbox=driver.findElement(By.id("cp"));
	Select s=new Select(cpListbox);
	WebElement fsoption=s.getFirstSelectedOption();
	driver.close();
}
}
