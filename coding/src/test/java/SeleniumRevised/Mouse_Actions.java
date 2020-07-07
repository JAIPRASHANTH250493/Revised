package SeleniumRevised;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.crypt.dsig.KeyInfoKeySelector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.leafground.com/pages/drag.html");

		WebElement e=driver.findElement(By.xpath("//*[@id='draggable']"));

		Actions ac=new Actions(driver);
		ac.dragAndDropBy(e, 110, 50).build().perform();

		driver.get("http://www.leafground.com/pages/drop.html");

		WebElement drag=driver.findElement(By.id("draggable"));

		WebElement drop=driver.findElement(By.id("droppable"));

		ac.dragAndDrop(drag, drop).build().perform();;


		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> li=driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int size=li.size();
		System.out.println(size);
		ac.clickAndHold(li.get(0));
		ac.clickAndHold(li.get(1));
		ac.clickAndHold(li.get(2));
		ac.clickAndHold(li.get(3));
		ac.clickAndHold(li.get(4));
		ac.build().perform();
		ac.clickAndHold(li.get(5));
	}

}
