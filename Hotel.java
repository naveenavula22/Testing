package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Asus/OneDrive/Desktop/hotelmenu.html");
		WebElement SLVHOTEL = driver.findElement(By.id("SLV"));
		Select s = new Select(SLVHOTEL);
		List<WebElement> alloptions = s.getAllSelectedOptions();
		int count = alloptions.size();
		System.out.println(count);
		for (WebElement option : alloptions) {
			String text = option.getText();
			System.out.println(text);
		}
		Thread.sleep(2000);
		WebElement firstoption = s.getFirstSelectedOption();
		Thread.sleep(2000);
		String text = firstoption.getText();
		System.out.println(text);
		
		alloptions = s.getOptions();
		count = alloptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			text = alloptions.get(i).getText();
			System.out.println(text);
			Thread.sleep(2000);
			s.selectByIndex(i);
			
		}
		driver.close();
	}

}
