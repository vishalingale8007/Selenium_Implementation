package C360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C360_loginpage
{
	// locators for  login page 
	
	@FindBy(xpath="//input[@id='emailAddress']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@id='password']")
	private  WebElement Password;
	
	@FindBy(xpath="//button[@id='loginButton']")
	private  WebElement LogIN;
	
	
	
	 public C360_loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	//user can enter username 
	
	public void enteremail(String emailid)
	{
		 Email.sendKeys(emailid);
	}
	
	
	
	//user can enter password
	
    public void enterpassword(String password)
    {
    	Password.sendKeys(password);
    }
    
    
    //user can click on login button
    
    public void clickonLogin()
    {
        LogIN.click();
    }


}
