package com.actitime.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class CustomerModulees {
  @BeforeClass
  public void Openbroswer() {
	  Reporter.log("open browser",true);
  }

  @AfterClass
  public void close() {
	  Reporter.log("Close browser",true);
  }

  @BeforeMethod
  public void Login() {
	  Reporter.log("Login",true);  
  }
  @AfterMethod
  public void Logout() {
	  Reporter.log("Logout",true);
  }
  @Test(priority=1,invocationCount=2)
  public void editCustomer() {
	  Reporter.log("editCustomer",true);  
  }
  @Test
  public void RegisterCustomer(){
	  Reporter.log("Register Customer",true);
  }
  @Test
  public void deleteCustomer(){
	  Reporter.log("DeleteCustomer",true);
  }

}
