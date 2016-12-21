package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli_Test {
	
	static WebDriver driver;

	public static void main(String[] args) throws FindFailed {
		driver = new FirefoxDriver();
		driver.get("http://www.rightstart.com/");
		driver.manage().window().maximize();
		Screen screen = new Screen();
		Pattern image1 = new Pattern("G:\\Selenium_Java\\Webdriver_Maven_Framework\\Images\\txtSearchBox.png");
		Pattern image2 = new Pattern("G:\\Selenium_Java\\Webdriver_Maven_Framework\\Images\\btnSearch.png");
		//Wait for the image1
		screen.wait(image1);
		//Type the value in search text box
		screen.type(image1,"pampers");
		//Click on Search button
		screen.click(image2);
	}
}
