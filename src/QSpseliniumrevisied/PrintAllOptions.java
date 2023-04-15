package QSpseliniumrevisied;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/OneDrive/Desktop/Web%20techno/multiSelect.html");
		WebElement mtrlistbox=driver.findElement(By.name("mtr"));
		Select s=new Select(mtrlistbox);
		String text=s.getWrappedElement().getText();
		System.out.println(text);
		driver.close();
	}

}
