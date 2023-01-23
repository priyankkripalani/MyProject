package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasepackage.BaseClass;
import pompackage.LoginPage;

public class LoginPageTest extends BaseClass {
	
	LoginPage Log;
	
	public LoginPageTest() {
		super();
	}
	
	
	
	
	@BeforeMethod
	public void initsetup() throws Throwable{
		initiation();	
		
		Log = new LoginPage();
	}
	
	@Test(priority=1)
	public void Title() {
		String actual=Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon.ca: Low Prices – Fast Shipping – Millions of Items");
	}
	@Test(priority=2)
	public void Login() {
		
		Log.clickHelloSignInBtn();
		Log.typeusername(prop.getProperty("username"));
		Log.clickContinuebtn();
		Log.typepasswor(prop.getProperty("password"));
		Log.clickbtn();
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
}
