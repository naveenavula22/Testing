package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		WebElement selectday = driver.findElement(By.id("day"));
		Select s = new Select(selectday);
		s.selectByValue("20");
		Thread.sleep(2000);
		WebElement selectmonth = driver.findElement(By.id("month"));
		Select s1 = new Select(selectmonth);
		s1.selectByIndex(11);
		Thread.sleep(2000);
		WebElement selectyear = driver.findElement(By.id("year"));
		Select s2 = new Select(selectyear);
		s2.selectByVisibleText("1995");
		driver.close();
	}
}
		
		