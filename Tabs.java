package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement tab = driver.findElement(By.id("tabButton"));
				tab.click();
				tab.click();
				tab.click();
		Set<String> alltabs = driver.getWindowHandles();
		int count = alltabs.size();
		System.out.println(count);
		for (String tab1 : alltabs) {
			driver.switchTo().window(tab1);
			Thread.sleep(2000);
			driver.close();
		}
		
	}

}
