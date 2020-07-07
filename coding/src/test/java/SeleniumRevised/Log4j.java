package SeleniumRevised;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4j {

	
	Logger log=Logger.getLogger(Log4j.class);//class name
	
	
	@Test
	public void method1() throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");
		log.error("thos is a erroe messahe.......................999999999999999999999990000000000000000000000");

		List<WebElement>	alllinks=	driver.findElements(By.tagName("a"));

		int size=alllinks.size();

		for(int i=0;i<size;i++) {

			HttpURLConnection http=(HttpURLConnection)new URL(alllinks.get(i).getAttribute("href")).openConnection();
			http.connect();
			int code=
					http.getResponseCode();
			String message=http.getResponseMessage();

			System.out.println(code+"       "+message);
			System.out.println("................");
		}

	}
	
	@Test
	public void method2() {
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
