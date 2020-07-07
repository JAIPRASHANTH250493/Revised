package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Parent_class;

public class Login_page extends Parent_class {

	public Login_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login:usernameDecorate:username")
	public WebElement username;
	
	@FindBy(id = "login:passwordDecorate:password")
	public WebElement password;
	
	@FindBy(id="login:login")
	public WebElement signin;
	
	
	
	public void usernameMehtod(String uname) {
		username.sendKeys(uname);
	//driver.findElement(By.id("login:usernameDecorate:username")).sendKeys(uname);
	}
	public void passwordMethods(String pass) {
		//password.sendKeys(pass);
		//driver.findElement(By.id("login:passwordDecorate:password")).sendKeys(pass);
	}
	
	public void Signin() {
		//password.sendKeys(pass);
	WebElement signin=driver.findElement(By.id("login:login"));
	signin.click();
	}
	
	
	
	
}
