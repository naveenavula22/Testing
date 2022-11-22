package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone13pro {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone13 pro max");
		Thread.sleep(2000);
		 List<WebElement> allfileds = driver.findElements(By.xpath("(//div[@class='lrtEPN _17d0yO'])"));
		Thread.sleep(2000);
		int count = allfileds.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = allfileds.get(i).getText();
			System.out.println(text);
			driver.close();
		}
	}

}
