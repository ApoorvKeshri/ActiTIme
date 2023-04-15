package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectedfb {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
boolean button=driver.findElement(By.xpath("//button[@name='login']")).isSelected();
if(true) {
	System.out.println("button is selected");
}
else {
	System.out.println("button is not enbaled");
}

driver.close();
}
}
