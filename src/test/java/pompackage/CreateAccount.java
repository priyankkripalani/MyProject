package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbasepackage.BaseClass;

public class CreateAccount extends BaseClass{

	@FindBy(className="nav-line-1-container")WebElement HelloSignInBtn;
	@FindBy(id="createAccountSubmit")WebElement ClickCreateAccnt;
	@FindBy(id="ap_customer_name")WebElement EnterYourName;
	@FindBy(id="ap_email")WebElement EnterEmail;
	@FindBy(id="ap_password")WebElement EnterPwd;
	@FindBy(id="ap_password_check")WebElement EnterPwdAgain;
	@FindBy(id="continue")WebElement Verify;
	
	//continue CNTBTN
	
	//initiate page elements by creating a constructor
	
		public CreateAccount() {
			PageFactory.initElements(driver, this);
		}
	
	public void ClickHelloSignIn() {
		HelloSignInBtn.click();
	}
		
		public void ClickCreateAccnt() {
			ClickCreateAccnt.click();
		}
		
		public void EnterName(String name) {
			EnterYourName.sendKeys(name);
		}
		
		public void EnterEmail(String name) {
			EnterEmail.sendKeys(name);
		}
		public void EnterPwd(String name) {
			EnterPwd.sendKeys(name);
		}
		public void EnterPwdAgain(String name) {
			EnterPwdAgain.sendKeys(name);
		}
		public void Verify() {
			Verify.click();
		}
		
		
}
