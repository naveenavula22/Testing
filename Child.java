package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/browser-windows");
		 driver.findElement(By.xpath("//button[text()='New Window']")).click();
		 driver.findElement(By.xpath("//button[text()='New Window']")).click();
		 driver.findElement(By.xpath("//button[text()='New Window']")).click();
		 driver.findElement(By.xpath("//button[text()='New Window']")).click();
		 Set<String> windows = driver.getWindowHandles();
		 int count = windows.size();
			 System.out.println(count);
		 driver.quit();
		 
		 
	}

}
