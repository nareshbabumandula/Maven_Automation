package reuse;

import or.HomePage;
import wdCustCmds.ActionDriver;

public class BusinessFunctions extends ActionDriver{
	
	public void search()
	{
		launchApplication("http://www.rightstart.com/"); 
		type(HomePage.txtSearch, "toys","Search Box");
		click(HomePage.btnSearch,"Search Button");
	}

}
