package insure.commission.login.cotrol;

import insure.commission.login.entity.LoginModel;
import insure.commission.utility.BasePage;

public class LoginConfiguration {

	private static LoginModel loginModel = new LoginModel();

	private static int suffix = BasePage.randomNumber();
	private static LoginConfiguration instance;

	public static LoginConfiguration getInstance() {
		if (instance == null) {
			instance = new LoginConfiguration();
		}

		return instance;
	}

	public static LoginModel buildLogin() {
		loginModel.setTenant("Swiss Life Partnermanagement");
		loginModel.setUsername("DevSuperVisor09");
		loginModel.setPassword("Fab50java09");

		return loginModel;
	}

	public LoginModel getLogin() {
		return loginModel;
	}

	public void setLogin(LoginModel loginModel) {
		this.loginModel = loginModel;
	}
}
