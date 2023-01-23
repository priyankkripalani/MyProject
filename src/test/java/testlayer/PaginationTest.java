package testlayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import amazonbasepackage.BaseClass;
import pompackage.LoginPage;
import pompackage.YourOrdersPage;

public class PaginationTest extends BaseClass {


	LoginPage Log;
	YourOrdersPage page;
	YourOrdersPage search;
	
	public PaginationTest() {
		super();

	}
	
	
	@BeforeMethod
	public void initsetup() {
		initiation();	
		
		Log=new LoginPage();
		page=new YourOrdersPage();
		search=new YourOrdersPage();
	}
	
	@Test(priority=1)
	public void Pagination() throws InterruptedException   {
		
		//Signing IN
		
		Log.clickHelloSignInBtn();
		Log.typeusername(prop.getProperty("username"));
		Log.clickContinuebtn();
		Log.typepasswor(prop.getProperty("password"));
		Log.clickbtn();
		
		//Pagination and Sorting
		
		page.Pagination(); 					
		Thread.sleep(10000);
	}
		//SEARCH FACILITY
	
	@Test(priority=2)
	public void SearchKeyWord() throws InterruptedException {
		search.SearchKeyWord(); 			//By keyword
		search.AmazonLogo();				//Page Refresh
		search.SearchBrand();				//By Brand
		search.AmazonLogo();
		search.SearchInvalidName();			//By invalid name
		search.AmazonLogo();
		search.SearchModelNum();			//By Model Number
		search.AmazonLogo();
		search.SearchNumofProducts();		//Total number of products
		Thread.sleep(5000);
		search.AmazonLogo();
		search.PreviouslySearched(); 		//Previously searched products on searchbox
		
	
	}
		
	//FILTRATION
	
	@Test(priority=3)
		public void Filtration() throws InterruptedException {
		search.FiltrationBrand();
		Thread.sleep(5000);
		search.FiltrationPrice();
		Thread.sleep(5000);
		search.FiltrationReview();
		Thread.sleep(5000);
	}
	

	@AfterMethod
	public void close() {
		driver.close();
	}
	
}