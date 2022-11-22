package testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		@Test
		public void TakeDemoScreenshot() throws IOException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			TakesScreenshot s = (TakesScreenshot)driver;
			File src = s.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/gg.png");
			FileUtils.copyFile(src, dest);
			driver.close();		
	}
		
}
