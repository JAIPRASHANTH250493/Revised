package SeleniumRevised;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://mvnrepository.com/artifact/org.sikuli/sikuli-core/1.2.2");
		
	Set<Cookie> co=	driver.manage().getCookies();
	System.out.println(co.size());
	System.out.println(co.isEmpty());
	
	for (Cookie cookie : co) {
		
		System.out.println(cookie.getName()+"  "+cookie.getValue());
		}
	Cookie cok=new Cookie("jai","22333");
	driver.manage().addCookie(cok);
	Set<Cookie> co2=	driver.manage().getCookies();

	System.out.println(co2.size());
	}

}
