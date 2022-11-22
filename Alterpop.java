package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterpop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(1000);
		a.accept();
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']"));

		if(text==text) {
			System.out.println("you pressed cancel and testcase pass");
		}
		else {
			System.out.println("you pressed cancel and testcase fail");
		}
		driver.close();
	}
}
