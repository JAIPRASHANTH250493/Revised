package SeleniumRevised;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascriptmethods {

	@Test
	public void flashing() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/pages/Button.html");

		WebElement web=	driver.findElement(By.xpath("//*[@id=\"color\"]"));
		String colour=web.getCssValue("background-color");
		String colour2="#000000";

		for(int i=0;i<20;i++) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].style.backgroundColor= '"+colour+"'",web );
			Thread.sleep(100);

			js.executeScript("arguments[0].style.backgroundColor= '"+colour2+"'",web );
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].style.border= '4px solid black'",web );
		
	String m1=	js.executeScript("return document.title;").toString();
		System.out.println(m1);
		String m="jai";
		
		js.executeScript("alert('"+m+"')");
	}
}