package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			 driver.get("https://demo.automationtesting.in/Windows.html");
			 driver.findElement(By.linkText("Open New Seperate Windows")).click();
			 driver.findElement(By.xpath("//button[text()='click']")).click();
			 Set<String> window = driver.getWindowHandles();
			 for (String wh:window) {
				driver.switchTo().window(wh);
				String title = driver.getTitle();
				System.out.println(title);
			}
			 driver.quit();

	}

}
