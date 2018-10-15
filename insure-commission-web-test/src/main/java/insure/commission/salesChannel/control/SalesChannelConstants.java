package insure.commission.salesChannel.control;

import org.openqa.selenium.By;

public interface SalesChannelConstants {

	By salesChannelButtonSelector = By.xpath("//a[contains(@id, 'link-salesChannel:link')]");

	By searchNameSelector = By.id("insure-main-form:fieldset-saleschannelSearch:input-value:input");

	By inputNumberSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-number:input");
	By inputShortNameSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-shortName:input");
	By inputNameSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-name:input");
	By inputCompanyNameSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-companyName:input");
	By inputExecutiveNameSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-executiveName:input");
	By inputTradeRegisterSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-tradeRegister:input");
	By inputCreditorIdSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-creditorId:input");
	By inputCountrySelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-country-Country:select");
	By inputZipcodeSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-zipCode:input");
	By inputCitySelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-city:input");
	By inputStreetSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-street:input");
	By inputHouseNumberSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-houseNumber:input");
	By inputLanguageSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-language:select");
	By inputCurrencySelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-currency:select");
	By inputContractStatusSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-contractStatus:inputInputDate");
	By inputContractFormSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-contractForm:input");
	By inputProbationTimeSelector = By.id("insure-main-form:fieldset-saleschannelAdd:input-probationTime:input");

	By outputNumberSelector = By.id("insure-main-form:fieldset-detail:output-number:output");
	By outputShortNameSelector = By.id("insure-main-form:fieldset-detail:output-shortName:output");
	By outputNameSelector = By.id("insure-main-form:fieldset-detail:output-name:output");
	By outputCompanyNameSelector = By.id("insure-main-form:fieldset-detail:output-companyName:output");
	By outputExecutiveNameSelector = By.id("insure-main-form:fieldset-detail:output-executiveName:output");
	By outputTradeRegisterSelector = By.id("insure-main-form:fieldset-detail:output-tradeRegister:output");
	By outputCreditorIdSelector = By.id("insure-main-form:fieldset-detail:output-creditorId:output");
	By outputCountrySelector = By.id("insure-main-form:fieldset-detail:output-locationcountry:output");
	By outputZipcodeSelector = By.id("insure-main-form:fieldset-detail:output-zipCode:output");
	By outputCitySelector = By.id("insure-main-form:fieldset-detail:output-city:output");
	By outputStreetSelector = By.id("insure-main-form:fieldset-detail:output-street:output");
	By outputHouseNumberSelector = By.id("insure-main-form:fieldset-detail:output-houseNumber:output");
	By outputLanguageSelector = By.id("insure-main-form:fieldset-detail:output-language:output");
	By outputCurrencySelector = By.id("insure-main-form:fieldset-detail:output-currency:output");
	By outputContractStatusSelector = By.id("insure-main-form:fieldset-detail:output-contractStatus:output");
	By outputContractFormSelector = By.id("insure-main-form:fieldset-detail:output-contractForm:output");
	By outputProbationTimeSelector = By.id("insure-main-form:fieldset-detail:output-probationTime:output");

	By editNumberSelector = By.id("insure-main-form:fieldset-detail:input-number:input");
	By editShortNameSelector = By.id("insure-main-form:fieldset-detail:input-shortName:input");
	By editNameSelector = By.id("insure-main-form:fieldset-detail:input-name:input");
	By editCompanyNameSelector = By.id("insure-main-form:fieldset-detail:input-companyName:input");
	By editExecutiveNameSelector = By.id("insure-main-form:fieldset-detail:input-executiveName:input");
	By editTradeRegisterSelector = By.id("insure-main-form:fieldset-detail:input-tradeRegister:input");
	By editCreditorIdSelector = By.id("insure-main-form:fieldset-detail:input-creditorId:input");
	By editCountrySelector = By.id("insure-main-form:fieldset-detail:input-locationcountry:select");
	By editZipcodeSelector = By.id("insure-main-form:fieldset-detail:input-zipCode:input");
	By editCitySelector = By.id("insure-main-form:fieldset-detail:input-city:input");
	By editStreetSelector = By.id("insure-main-form:fieldset-detail:input-street:input");
	By editHouseNumberSelector = By.id("insure-main-form:fieldset-detail:input-houseNumber:input");
	By editLanguageSelector = By.id("insure-main-form:fieldset-detail:input-language:select");
	By editCurrencySelector = By.id("insure-main-form:fieldset-detail:input-currency:select");
	By editContractStatusSelector = By.id("insure-main-form:fieldset-detail:input-contractStatus:inputInputDate");
	By editContractFormSelector = By.id("insure-main-form:fieldset-detail:input-contractForm:input");
	By editProbationTimeSelector= By.id("insure-main-form:fieldset-detail:input-probationTime:input");

	By searchButtonSelector = By.id("insure-main-form:fieldset-saleschannelSearch:action-search:button");
	By logoutButtonSelector = By.id("form-login:container-externalSalesConultant:button-logout:button");
	By addButtonSelector = By.id("insure-main-form:fieldset-saleschanelInformation:action-add-saleschannel:button");
	By showButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-view insure-action-button insure-card-action-btn mousetrap')]");
	By editButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-edit insure-action-button insure-card-action-btn mousetrap')]");
	By deleteButtonSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-delete insure-action-button insure-card-action-btn mousetrap')]");
	By returnButtonSelector = By.id("insure-main-form:button-salesChannelShow:button");

	By salesChannelEmailTemplateButtonSelector = By.id("insure-main-form:button-salesChannelEmailTemplateSearch:button");
	By salesChannelProductButtonSelector = By.id("insure-main-form:button-salesChannelProductSearch:button");

	By inputSaveButtonSelector = By.id("insure-main-form:button-save:button");
	By inputQuitButtonSelector = By.id("insure-main-form:button-discard:button");

	By editSaveButtonSelector = By.id("insure-main-form:button-save:button");
	By editQuitButtonSelector = By.id("insure-main-form:button-discard:button");

	By searchMasterdataButtonSelector = By.id("insure-main-form:button-masterDataSearch-showMasterdata:button");
}
