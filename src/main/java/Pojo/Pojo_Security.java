package Pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Security {

	public WebDriver driver;
	public Pojo_Security (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath = "(//input[@type='password'])[1]")
	private WebElement OldPassword;
	
	@FindBy (xpath = "(//input[@type='password'])[2]")
	private WebElement NewPassword;
	
	@FindBy (xpath = "(//input[@type='password'])[3]")
	private WebElement ConfirmPassword;
	
	public WebElement getOldPassword() {
		return OldPassword;
	}

	public void setOldPassword(WebElement oldPassword) {
		OldPassword = oldPassword;
	}

	public WebElement getNewPassword() {
		return NewPassword;
	}

	public void setNewPassword(WebElement newPassword) {
		NewPassword = newPassword;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		ConfirmPassword = confirmPassword;
	}

	public WebDriver getSave() {
		return Save;
	}

	public void setSave(WebDriver save) {
		Save = save;
	}
	@FindBy (xpath = "(//button[@type='submit'])[2]")
	private WebDriver Save;
}
	

