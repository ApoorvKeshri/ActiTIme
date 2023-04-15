package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LOginbuttoNr {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		WebElement link=driver.findElement(By.partialLinkText("Resources"));
		Actions a=new Actions (driver);
		a.moveToElement(link).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(2000);
		WebElement link1=driver.findElement(By.partialLinkText("Login"));
		a.doubleClick(link1).perform();

	}

}
