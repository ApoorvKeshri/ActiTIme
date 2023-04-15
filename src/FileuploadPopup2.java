import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.string;

public class FileuploadPopup2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:5500/image/naukari.html");
		Thread.sleep(3000);
		File f=new File("./data/ApoorvSTE_Cv.docx");
		String absolute=f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys("absoultepair");
	}

}
