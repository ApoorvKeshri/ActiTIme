package com.actitime.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Demoassertion1 {
  @Test
  public void verifyTittle() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String etittle="soogle";
	  String atittle=driver.getTitle();
	  Assertion s=new Assertion();
	  s.assertEquals(atittle,etittle);
	  driver.close();
	  ((SoftAssert) s).assertAll();
  }
}