package MavenBen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities ch = new DesiredCapabilities();
		ch.setBrowserName("Chrome");
		//comment added
		System.setProperty("webdriver.chrome.driver","C://Selenium jars//Chrome Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/?gws_rd=ssl");
		
		System.out.println("Exceution is success");
		
	}

}
