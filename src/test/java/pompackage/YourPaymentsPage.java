package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazonbasepackage.BaseClass;

public class YourPaymentsPage extends BaseClass {

	
	//Create & store object repository
	
		@FindBy(css="#nav-link-accountList-nav-line-1")WebElement HelloSignInBtn;
		@FindBy(css="input#ap_email")WebElement Username;
		@FindBy(id="continue")WebElement ContinueBtn;
		@FindBy(id="ap_password")WebElement Password;
		@FindBy(id="signInSubmit")WebElement SignInBtn;
		
		@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(2) > a > div > div > div > div.a-column.a-span9.a-span-last > div > span")WebElement YourPaymentBtn;
		@FindBy(className="apx-wallet-add-link")WebElement AddPaymentMethod;
		@FindBy(xpath="//input[@class='a-button-input' and @type='submit']")WebElement ClickAddCard;				
		
		
		//Initiate page elements by creating a constructor
		
		public YourPaymentsPage() {
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
		public void YourPaymentsBtn() {
			YourPaymentBtn.click();
		}
		public void ClickAddPaymentMethod()  {
			AddPaymentMethod.click();
			System.out.println("Click Payment Method passed");
			
		}
		public void ClickAddCard() throws Throwable {
			
			ClickAddCard.click();
			System.out.println("Add debit or credit card passed");
			Thread.sleep(60000);
		}		
	
}
