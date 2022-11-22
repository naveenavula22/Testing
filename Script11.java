package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script11 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		int countsize = alltags.size();
		System.out.println(countsize);

		for(int i=0;i<countsize;i++)
		{
			String text = alltags.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
