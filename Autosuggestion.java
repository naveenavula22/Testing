package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		Thread.sleep(2000);
		int count = autosugg.size();
		Thread.sleep(2000);
		System.out.println(count);
		Thread.sleep(2000);
		for(int i=0;i<count;i++)
		{
			String text = autosugg.get(i).getText(); 
			System.out.println(text);
		}
		autosugg.get(5).click();
		driver.close();
		
	}

}
