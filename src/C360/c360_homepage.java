package C360;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class c360_homepage
{
WebDriver driver;
	
	@FindBy(xpath="(//div[@class='row g-0']//div[@class='tile tile-active'])[3]")
	private WebElement property;
	
	
	 public c360_homepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver,this);
	 }

	 
	 public void propertytile() throws InterruptedException
	 {
		//  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)  ;

		  Thread.sleep(3000);
		 if(property.isDisplayed())
		 {
			 System.out.println("click on yourgoals tile");
			 
			// property.click();
			 
		 Actions act = new Actions(driver);
			 
          act.moveToElement(property).perform();
            act.click(property).click();
		 }
		 else
		 {
			 System.out.println("yourgoals tile is not working");
		 }
	 }

}
