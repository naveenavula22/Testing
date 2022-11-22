package GenericLib;

import java.io.IOException;

import org.apache.batik.apps.rasterizer.Main;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Genericacttime {
	/**
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */

	public void loginacttime() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Genericacttime g = new Genericacttime();
		g.loginacttime();
	}
}



