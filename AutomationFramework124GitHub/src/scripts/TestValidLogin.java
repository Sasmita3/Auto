package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;

public class TestValidLogin extends BaseTest {
	@Test
	public void testValidLogin() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		String un = Lib.getCellValue("ValidLogin", 1, 0);
		lp.setUsername(un);
		Thread.sleep(1000);
		String pwd = Lib.getCellValue("ValidLogin", 1, 1);
		lp.setPassword(pwd);
		Thread.sleep(1000);
		lp.clickLogin();
		Thread.sleep(500);

	}
}
