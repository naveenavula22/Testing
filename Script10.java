package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {


	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		String tag = driver.findElement(By.linkText("actiTIME Inc.")).getTagName();
		System.out.println(tag);
		
		if(tag == "a")
		{
			System.out.println("tag is present");
		}
		else
		{
			System.out.println(" not present ");
		}
		
	}

}
