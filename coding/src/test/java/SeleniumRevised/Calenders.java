package SeleniumRevised;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calenders {

	@Test
	public static void calender() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://ui.freecrm.com/");

		driver.findElement(By.name("email")).sendKeys("jaiprashanth2504@gmail.com");
		driver.findElement(By.name("password")).sendKeys("J@i250493");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

		driver.findElement(By.xpath("//div[@id='main-nav']/a[2]")).click();

		WebElement calnederbutto=driver.findElement(By.xpath("//div[@class='rbc-calendar']/div[1]/span[1]/button[3]"));


		for(int i=0;i<12;i++) {

			calnederbutto.click();
			String m=driver.findElement(By.xpath("//div[@class='rbc-calendar']/div/span[2]")).getText();
			if(m.equals("October 2020")) {
				driver.findElement(By.linkText("04")).click();
				break;
			}
		}
		System.out.println("selected");
	}

}
