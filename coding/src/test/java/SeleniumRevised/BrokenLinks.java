package SeleniumRevised;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/");

		List<WebElement>	alllinks=	driver.findElements(By.tagName("a"));

		int size=alllinks.size();

		for(int i=0;i<=size;i++) {

			HttpURLConnection http=(HttpURLConnection)new URL(alllinks.get(i).getAttribute("href")).openConnection();
			http.connect();
			int code=http.getResponseCode();
			String message=http.getResponseMessage();

			System.out.println(code+"       "+message);
			System.out.println("................");
		}


	}

}
