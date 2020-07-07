package SeleniumRevised;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavscriptScroling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/artifact/org.sikuli/sikuli-core/1.2.2");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		
	WebElement web=	driver.findElement(By.xpath("//*[@id=\"left\"]/div[2]/ul/li[31]/a"));
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].scrollIntoView(true);",web );
	
	
	driver.get("http://demo.automationtesting.in/FileUpload.html");

	JavascriptExecutor js2=(JavascriptExecutor)driver;
	js2.executeScript("window.scrollBy(document.body.scroll.height)");
	}

}
