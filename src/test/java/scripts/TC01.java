package scripts;

import org.testng.annotations.Test;

import or.HomePage;
import wdCustCmds.ActionDriver;

public class TC01 extends ActionDriver{
  @Test
  public void testTC01() throws InterruptedException {
	 logger = report.startTest("TC01");

//Access Right Start Site	 
launchApplication("http://www.rightstart.com/"); 

//Enter the value in Search textbox	 
type(HomePage.txtSearch, "toys","Search Textbox");
	 
click(HomePage.btnSearch,"Search Button");
	
	 
Thread.sleep(5000);
	 
report.endTest(logger);
	 
report.flush();
	  
  }
}
