package insure.commission.login.cotrol;

import org.openqa.selenium.By;

public interface LoginConstants {

	By inputTenantSelector = By.id("insure-main-form:fieldset-login:input-tenant:select");
	By inputUsernameSelector = By.id("insure-main-form:fieldset-login:input-username:input");
	By inputPasswordSelector = By.id("insure-main-form:fieldset-login:input-password:input");

	By loginButtonSelector = By.id("insure-main-form:fieldset-login:button-login:button");
	By logoutButtonSelector = By.id("form-login:container-externalSalesConultant:button-logout:button");
}
