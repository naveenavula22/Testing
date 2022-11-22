package automation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphasort {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Asus/OneDrive/Desktop/hotelmenu.html");
		WebElement alpha = driver.findElement(By.id("MTR"));
		Select s = new Select(alpha);
		List<WebElement> allalpha = s.getOptions();
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<allalpha.size();i++)
		{
			String text = allalpha.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for (String alphaall : al) {
			System.out.println(alphaall);
		}
		driver.close();
		
		
	}

}
