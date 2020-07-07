package SeleniumRevised;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	
	@Test
	public void frames() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		WebElement web=driver.findElement(By.xpath("//div[@id='contentblock']//div[2]/iframe"));
		driver.switchTo().frame(web);
		WebElement f2=driver.findElement(By.id("frame2"));
		driver.switchTo().frame(f2);
		
		WebElement click=driver.findElement(By.id("Click1"));
		click.click();
		System.out.println(click.getText());

		
	}
	

}
