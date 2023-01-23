package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasepackage.BaseClass;
import pompackage.LoginPage;
import pompackage.YourPaymentsPage;

public class YourPaymentsTest extends BaseClass{

	LoginPage Log;
	YourPaymentsPage pay;
	
	@BeforeMethod
	public void initsetup() throws Throwable{
		initiation();	
		
		Log = new LoginPage();
		pay=new YourPaymentsPage();
		}		
	
	@Test
	public void YourPayments() throws Throwable   {
		
		Log.clickHelloSignInBtn();
		Log.typeusername(prop.getProperty("username"));
		Log.clickContinuebtn();
		Log.typepasswor(prop.getProperty("password"));
		Log.clickbtn();
		Log.clickHelloSignInBtn();
	
		
		pay.YourPaymentsBtn();
		
		pay.ClickAddPaymentMethod();	
		Thread.sleep(5000);
		pay.ClickAddCard();
		Thread.sleep(5000);
		
	// Rest of the input details like Card number, Card Holder's name, Expiry date,
	//Add a card functionalities will be done manually for security reasons and 
	//automation using Selenium on "Your payments" module is a violation by Amazon.
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
}
