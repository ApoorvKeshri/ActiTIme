package QSpseliniumrevisied;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
  @FindBy(id="username")
  private WebElement untbx;
  @FindBy(name="pwd")
  private WebElement pwtBx;
  @FindBy(xpath="//div[.='Login']")
  private WebElement lgBt;
 public static WebDriver driver;
  public static void main(String[] args) {
	  
  }
  public void LoginPage(WebDriver driver) {
	  PageFactory.initElements(driver,this);
  }
  public void setLogin(String un,String pw) {
	  untbx.sendKeys(un);
	  pwtBx.sendKeys(pw);
	  lgBt.click();
  }
  
  
}
