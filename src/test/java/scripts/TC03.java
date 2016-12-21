package scripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import or.HomePage;
import wdCustCmds.ActionDriver;

public class TC03 extends ActionDriver{
  @Test
  public void testTC03() throws InterruptedException {
	  logger = report.startTest("TC03");
	 launchApplication("http://www.rightstart.com/"); 
	/* if(isElePresent(By.xpath("//a[@title='Close']")))
	 {
		 click(By.xpath("//a[@title='Close']"));
	 }
	 else
	 {
		 System.out.println("Element is not present cotinue next steps");
	 }*/
	 Thread.sleep(3000);
	 click(HomePage.lnkSignIn,"Sign In Link");
	Assert.assertEquals(driver.getTitle(), "Customer Login - Rightstart.com");
	 Thread.sleep(5000);
	 report.endTest(logger);
	 report.flush();
	  
  }
}
