package com.actitime.com.actitime.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CustomerModule {
  @BeforeMethod
  public void Login() {
	  Reporter.log("Login",true);
  }

  @AfterMethod
  public void Logout() {
	  Reporter.log("Logout",true);
  }

  @Test
  public void CreateCustomer() {
	  Reporter.log("CreateCustomer",true);
  }

  @Test
  public void ModifyCustomer() {
	  Reporter.log("ModifyCustomer",true);
  }

}
