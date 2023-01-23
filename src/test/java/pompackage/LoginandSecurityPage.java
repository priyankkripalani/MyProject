package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import amazonbasepackage.BaseClass;

public class LoginandSecurityPage extends BaseClass {

	//Create & store object repository
	
	@FindBy(css="#nav-link-accountList-nav-line-1")WebElement HelloSignInBtn;
	@FindBy(css="input#ap_email")WebElement Username;
	@FindBy(id="continue")WebElement ContinueBtn;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(id="signInSubmit")WebElement SignInBtn;
	
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(2) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement LoginandSecurityBtn;
	@FindBy(css="#auth-cnep-edit-name-button")WebElement ClickEditNameBtn;
	@FindBy(css="#ap_customer_name")WebElement EnterNewName;
	@FindBy(id="cnep_1C_submit_button")WebElement ClickSaveChanges;
	
	
	@FindBy(id="auth-cnep-edit-email-button")WebElement ClickEditEmailBtn;
	@FindBy(css="#cvf-page-content > div > div > div > form > div:nth-child(4) > div > div.a-row.a-grid-vertical-align.a-grid-center > div > input")WebElement EnterNewEmail;
	@FindBy(css="#a-autoid-0 > span > input")WebElement ClickContinueemail;
	
	@FindBy(id="auth-cnep-edit-phone-button")WebElement ClickEditPhonenumberBtn;
	@FindBy(id="ap_phone_number")WebElement EnterNewPhonenumber;
	@FindBy(id="auth-continue")WebElement ClickContinuePN;
	
	
	
	//Initiate page elements by creating a constructor
	
	public LoginandSecurityPage() {
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
	
	public void LoginSecurityBtn() {
		LoginandSecurityBtn.click();
	}
	
	public void ClickEditName() {
		ClickEditNameBtn.click();
	}
	public void ClearOldName() {
		EnterNewName.clear();
		
	}
	public void typeNewName(String newname) {
		EnterNewName.sendKeys(newname);
	}
	public void ClickSaveChanges() {
		ClickSaveChanges.click();
	}
	
	

}
