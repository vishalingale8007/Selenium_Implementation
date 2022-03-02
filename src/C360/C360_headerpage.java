package C360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C360_headerpage 
{
	//locator for header-page
	
	@FindBy(xpath="//span[text()='Resume application ']")
	private WebElement resumeapplication;
	
	
   public C360_headerpage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   
   //user can click on resume application after verification
   
   public void verifylogin()
   {
	   if(resumeapplication.isDisplayed())
	   {
		   resumeapplication.click();
		   System.out.println("login successful");
	   }
	   else
	   {
		   System.out.println("login failed");
	   }
   }


}
