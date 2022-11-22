package automation;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vrlbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("source_city")).sendKeys("Bangalore" + Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("destination_city")).sendKeys("HUBBALLI" + Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("TRIPSTARTDATE")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(2000);
		List<WebElement> busnames = driver.findElements(By.xpath("//span[text()='Sleeper Coach(32) ']"));
		Thread.sleep(2000);
		List<WebElement> seats = driver.findElements(By.xpath("//td[text()='		   32  Avaliable	  ']"));
		Thread.sleep(2000);
		int count = seats.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = busnames.get(i).getText();
			String text2 = seats.get(i).getText();
			System.out.println(text+text2);
		}
	}
}