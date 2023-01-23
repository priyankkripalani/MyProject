package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbasepackage.BaseClass;

public class LoginPage extends BaseClass {

	//Create & store object repository
	
	@FindBy(id="nav-link-accountList-nav-line-1")WebElement HelloSignInBtn;
	@FindBy(css="input#ap_email")WebElement Username;
	@FindBy(id="continue")WebElement ContinueBtn;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(id="signInSubmit")WebElement SignInBtn;
	
	//initiate page elements by creating a constructor
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHelloSignInBtn() {
		HelloSignInBtn.click();
	}
	public void typeusername(String name) {
		Username.sendKeys(name);
	}
	public void clickContinuebtn() {
		ContinueBtn.click();
	}
	public void typepasswor(String pass) {
		Password.sendKeys(pass);
	}
	public void clickbtn() {
		SignInBtn.click();
	}
	public String verify() {
		return driver.getTitle();
	}
	
	
}
