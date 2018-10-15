package insure.commission.financialAccountingTemplate.control;

import org.openqa.selenium.By;

public interface FinancialAccountingTemplateConstants {
	By financialAccountingButtonSelector = By.xpath("//a[contains(@id, 'link-financialAccountingTemplateSearch:link')]");

	By searchNameSelector = By.id("insure-main-form:container-financialAccounting:fieldset-financialAccountingTemplateSearch-common:input-filter-name:input");

	By inputBookingTypeSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-bookingType:select");
	By inputNameSelector = 	By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-name:input");
	By inputValueSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-value:input");
	By inputCalculationSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-calculation:select");
	By inputRepeatSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-repeat:select");
	By inputRepeatCountSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-repeatCount:input");
	By inputAccountSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-account:select");
	By inputOffsettingAccountSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-offsettingAccount:select");
	By inputCostCenterSelector = By.id("insure-main-form:fieldset-costCenter:input-financialAccountingTemplate-costCenter:select");

	By outputBookingTypeSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-bookingType:output");
	By outputNameSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-name:output");
	By outputValueSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-value:output");
	By outputCalculationSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-calculation:output");
	By outputRepeatSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-repeat:output");
	By outputRepeatCountSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-repeatCount:output");
	By outputAccountSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-account:output");
	By outputOffsettingAccountSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-offsettingAccount:output");
	By outputCostCenterSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:output-financialAccountingTemplate-costCenter:output");

	By editBookingTypeSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-bookingType:select");
	By editNameSelector = 	By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-name:input");
	By editValueSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-value:input");
	By editCalculationSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-calculation:select");
	By editRepeatSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-repeat:select");
	By editRepeatCountSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-repeatCount:input");
	By editAccountSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-account:select");
	By editOffsettingAccountSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-offsettingAccount:select");
	By editCostCenterSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-financialAccountingTemplate-costCenter:select");

	By searchButtonSelector = By.id("insure-main-form:action-search:button");
	By resetButtonSelector = By.id("insure-main-form:action-reset:button");
	By logoutButtonSelector = By.id("form-login:button-logout:button");
	By addButtonSelector = By.id("insure-main-form:add-financialAccounting:button");
	By showButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-view insure-action-button insure-card-action-btn mousetrap')]");
	By deleteButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-delete insure-action-button insure-card-action-btn mousetrap')]");
	By returnButtonSelector = By.id("insure-main-form:button-back:button");
	By editButtonSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:button-financialAccountingTemplate-bearbeiten:button");

	By inputSaveButtonSelector = By.id("insure-main-form:fieldset-costCenter:input-fieldset-financialAccountingTemplate-speichern:button");
	By inputQuitButtonSelector = By.id("insure-main-form:fieldset-costCenter:input-fieldset-financialAccountingTemplate-abbrechen:button");

	By editSaveButtonSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-editSection-speichern:button");
	By editQuitButtonSelector = By.id("insure-main-form:financialAccountingTemplate:fieldset-financialAccountingTemplate:editSection:input-editSection-abbrechen:button");
}
