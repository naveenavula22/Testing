package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Insurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		Thread.sleep(2000);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.className("ui-datepicker-month"));
		Thread.sleep(2000);
		Select s = new Select(month);
		Thread.sleep(2000);
		s.selectByIndex(05);
		WebElement year = driver.findElement(By.className("ui-datepicker-year"));
		Select s1 = new Select(year);
		Thread.sleep(2000);
		s1.selectByVisibleText("1995");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='22']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("9880422485");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		boolean text = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(text==false)
		{
			System.out.println("error message is dispalyed");
		}
		else
		{
			System.out.println("error message is not dispalyed");
		}
		driver.close();
		

	}

}
