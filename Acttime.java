package automation;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acttime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Read Service Agreement']")).click();
		Thread.sleep(2000);
		Set<String> alltabs = driver.getWindowHandles();
		for (String tab : alltabs) {
			driver.switchTo().window(tab);
			String title = driver.getTitle();
			System.out.println(title);
		}

	}
}

