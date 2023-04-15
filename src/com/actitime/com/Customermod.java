package com.actitime.com;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Customermod {
    @BeforeMethod
  public void Login() {
    	Reporter.log("Login",true);  	
  }
  @AfterMethod
  public void Logout() {
	  Reporter.log("Logout",true);
  }
  @test
  public void createcustomer() {
	  Reporter.log("CreateCustomer",true);
  }
  @test
  public void modifyCustomer() {
	  Reporter.log("ModifyCustomer",true);
  }
}
