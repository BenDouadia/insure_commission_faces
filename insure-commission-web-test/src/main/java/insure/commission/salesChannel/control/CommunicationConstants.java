package insure.commission.salesChannel.control;

import org.openqa.selenium.By;

public interface CommunicationConstants {

	By inputPhoneNumberSelector = By.id("insure-main-form:fieldset-communication:input-phonenumber:input");
	By inputFaxSelector = By.id("insure-main-form:fieldset-communication:input-fax:input");
	By inputEmailSelector = By.id("insure-main-form:fieldset-communication:input-email:input");
	By inputWebsiteSelector = By.id("insure-main-form:fieldset-communication:input-homepage:input");

	By outputPhoneNumberSelector = By.id("insure-main-form:fieldset-communication:output-phonenumber:output");
	By outputFaxSelector = By.id("insure-main-form:fieldset-communication:output-fax:output");
	By outputEmailSelector = By.id("insure-main-form:fieldset-communication:output-email:output");
	By outputWebsiteSelector = By.id("insure-main-form:fieldset-communication:output-homepage:output");
}
