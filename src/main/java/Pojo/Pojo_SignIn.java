package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_SignIn {

	public WebDriver driver;
	public Pojo_SignIn(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

     }
	
	@FindBy(name = "email")
	private WebElement Email;
	
	@FindBy(name = "password")
	private WebElement password;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement signup;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getSignup() {
		return signup;
	}
}

