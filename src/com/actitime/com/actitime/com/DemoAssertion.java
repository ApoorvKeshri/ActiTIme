package com.actitime.com.actitime.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  @Test
  public void verifyTittle() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String etittle="soogle";
	  String atittle=driver.getTitle();
	  if(atittle.equals(etittle)) {
		  System.out.println("tittle is matching and pass");	  
	  }
	  else {
		  System.out.println("tittle is not matching and fail");
	  }
	  driver.close();
  }
}
