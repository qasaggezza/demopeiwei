package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

//import peiweipack.WebElement;
import utils.Reporter;
import wrappers.PeiweiWrappers;
public class Inbox extends PeiweiWrappers{

	public Inbox() {
		if(!verifyTitle("Inbox - sudharsan.kg@saggezza.com - Saggezza, Inc. Mail")) ;
			//Reporter.reportStep("This is not the Inbox Page", "FAIL");
	}
	
	public Mail clickUnreadMail() throws InterruptedException 
	  {
		
		 java.util.List<WebElement> unreademail = driver.findElements(By.xpath("//span[@class='zF']"));
		
		 
		for(int i=0;i<unreademail.size();i++)
		{
		    if(unreademail.get(i).isDisplayed()==true)
		    {
		    	unreademail.get(i).click();	 
		    	Reporter.reportStep("The Unread Mail is clicked.", "PASS");
		    	
		    	break;
		    	//Thread.sleep(5000);
		    }
		    else
		    {
		    	Reporter.reportStep("Unread Mail not found", "FAIL");
		    	
		    	break;
		    }
		
		
		 }
		  return new Mail();
		   
	  }
	
	public Mail clickUnreadMail1() throws InterruptedException 
	  {
		
		 java.util.List<WebElement> unreademail = driver.findElements(By.xpath("//span[@class='zF']"));
		
		 
		for(int i=0;i<unreademail.size();i++)
		{
		    if(unreademail.get(i).isDisplayed()==true)
		    {
		    	unreademail.get(i).click();	 
		    	Reporter.reportStep("The Unread Mail is clicked.", "PASS");
		    	
		    }
		
		
		 }
		  return new Mail();
		   
	  }
	
	
	
	public Inbox clickRefresh() {
		clickByXpath(prop.getProperty("Gmail.Refresh.Xpath"));
		return this;
	}
	
	
	public Inbox clickInbox() throws InterruptedException{
		clickByXpath(prop.getProperty("Gmail.Inbox.Xpath"));
		//Thread.sleep(4000);
		return this;
	}
}
