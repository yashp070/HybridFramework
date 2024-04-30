package endToEndOfActitime;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.yash.pomrepo.ActitimeHomePage;
import com.actitime.yash.pomrepo.ActitimeLoginPage;
import com.actitime.yash.genericutility.BaseClassA;

public class LoginAndLogoutOfActitime extends BaseClassA {
@Test
	public void loginAndLogoutUponActitime() throws IOException, Throwable {
		ActitimeLoginPage loginpage = new ActitimeLoginPage(driver);
		loginpage.getUsernameTextField().sendKeys(fiileUtils.readDataFromPropertyFile("username"));
		loginpage.getPasswordTextField().sendKeys(fiileUtils.readDataFromPropertyFile("password"));
		loginpage.getLoginOption().click();
		Thread.sleep(3000);
		ActitimeHomePage homepage = new ActitimeHomePage(driver);
		homepage.getLogoutOption().click();
		Thread.sleep(3000);
	}
}
