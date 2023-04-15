package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloptions {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver =new ChromeDriver();
driver.get("http://127.0.0.1:5500/multiSelect.html");
WebElement selected =driver.findElement(By.id("MTR"));
Select s=new Select(selected);
List<WebElement>optionsListWe=s.getOptions();
for(WebElement optWe:optionsListWe) {
	String optText=optWe.getText();
	System.out.println(optText);
}
	driver.close();
}
}
