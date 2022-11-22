package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement btn = driver.findElement(By.xpath("//button[text()='New Window']"));
		Thread.sleep(2000);
		btn.click();
		btn.click();
		btn.click();
		Thread.sleep(2000);
		String pwindow = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> allchild = driver.getWindowHandles();
		for (String child : allchild) {
			driver.switchTo().window(child);
			if(child.equals(pwindow)) {
				
			}
			else
			{
				driver.close();

			}
		}



	}

}
