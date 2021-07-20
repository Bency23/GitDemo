package MavenBen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DemoTest {

@Test	
public  void initialize()
{
	
	System.setProperty("webdriver.gecko.driver","C://Selenium jars//geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/?gws_rd=ssl");
	System.out.println("Exceution is success");
	
	
}
	
		
}
