package insure.commission.externalSalespartner.control;

import org.openqa.selenium.By;

interface ExternalSalespartnerConstants {

	By outputNameSelector = By.id("");
	By outputFirstNameSelector = By.id("");
	By outputSalespartnerNumberSelector = By.id("");
	By outputSaleschannelSelector = By.id("");
	By outputOrganizationRoleSelector = By.id("");

	By inputNameSelector = By.id("insure-main-form:fieldset-salesPartnerSearch:input-name:input");
	By inputFirstNameSelector = By.id("insure-main-form:fieldset-salesPartnerSearch:input-firstName:input");
	By inputSalespartnerNumberSelector = By.id("insure-main-form:fieldset-salesPartnerSearch:input-spNumber:input");
	By inputSaleschannelSelector = By.id("insure-main-form:fieldset-salesPartnerSearch:input-saleschannel:select");
	By inputOrganizationRoleSelector = By.id("insure-main-form:fieldset-salesPartnerSearch:input-organizationRole:select");

	By searchButtonSelector = By.id("insure-main-form:fieldset-salesPartnerSearch:action-search:button");
	By returnButtonSelector = By.id("insure-main-form:action-return:button");
	By addSalespartnerSelector = By.xpath("//input[contains(@id, 'action-add-return:button')]");
}
