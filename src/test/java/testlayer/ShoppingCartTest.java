package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import amazonbasepackage.BaseClass;
import pompackage.LoginPage;
import pompackage.ShoppingCartPage;


public class ShoppingCartTest extends BaseClass {
	
	LoginPage Log;
	ShoppingCartPage cart;
	
	public ShoppingCartTest() {
		super();
		System.out.println("null");
		System.out.println("add user v2");
	}
	
	
	@BeforeMethod
	public void initsetup() {
		initiation();	
		
		Log=new LoginPage();
		cart=new ShoppingCartPage();
		
	}
	
	@Test
	public void ShoppingCart() throws InterruptedException   {
		
		Log.clickHelloSignInBtn();
		Log.typeusername(prop.getProperty("username"));
		Log.clickContinuebtn();
		Log.typepasswor(prop.getProperty("password"));
		Log.clickbtn();
		
		
		cart.EnterKeyword("iphone case");
		cart.ClickSearchBtn();	
		cart.ClickProduct();			
		cart.ClickAddtoCart();		
		cart.ClickGotoCart();		
		cart.ClickProceedCheckout();		
		cart.UsePaymentMethod();
		Thread.sleep(10000);
}

	@AfterMethod
	public void close() {
		driver.close();
		driver=null;
	}
	
	
	
	
}
