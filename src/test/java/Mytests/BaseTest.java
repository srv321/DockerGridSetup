package Mytests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();

	@BeforeMethod
	@Parameters(value = { "browser" })
	public void setUp(String browser) throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", browser);

		// set the hub url
		driver.set(new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), caps));

	}

	public RemoteWebDriver getDriver() {
		return driver.get();
	}

	@AfterMethod
	public void tearDown() {
		getDriver().quit();

	}

	@AfterClass
	public void terminate() {
		driver.remove();
	}

}
