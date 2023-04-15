package QSpseliniumrevisied;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwtbx;
@FindBy(xpath="//div[.='login']")
private WebElement lgbtx;

public void loginpage(WebDriver driver) {
	PageFactory.intiElement(driver,this);
}
void setlogin(String un,String pwd){
	untbx.sendKeys(un);
	pwtbx.sendKeys(pwd);
	lgbtx.click();
}
}
