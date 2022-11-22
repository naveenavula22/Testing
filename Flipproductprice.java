package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipproductprice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max" + Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		Thread.sleep(2000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		int count = products.size();
		for(int i=0;i<count;i++) {
			String text = products.get(i).getText();
			String text1 = price.get(i).getText();
			System.out.println(text + text1);
		}
		

	}

}
