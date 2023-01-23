// Shopping cart page and product page


package pompackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazonbasepackage.BaseClass;

public class ShoppingCartPage  extends BaseClass{

	//Create & store object repository
	
		@FindBy(css="#nav-link-accountList-nav-line-1")WebElement HelloSignInBtn;
		@FindBy(id="ap_email")WebElement Username;
		@FindBy(id="continue")WebElement ContinueBtn;
		@FindBy(id="ap_password")WebElement Password;
		@FindBy(id="signInSubmit")WebElement SignInBtn;
	
	
	@FindBy(css="input#twotabsearchtextbox")WebElement EnterKeyword;
	@FindBy(id="nav-search-submit-button")WebElement ClickSearchBtn;
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")WebElement ClickAddtoCart;
	@FindBy(css="span#sw-gtc a")WebElement ClickGotoCart;		
	@FindBy(css="input[name=\"proceedToRetailCheckout\"]")WebElement ClickProceedCheckout;
	@FindBy(css="input[name=\"ppw-widgetEvent\\3a AddCreditCardEvent\"]")WebElement ClickAddonCard;
	@FindBy(xpath="//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")WebElement ClickUseThisPaymentMethod;
	@FindBy(css="#shipToThisAddressButton > span > input")WebElement ClickAddr;
	
	
	
		
		
//Initiate page elements by creating a constructor
		
	public ShoppingCartPage() {
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
	
	
	public void EnterKeyword(String name) {
		EnterKeyword.sendKeys(name);
		System.out.println("Keyword PASSED");
	}
	public void ClickSearchBtn() {
		ClickSearchBtn.click();
		System.out.println("SearchBtn PASSED");
	}
	
	public void ClickProduct() {
		WebDriverWait wait= (new WebDriverWait(driver, 10));
		wait.until(ExpectedConditions . elementToBeClickable (By.linkText("Spigen Ultra Hybrid [Anti-Yellowing Technology] Designed for iPhone 13 Case (2021) - Crystal Clear"))).click();
	
		System.out.println("ClickProduct PASSED");
	}
	
	public void ClickAddtoCart() {		
		ClickAddtoCart.click();
		System.out.println("ClickAddToCart PASSED");
	}
	
	public void ClickGotoCart() {
		ClickGotoCart.click();
		System.out.println("ClickGotoCart PASSED");
	}
	
	public void ClickProceedCheckout() {
		ClickProceedCheckout.click();
		System.out.println("Proceed Checkout PASSED");
	}
	
	public void UsePaymentMethod() {
		ClickUseThisPaymentMethod.click();
		System.out.println("UsePaymentMethod PASSED");
	}
	public void ClickAddr() {
		ClickAddr.click();
		System.out.println("ClickADDr PASSED");
	}
	
	
	
}