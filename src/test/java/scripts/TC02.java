package scripts;

import org.testng.annotations.Test;

import or.CategoryPage;
import or.ResultsPage;
import reuse.BusinessFunctions;

public class TC02 extends BusinessFunctions{
  @Test
  public void testTC02() throws InterruptedException {
	  logger = report.startTest("TC02");
	 search();//reusable function
	 click(CategoryPage.lnkActivity,"Activity Link");//Customized webdriver command
	 click(ResultsPage.lnkProduct,"First Product");
//	driver.findElement(By.id("")).click(); //use driver commands
	 Thread.sleep(5000);
	 report.endTest(logger);
	 report.flush();
	  
  }
}
