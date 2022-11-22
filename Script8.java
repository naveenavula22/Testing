package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement height = driver.findElement(By.id("email"));
		int h1 = height.getSize().getHeight();
		WebElement width = driver.findElement(By.id("email"));
		int w1 = width.getSize().getWidth();
		System.out.println(h1);
		System.out.println(w1);
		driver.close();
	}

}
