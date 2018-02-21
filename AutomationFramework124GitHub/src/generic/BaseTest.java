package generic;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static {
		System.setProperty(GECKO_KEY,GECKO_PATH);
		System.setProperty(CHROME_KEY,CHROME_PATH);
	}

	@BeforeMethod
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.get(Lib.getProperty("URL"));
		/*String url = Lib.getProperty("URL");
		driver.get(url);
*/	}

	@AfterMethod
	public void closeApplication() {
		driver.close();
	}
}
