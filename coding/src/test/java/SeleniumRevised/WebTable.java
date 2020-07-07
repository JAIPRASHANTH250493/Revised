package SeleniumRevised;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\New\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();


		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();


		WebElement admin=driver.findElement(By.xpath("//div[@id='mainMenu']/ul/li[1]/a"));
		WebElement usermanagement=driver.findElement(By.xpath("//*[@id=\'menu_admin_UserManagement\']"));
		WebElement users=driver.findElement(By.xpath("//*[@id=\'menu_admin_viewSystemUsers\']"));

		Actions action=new Actions(driver);
		action.moveToElement(admin).build().perform();
		action.moveToElement(usermanagement).build().perform();
		action.moveToElement(users).click().build().perform();


		List<WebElement> trtag=	driver.findElements(By.tagName("tr"));
		int size=trtag.size();
		
		System.out.println(size);
		int c=0;
		int total=0;
		for(int i=2;i<=size;i++) {

			WebElement tdtag=driver.findElement(By.xpath("//table//tr["+i+"]//td[5]"));
			String enabled=tdtag.getText();
			System.out.println(enabled);
			c++;
			if(c==7) {
				driver.findElement(By.xpath("//table//tr["+i+"]//td[5]//preceding::td[4]")).click();
			}
			if(enabled.equals("Enabled")) {
				total++;
			}
		}System.out.println(total+"  "+"are enabled");
	}



}






















