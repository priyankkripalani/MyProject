package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import amazonbasepackage.BaseClass;
import pompackage.LoginPage;
import pompackage.LoginandSecurityPage;

public class LoginandSecurityTest extends BaseClass {

	LoginPage Log;
	LoginandSecurityPage login;
	
	

	public LoginandSecurityTest() {
		super();
}
	@BeforeMethod
	public void initsetup() throws Throwable{
		initiation();	
		
		Log=new LoginPage();
		login=new LoginandSecurityPage();
		
	}		
	
	@Test
	public void LoginSecurity() throws Throwable {
		
		Log.clickHelloSignInBtn();
		Log.typeusername(prop.getProperty("username"));
		Log.clickContinuebtn();
		Log.typepasswor(prop.getProperty("password"));
		Log.clickbtn();
		Log.clickHelloSignInBtn();
		
		
		login.LoginSecurityBtn();
		Thread.sleep(15000); //For manual Authorization via text or app notification
		login.ClickEditName();
		login.ClearOldName();
		login.typeNewName("Priyank");
		login.ClickSaveChanges();
		
		
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
}