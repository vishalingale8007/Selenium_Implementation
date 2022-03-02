package C360;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C360_test 
{ public static void main(String[] args) throws InterruptedException 
	   
	   {
		   System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
	       
		WebDriver	driver = new ChromeDriver();
			
			driver.get("https://qa-c360.afgonline.com.au/Great_Finance/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			String emailid="suryakant.test.october@test.com";
			String	password ="AFGPassword1";
			
			
			
			//constructor for login page
			
			C360_loginpage login = new C360_loginpage(driver);
			
			
			//enter emailID and password to login application
			
			login.enteremail(emailid);
			login.enterpassword(password);
		    login.clickonLogin();
		    
		    
		    //constructor for header-page
		    
		    C360_headerpage headerpage = new C360_headerpage(driver);
		    
		      headerpage.verifylogin();
		      
		      
		      
		      //constructor for home page
		      
		      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		      
		      Thread.sleep(6000);
		      
		  c360_homepage homepage = new c360_homepage(driver);
		  
		     homepage.propertytile();
		    
		
		
	   }
}
