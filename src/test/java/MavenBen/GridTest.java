package MavenBen;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
	
	 
	public static void main(String[] args) throws MalformedURLException 
	{
		//System.setProperty("webdriver.gecko.driver","C://Selenium jars//geckodriver.exe");
		
		System.out.println("first");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		System.out.println("second");
				cap.setPlatform(Platform.WINDOWS);
			
				System.out.println("third");
		URL url =new URL("http://localhost:4444/wd/hub");
		System.out.println("fourth");
		WebDriver driver = new RemoteWebDriver(url, cap);
		System.out.println("fifth");
		driver.get("https://www.google.com/?gws_rd=ssl");
		System.out.println("Tiltle is " + driver.getTitle());
		
		
	}
}
