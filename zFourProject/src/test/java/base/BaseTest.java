package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class BaseTest {

	public WebDriver driver = null;
	private static String projectLocation = System.getProperty("user.dir");

	public void openBrowser(String browserName) {
		DesiredCapabilities cap = new DesiredCapabilities();

		if (browserName.equalsIgnoreCase("chrome")) {
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName(BrowserType.CHROME);
		} else if (browserName.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", projectLocation + "\\src\\test\\resources\\Jars\\geckodriver.exe");
			//driver = new FirefoxDriver();
			cap.setCapability("marionette", true);
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName(BrowserType.FIREFOX);
			
		} else if (browserName.equalsIgnoreCase("ie")) {
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName(BrowserType.IE);
		} else if (browserName.equalsIgnoreCase("edge")) {
			cap.setPlatform(Platform.ANY);
			cap.setBrowserName(BrowserType.EDGE);
		}

		try {
			driver = new RemoteWebDriver(new URL("http://192.168.254.109:4444/"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterMethod
	public void quitBrowser() {

		if (driver != null)
			driver.quit();
	}
}
