package insure.commission.costCenter.control;

import org.openqa.selenium.By;

public interface CostCenterConstants {
	By costCenterButtonSelector = By.xpath("//a[contains(@id, 'link-costCenterSearch:link')]");

	By numberSelector = By.id("insure-main-form:container-costCenter:fieldset-costCenterSearch-common:input-filter-number:input");
	By shortNameSelector = By.id("insure-main-form:container-costCenter:fieldset-costCenterSearch-common:input-filter-shortName:input");

	By inputNumberSelector = By.id("insure-main-form:fieldset-costCenterAdd:input-costCenter-number:input");
	By inputNameSelector = By.id("insure-main-form:fieldset-costCenterAdd:input-costCenter-name:input");
	By inputShortNameSelector = By.id("insure-main-form:fieldset-costCenterAdd:input-costCenter-shortName:input");

	By outputNumberSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:output-costCenter-number:output");
	By outputNameSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:output-costCenter-name:output");
	By outputShortNameSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:output-costCenter-shortName:output");

	By editNumberSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:editSection:input-costCenter-number:input");
	By editNameSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:editSection:input-costCenter-name:input");
	By editShortNameSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:editSection:input-costCenter-shortName:input");

	By searchButtonSelector = By.id("insure-main-form:action-search:button");
	By resetButtonSelector = By.id("insure-main-form:action-reset:button");
	By logoutButtonSelector = By.id("form-login:button-logout:button");
	By addButtonSelector = By.id("insure-main-form:add-costCenter:button");
	By showButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-view insure-action-button insure-card-action-btn mousetrap')]");
	By deleteButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-delete insure-action-button insure-card-action-btn mousetrap')]");
	By returnButtonSelector = By.id("insure-main-form:button-back-costCenterSearch:button");
	By editButtonSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:button-costCenter-bearbeiten:button");

	By inputSaveButtonSelector = By.id("insure-main-form:fieldset-costCenterAdd:input-fieldset-costCenter-speichern:button");
	By inputQuitButtonSelector = By.id("insure-main-form:fieldset-costCenterAdd:input-fieldset-costCenter-abbrechen:button");

	By editSaveButtonSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:editSection:input-editSection-speichern:button");
	By editQuitButtonSelector = By.id("insure-main-form:costCenter:fieldset-costCenter:editSection:input-editSection-abbrechen:button");
}
