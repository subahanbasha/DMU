package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
	
	}

	@FindBy(id="//input[@id='email']")
	private WebElement email;
	
	@FindBy(id="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@id='loginButton']")
	private WebElement loginButton;
	
	public void enterEmailAddress(String emailText) {
		
		email.sendKeys("admin@dmu.com");
		
	}
	
	public void enterPassword(String passwordText) {
		
		password.sendKeys("Stride@1234$");
		
	}
	
	public AccountPage clickOnLoginButton() {
		
		loginButton.click();
		return new AccountPage(driver);
		
	}
}