package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbbutton {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement( By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement Date =driver.findElement(By.id("day"));
		Select s=new Select(Date);
		s.selectByIndex(21);
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Jun");
		Thread.sleep(3000);
		WebElement	year=driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1996");
		Thread.sleep(3000);
	}

}
