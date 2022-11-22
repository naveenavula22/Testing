package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement resourcetab = driver.findElement(By.xpath("(//a[@id='navbarPages'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(resourcetab).perform();
		driver.findElement(By.partialLinkText("Contact Us")).click();
		Thread.sleep(2000);
		List<WebElement> phno = driver.findElements(By.xpath("(//div[@class='row'])[5]"));
		int count = phno.size();
		for(int i=0;i<count;i++)
		{
			String text = phno.get(i).getText();
			System.out.println(text);
		}
			driver.close();
	}

}
