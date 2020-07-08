package SeleniumRevised;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {

	/*
	 * @Test public static void atestleaf() { // TODO Auto-generated method stub
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\New\\Desktop\\chromedriver.exe"); WebDriver driver=new
	 * ChromeDriver(); driver.manage().timeouts().implicitlyWait(30,
	 * TimeUnit.SECONDS); driver.manage().timeouts().pageLoadTimeout(30,
	 * TimeUnit.SECONDS); driver.manage().window().maximize();
	 * driver.manage().deleteAllCookies();
	 * driver.get("http://www.leafground.com/pages/upload.html");
	 * 
	 * File f=new File("C:\\Users\\New\\Desktop\\MANUAL TESTING\\my test.xlsx");
	 * 
	 * 
	 * driver.findElement(By.xpath("//input")).
	 * sendKeys("C:\\Users\\New\\Desktop\\MANUAL TESTING\\my test.xlsx");
	 * System.out.println("doneeeeee.................."); driver.close(); }
	 */

	@Test
	public static void btestleaf2() throws AWTException {

		
		String f="C:\\Users\\New\\Desktop\\MANUAL TESTING\\my test.xlsx";

		StringSelection st=new StringSelection(f);

		driver.findElement(By.xpath("//input")).click();
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(st, null);

		Robot rob=new Robot();

		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);

		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);

		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}}
