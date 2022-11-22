package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement resourcetab = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(resourcetab).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//a[text()='READ FULL STORY']"));
		driver.findElement(By.xpath("//a[text()='Agree']")).click();
		Actions a1 = new Actions(driver);
		Thread.sleep(2000);
		a1.doubleClick(button).perform();
		boolean text = driver.findElement(By.xpath("//h1[text()='HackerEarth + Vtiger CRM']")).isDisplayed();
		if(text==true) {
			System.out.println("page is displayed");
		}
		else
		{
			
		}
			driver.close();
		}

}
