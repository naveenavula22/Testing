package automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("file:///C:/Users/Asus/OneDrive/Desktop/resume.html");
		Thread.sleep(1000);
		File f = new File("C:\\Users\\Asus\\OneDrive\\Desktop");
		Thread.sleep(1000);
		String Absolutepath = f.getAbsolutePath();
		Thread.sleep(1000);
		driver.findElement(By.id("cv")).sendKeys(Absolutepath);
		Thread.sleep(1000);
		driver.close();
	}

}
