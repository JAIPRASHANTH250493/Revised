package SeleniumRevised;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Sorted_or_not {
	
	@Test
	public void sorted() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		WebElement drop=driver.findElement(By.id("dropdown3"));
		Select sc=new Select(drop);
		ArrayList<String> li=new ArrayList<String>();
	List<WebElement> opt=	sc.getOptions();
		for (WebElement web : opt) {
			li.add(web.getText());
		}
		
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		
	}

}
