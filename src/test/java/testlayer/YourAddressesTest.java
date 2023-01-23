package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasepackage.BaseClass;
import pompackage.LoginPage;
import pompackage.YourAddressesPage;

public class YourAddressesTest extends BaseClass{
	
LoginPage Log;

YourAddressesPage addrs;

	public YourAddressesTest() {
		super();
}
	@BeforeMethod
	public void initsetup() throws Throwable{
		initiation();	
		
		Log=new LoginPage();
		addrs=new YourAddressesPage();
		
	}
	
	@Test
	public void AddAddress() throws Throwable  {
		
		Log.clickHelloSignInBtn();
		Log.typeusername(prop.getProperty("username"));
		Log.clickContinuebtn();
		Log.typepasswor(prop.getProperty("password"));
		Log.clickbtn();
		Log.clickHelloSignInBtn();
		
		addrs.YourAddressBtn();
		addrs.AddAddressplus();
		addrs.typeFullName(prop.getProperty("FullName"));
		addrs.TypePhoneNumber(prop.getProperty("PhoneNumber"));
		addrs.TypeAddress(prop.getProperty("Address"));
		addrs.TypeCity(prop.getProperty("City"));
		
		addrs.ClickProvince();
		addrs.SelectProvince();
		addrs.TypePostalCode(prop.getProperty("PostalCode"));
		addrs.ClickDefaultAddress();
		addrs.AddAddressclickbtn(); 
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
}