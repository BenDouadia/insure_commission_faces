package insure.commission.login.cotrol;

import org.openqa.selenium.WebDriver;

import insure.commission.login.entity.LoginModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class LoginMethods {

	WebDriver driver;
	BasePage basePage = new BasePage();
	LoginModel loginModel = new LoginModel();

	public LoginMethods() {
		this.driver = Hook.getDriver();
		loginModel = LoginConfiguration.getInstance().getLogin();
	}
	public void initializeLogin() {
		try {
			basePage.log.info("Login als: " + loginModel.getUsername());

			basePage.selectDropdownByValue(loginModel.getTenant(), LoginConstants.inputTenantSelector);

			driver.findElement(LoginConstants.inputUsernameSelector).clear();
			driver.findElement(LoginConstants.inputUsernameSelector).sendKeys(loginModel.getUsername());

			driver.findElement(LoginConstants.inputPasswordSelector).clear();
			driver.findElement(LoginConstants.inputPasswordSelector).sendKeys(loginModel.getPassword());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickLoginButton() {
		driver.findElement(LoginConstants.loginButtonSelector).click();
	}

	public void clickLogoutButton() {
		driver.findElement(LoginConstants.logoutButtonSelector).click();
	}
}
