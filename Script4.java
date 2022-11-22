package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opensourcebilling.org/");
	driver.findElement(By.id("email")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).clear();
	Thread.sleep(2000);
	driver.close();
	}

}
