package wdCustCmds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import config.StartBrowser;
import or.HomePage;

public class ActionDriver extends StartBrowser{
	
	/**
	 * This is to navigate to a specific URL
	 * @param url  ---Application URl
	 */
	public static void launchApplication(String url)
	{
		try {
			driver.get(url);
			boolean blnLogo = driver.findElement(HomePage.imgRightStartLogo).isDisplayed();
			if (blnLogo) 
			{
				logger.log(LogStatus.PASS, "Right Start logo is displayed");
			}
			logger.log(LogStatus.PASS, "Successfully Launched URL : "+url);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "Right Start logo is not displayed");
			logger.log(LogStatus.FAIL, "Unable to  Launch URL : "+url);
		}
		
	}
	/**
	 * Used to perform click operation on links,rb,checkbox and buttons
	 * @param locator  --Get it from OR
	 */
	
	public static void click(By locator, String elementName)
	{
		try {
			driver.findElement(locator).click();
			logger.log(LogStatus.PASS, "Clicked on  : "+elementName);
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "Unable to Click on  : "+elementName);
		}
		
	}
	/**
	 * Used to perform type in textboxes
	 * @param locator ---get it from OR
	 * @param text ---your test data
	 */
	public static void type(By locator, String text, String elementName)
	{
		try {
			driver.findElement(locator).sendKeys(text);
			logger.log(LogStatus.PASS, "Type action performed on   : "+elementName);
		} catch (Exception e) {
			// TODO: handle exception
			logger.log(LogStatus.FAIL, "Unable to perform Type action  on   : "+elementName);
		}
		
	}
	
	public static void selectVisibleText(By locator, String visibleText, String elementName)
	{
		try {
			WebElement dd=driver.findElement(locator);
			Select s = new Select(dd);
			s.selectByVisibleText(visibleText);
			logger.log(LogStatus.PASS, "Able to Select    : "+visibleText +"From DD : "+elementName);
		} catch (Exception e) {
			// TODO: handle exception
			logger.log(LogStatus.PASS, "Unable to Select    : "+visibleText +"From DD : "+elementName);
		}
	}
	
	public boolean isElePresent(By locator)
	{
		try {
			driver.findElement(locator);
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("element is not available");
			return false;
		}
	}

}
