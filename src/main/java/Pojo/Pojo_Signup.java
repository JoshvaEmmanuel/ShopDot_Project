package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Signup {

	public WebDriver driver;
	public Pojo_Signup(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
@FindBy(xpath = "(//input[@type='text'])[1]")
private WebElement Firstname; 

@FindBy(xpath = "(//input[@type='text'])[2]")
private WebElement Lastname;

@FindBy(xpath = "(//input[@type='text'])[3]")
private WebElement Email;

@FindBy(name = "password")
private WebElement password;

@FindBy(xpath = "//small[contains(text(),'signing')]")
private WebElement checkbox;

@FindBy(xpath = "//button[@type='submit']")
private WebElement signup;

public WebElement getFirstname() {
	return Firstname;
}

public WebElement getLastname() {
	return Lastname;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getPassword() {
	return password;
}

public WebElement getCheckbox() {
	return checkbox;
}

public WebElement getSignup() {
	return signup;
}



}
