// Search results page,Search box query, Sorting filtering and Pagination

package pompackage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import amazonbasepackage.BaseClass;

public class YourOrdersPage extends BaseClass {

	
	@FindBy(css="#nav-link-accountList-nav-line-1")WebElement HelloSignInBtn;
	@FindBy(id="ap_email")WebElement Username;
	@FindBy(id="continue")WebElement ContinueBtn;
	@FindBy(id="ap_password")WebElement Password;
	@FindBy(id="signInSubmit")WebElement SignInBtn;
	
	
	
	//Initiate page elements by creating a constructor
	
		public YourOrdersPage() {
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
	
		// PAGINATION & SORTING
		
		public void Pagination() throws InterruptedException {
			// Search for a product
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cleanse to heal medical medium");
	        driver.findElement(By.xpath("//*[@value='Go']")).click();
	        
	        // Get Search result
	        
	        String text=driver.findElement(By.className("sg-col-inner")).getText().split(" ")[2];
	        System.out.println(text);
	        
	       //Click NEXT PAGE
	        WebElement nextbtn=driver.findElement(By.className("s-pagination-next"));
	        nextbtn.click();
	        Thread.sleep(3000);
	        nextbtn=driver.findElement(By.className("s-pagination-next"));
	        nextbtn.click();
	        Thread.sleep(3000);
	        
	        //Click Previous page
	      WebElement prevbtn=driver.findElement(By.className("s-pagination-previous"));
	      prevbtn.click();
	      Thread.sleep(3000);
	      prevbtn=driver.findElement(By.className("s-pagination-previous"));
	      prevbtn.click();
	      Thread.sleep(3000);
	      
	    
	    
	      //Select or click Sort by
	      WebDriverWait wait= (new WebDriverWait(driver, 10));
	      WebElement element=wait.until(ExpectedConditions . elementToBeClickable (By.className("a-dropdown-prompt")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	      System.out.println("Sort by: SELECTED");
	      Thread.sleep(2000);
	      
	      
	      
	      //Select or click Sort by: Price: Low to High
	      WebDriverWait wait2= (new WebDriverWait(driver, 10));
	      WebElement lowprice=wait2.until(ExpectedConditions . elementToBeClickable (By.id("s-result-sort-select_1")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", lowprice);
	      System.out.println("Sort by: Price: Low to High");
	      Thread.sleep(2000);
	      
	      //Select or click Sort by
	      WebDriverWait wait3= (new WebDriverWait(driver, 10));
	      WebElement element1=wait3.until(ExpectedConditions . elementToBeClickable (By.className("a-dropdown-prompt")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
	      System.out.println("Sort by: SELECTED");
	      Thread.sleep(2000);
	      
	      
	      //Select or click Sort by: Price: High to Low
	      WebDriverWait wait4= (new WebDriverWait(driver, 10));
	      WebElement highprice=wait4.until(ExpectedConditions . elementToBeClickable (By.linkText("Price: High to low")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", highprice);
	      System.out.println("Sort by: Price: High to Low");
	      Thread.sleep(3000);
	      
	      
	      //Select or click Sort by
	      WebDriverWait wait33= (new WebDriverWait(driver, 10));
	      WebElement element11=wait33.until(ExpectedConditions . elementToBeClickable (By.className("a-dropdown-prompt")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element11);
	      System.out.println("Sort by: SELECTED");
	      Thread.sleep(2000);
	      
	      //Select or click Sort by: Ave. Customer Review
	      WebDriverWait wait5= (new WebDriverWait(driver, 10));
	      WebElement review=wait5.until(ExpectedConditions . elementToBeClickable (By.linkText("Avg. customer review")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", review);
	      System.out.println("Sort by: Avg. Customer Review");
	      Thread.sleep(3000);
	      
	      
	      //Select or click Sort by
	      WebDriverWait wait333= (new WebDriverWait(driver, 10));
	      WebElement element111=wait333.until(ExpectedConditions . elementToBeClickable (By.className("a-dropdown-prompt")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element111);
	      System.out.println("Sort by: SELECTED");
	      Thread.sleep(2000);
	      
	      //Select or click Sort by: Newest Arrivals
	      
	      WebDriverWait wait6= (new WebDriverWait(driver, 10));
	      WebElement arrivals=wait6.until(ExpectedConditions . elementToBeClickable (By.linkText("Newest arrivals")));
	      ((JavascriptExecutor)driver).executeScript("arguments[0].click();", arrivals);
	      System.out.println("Sort by: Newest Arrivals");
	      Thread.sleep(3000);
		}
	      

//SEARCH FACILITY
		
		
	public void SearchKeyWord() {
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("ball");
	        driver.findElement(By.xpath("//*[@value='Go']")).click(); 
		
		}
	      
	public void SearchModelNum() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("B0BLVTT53Q");
        driver.findElement(By.xpath("//*[@value='Go']")).click();
	}
	      
	public void SearchBrand() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("VOCOlinc");
        driver.findElement(By.xpath("//*[@value='Go']")).click();
	}
	
	public void SearchInvalidName() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lmap");
        driver.findElement(By.xpath("//*[@value='Go']")).click();
	}
	public void SearchNumofProducts() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("football");
        driver.findElement(By.xpath("//*[@value='Go']")).click();
       
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        //Scroll down till the bottom of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        
        String text=driver.findElement(By.className("sg-col-inner")).getText().split(" ")[3];
        System.out.println("Number of products: "+text);

	}
	 public void AmazonLogo() {
		 driver.findElement(By.id("nav-logo-sprites")).click();
	 }
	
	public void PreviouslySearched() {
		
        driver.findElement(By.id("twotabsearchtextbox")).click();
	}
	
	// SEARCH BY FILTRATION
	
	public void FiltrationBrand() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lamp"); //search "football"
        driver.findElement(By.xpath("//*[@value='Go']")).click();				//Click searchlogo
        driver.findElement(By.id("p_89/Himalayan Glow")).click();							//Click Nike Brand
        System.out.println("Fitration: Brand");
	}
	
	public void FiltrationPrice() throws InterruptedException {
		
        driver.findElement(By.id("p_36/12035763011")).click(); //Click Price Filter
        System.out.println("Fitration: Price");
	}
	
	public void FiltrationReview() throws InterruptedException {
		
        driver.findElement(By.id("p_72/11192170011")).click();					//Click Customer review
        System.out.println("Fitration: Customer review");
        
	}
	
	
		}
		
		


	   