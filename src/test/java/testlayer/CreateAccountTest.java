package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasepackage.BaseClass;
import pompackage.CreateAccount;


public class CreateAccountTest extends BaseClass {

	CreateAccount create;
	

	public CreateAccountTest() {
		super();
	}

	
	@BeforeMethod
	public void initsetup() throws Throwable{
		initiation();	
		
		create=new CreateAccount();
	}
	
	@Test
	public void CreateAccount() throws InterruptedException {
		
	create.ClickHelloSignIn();
	create.ClickCreateAccnt();
	create.EnterName("Boltzmann");
	create.EnterEmail("jasbkjaslbjlasbcl@gmail.com");
	create.EnterPwd("Hello123");
	create.EnterPwdAgain("Hello123");
	Thread.sleep(3000);
	create.Verify();
	Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
}
