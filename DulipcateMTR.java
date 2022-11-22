package automation;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DulipcateMTR {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Asus/OneDrive/Desktop/hotelmenu.html");
		WebElement dumb = driver.findElement(By.id("MTR"));
		Select s = new Select(dumb);
		Thread.sleep(2000);
		List<WebElement> alloptions = s.getOptions();
		Thread.sleep(2000);
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<alloptions.size();i++)
		{
			String text = alloptions.get(i).getText();
			hs.add(text);
			Thread.sleep(2000);
			for (String all : hs) {
				System.out.println(all);
			}
			driver.close();
		}
	}
}

