package SeleniumRevised;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class FileDownload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/pages/download.html");
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]")).click();
		
		File f=new File("C:\\Users\\New\\Downloads");
	File[] file1=	f.listFiles();
	
	for (File file : file1) {
		String filename=file.getName();
		System.out.println(filename);
	}
	}

}
