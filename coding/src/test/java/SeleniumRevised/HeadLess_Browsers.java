package SeleniumRevised;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLess_Browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.softwaretestingo.com/bigbasket-automation-interview-questions/");

		String title=driver.getTitle();
		System.out.println(title);


		//sameforfirefox

		//firefoxoptions opt=new firefoxoptions();
		//opt.addarguemnt("--headless");
		
	}

}
