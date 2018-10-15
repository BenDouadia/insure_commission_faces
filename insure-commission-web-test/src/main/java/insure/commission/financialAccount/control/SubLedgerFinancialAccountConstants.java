package insure.commission.financialAccount.control;

import org.openqa.selenium.By;

public interface SubLedgerFinancialAccountConstants {
	By subLedgerFinancialAccountButtonSelector = By.xpath("//a[contains(@id, 'subLedgerFinancialAccountSearch:link')]");

	By accountNumberSelector = By.id("insure-main-form:container-subLedgerFinancialAccount:fieldset-subLedgerFinancialAccountSearch-common:input-filter-number:input");
	By accountNameSelector = By.id("insure-main-form:container-subLedgerFinancialAccount:fieldset-subLedgerFinancialAccountSearch-common:input-filter-name:input");

	By inputAccountNumberSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-number:input");
	By inputNameSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-name:input");
	By inputShortNameSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-shortName:input");
	By inputMainAccountSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-subLedgerFinancialAccount-mainAccount:select");
	By inputStatusSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-status:select");
	By inputImpactSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-impact:select");
	By inputAccountTypeSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-accountType:select");
	By inputTaxAllowanceSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-taxAllowance:select");
	By inputCashFlowDirectionSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-cashFlowDirection:select");
	By inputPaymentTypeSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-paymentType:select");
	By inputPaymentMethodSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-paymentMethod:select");
	By inputInitialValueSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-initialValue:input");

	By outputAccountNumberSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-number:output");
	By outputNameSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-name:output");
	By outputShortNameSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-shortName:output");
	By ouputMainAccountSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-subLedgerFinancialAccount-mainAccount:output");
	By outputStatusSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-status:output");
	By outputImpactSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-impact:output");
	By outputAccountTypeSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-accountType:output");
	By outputTaxAllowanceSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-taxAllowance:output");
	By outputCashFlowDirectionSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-cashFlowDirection:output");
	By outputPaymentTypeSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-paymentType:output");
	By outputPaymentMethodSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-paymentMethod:output");
	By outputInitialValueSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:output-financialAccount-initialValue:output");

	By editNameSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-name:input");
	By editShortNameSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-shortName:input");
	By editMainAccountSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-subLedgerFinancialAccount-mainAccount:select");
	By editStatusSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-status:select");
	By editImpactSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-impact:select");
	By editAccountTypeSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-accountType:select");
	By editTaxAllowanceSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-taxAllowance:select");
	By editCashFlowDirectionSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-cashFlowDirection:select");
	By editPaymentTypeSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-paymentType:select");
	By editPaymentMethodSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-paymentMethod:select");
	By editInitialValueSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-initialValue:input");

	By inputNegativeValueAllowedButtonSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-financialAccount-negativeValueAllowed:icon");
	By editNegativeValueAllowedButtonSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-financialAccount-negativeValueAllowed:icon");

	By searchButtonSelector = By.id("insure-main-form:action-search:button");
	By resetButtonSelector = By.id("insure-main-form:action-reset:button");
	By logoutButtonSelector = By.id("form-login:button-logout:button");
	By addButtonSelector = By.id("insure-main-form:add-subLedgerFinancialAccount:button");
	By showButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-view insure-action-button insure-card-action-btn mousetrap')]");
	By deleteButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-delete insure-action-button insure-card-action-btn mousetrap')]");
	By returnButtonSelector = By.id("insure-main-form:button-back:button");
	By editButtonSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:button-subLedgerFinancialAccount-bearbeiten:button");

	By inputSaveButtonSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-fieldset-ledgerFinancialAccount-speichern:button");
	By inputQuitButtonSelector = By.id("insure-main-form:fieldset-subLedgerFinancialAccount:input-fieldset-ledgerFinancialAccount-abbrechen:button");

	By editSaveButtonSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-editSection-speichern:button");
	By editQuitButtonSelector = By.id("insure-main-form:subLedgerFinancialAccount:fieldset-subLedgerFinancialAccount:editSection:input-editSection-abbrechen:button");
}
