package insure.commission.login;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.login.cotrol.LoginConfiguration;
import insure.commission.login.cotrol.LoginMethods;
import insure.commission.login.entity.LoginModel;
import insure.commission.utility.Hook;

public class Login {

	WebDriver driver;
	LoginMethods loginMethods  = new LoginMethods();
	LoginModel loginModel = new LoginModel();

	public Login() {
		this.driver = Hook.getDriver();
		loginModel = LoginConfiguration.getInstance().buildLogin();
	}

	@Given("^: Ich bin als Admin eingelogt$")
	public void ich_bin_als_Admin_eingelogt() throws Throwable {
		loginMethods.initializeLogin();
		loginMethods.clickLoginButton();
	}

	@Given("^Ich rufe die Seite auf$")
	public void ich_rufe_die_Seite_auf() throws Throwable {

	}

	@Given("^Ich gebe die Logindaten ein: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void ich_gebe_die_Logindaten_ein(String tenant, String username, String password) throws Throwable {
		loginModel.setTenant(tenant);
		loginModel.setUsername(username);
		loginModel.setPassword(password);

		loginMethods.initializeLogin();
	}

	@When("^Ich loge mich ein$")
	public void ich_loge_mich_ein() throws Throwable {
		loginMethods.clickLoginButton();
	}

	@Then("^Die StammdatenSucheSeite wird angezeigt$")
	public void die_StammdatenSucheSeite_wird_angezeigt() throws Throwable {
		loginMethods.clickLogoutButton();
	}
}
