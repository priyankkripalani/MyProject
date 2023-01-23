package pompackage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import amazonbasepackage.BaseClass;

public class YourAddressesPage extends BaseClass {
	
	//Create & store object repository
	
	@FindBy(id="#nav-link-accountList-nav-line-1")WebElement HelloSignInBtn;
	@FindBy(css="input#ap_email")WebElement Username;
	@FindBy(id="continue")WebElement ContinueBtn;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(id="signInSubmit")WebElement SignInBtn;
	
	@FindBy(css="#a-page > div.a-container > div > div:nth-child(3) > div:nth-child(1) > a > div > div > div > div.a-column.a-span9.a-span-last > h2")WebElement YourAddressBtn;
	@FindBy(id="ya-myab-plus-address-icon")WebElement AddAdressplus;

	@FindBy(id="address-ui-widgets-enterAddressFullName")WebElement FullName;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")WebElement PhoneNumber;
	@FindBy(id="address-ui-widgets-enterAddressLine1")WebElement Address;
	@FindBy(id="address-ui-widgets-enterAddressCity")WebElement City;
	
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion > span > span")WebElement ClickProvince;
	@FindBy(css="#address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_8")WebElement SelectProvince;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")WebElement PostalCode;
	@FindBy(id="address-ui-widgets-use-as-my-default")WebElement DefaultAddressCheckMark;
	@FindBy(css="#address-ui-widgets-form-submit-button > span > input")WebElement AddAddressBtn;
	
	//Initiate page elements by creating a constructor
	
	public YourAddressesPage() {
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
	
	public void YourAddressBtn() {
		YourAddressBtn.click();
	}
	
	public void AddAddressplus() {
		AddAdressplus.click();
	}
	
	public void typeFullName(String name) {
		FullName.sendKeys(name);
	}
	
	public void TypePhoneNumber(String name) {
		PhoneNumber.sendKeys(name);
	}
	public void TypeAddress(String name) {
		Address.sendKeys(name);	
	}
	public void TypeCity(String name) {
		City.sendKeys(name);	
	}
	public void TypePostalCode(String name) {
		PostalCode.sendKeys(name);	
	}
	public void ClickDefaultAddress() {
		DefaultAddressCheckMark.click();	
	}
	
	public void ClickProvince() {
		ClickProvince.click();
	}
	
	public void SelectProvince() {
		SelectProvince.click();
	}
	/*public void SelectProvince() {
		Select dropdown=new Select(ClickProvince);
		dropdown.selectByValue("Ontario");
	}
	*/
	public void AddAddressclickbtn() {
		AddAddressBtn.click();
	}
	
	
	
}
