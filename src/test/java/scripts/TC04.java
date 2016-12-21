package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import or.HomePage;
import wdCustCmds.ActionDriver;

public class TC04 extends ActionDriver{
	
	@Test
	public void testTC04() throws InterruptedException {
		logger = report.startTest("TC04");
		launchApplication("http://www.rightstart.com/"); 

		//Enter a value in Search text box
		type(HomePage.txtSearchTextBox, "diapers", "Search Textbox");
		Thread.sleep(5000);
		report.endTest(logger);
		report.flush();
	}

}
