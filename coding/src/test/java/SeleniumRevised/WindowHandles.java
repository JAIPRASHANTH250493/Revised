package SeleniumRevised;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	@Test
	public void window() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/pages/Window.html");
		String parent=driver.getWindowHandle();
		int a=0;
		System.out.println(parent);
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
		Set<String> allwindows=	driver.getWindowHandles();

		Iterator<String> it=allwindows.iterator();

		while(it.hasNext()) {
			if(!it.next().equals(parent)) {
				System.out.println("this is a chlid");
			}
		}

		for (String string : allwindows) {
			System.out.println(string);

			a++;
			if(a>=2) {
				driver.switchTo().window(string);
				System.out.println(driver.getTitle());
				driver.manage().window().maximize();

			}
		}
		System.out.println("total windows"+" "+a);
		driver.quit();
	}

}
