package SeleniumRevised;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Comparetwoimage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/FileUpload.html");

		WebElement web=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/h1"));

		AShot a=new AShot();
		Screenshot sc=	a.takeScreenshot(driver, web);
		BufferedImage i=sc.getImage();
		File f=new File("D:\\Cumcumber\\coding\\Screenshot\\screen1\\c.png");
		ImageIO.write(i,"png",f);

		File f2=new File("D:\\Cumcumber\\coding\\Screenshot\\screen1\\b.png");


		BufferedImage j= ImageIO.read(f2);

		ImageDiffer d=new ImageDiffer();
		ImageDiff  diff=d.makeDiff(j, i);

		if(diff.hasDiff()==true) {
			System.out.println("image are not same");
		}else if (diff.hasDiff()==false){
			System.out.println("image are same");
		}



	}

}
