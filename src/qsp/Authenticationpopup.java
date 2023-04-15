package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authenticationpopup {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	//to handle Authentication pop-up we can send user name and password along with the url.
}
}
