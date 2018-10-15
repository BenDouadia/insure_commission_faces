package insure.commission.address.control;

import org.openqa.selenium.By;

public interface AddressConstants {

	By outputTypeSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:output-addressType:output");
	By outputStreetSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-locationStreet:output");
	By outputHouseNumberSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-locationHouseNumber:output");
	By outputPostOfficeBoxSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-postOfficeBox:output");
	By outputAdditionalAddressOneSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-additionalAddressOne:output");
	By outputAdditionalAddressTwoSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-additionalAddressTwo:output");
	By outputAdditionalAddressThreeSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-additionalAddressThree:output");
	By outputZipcodeSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-zipcode:output");
	By outputCitySelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:input-city:output");
	By outputCountrySelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:output-country:output");

	By editTypeSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-addressType:select");
	By editStreetSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-locationStreet:input");
	By editHouseNumberSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-locationHouseNumber:input");
	By editPostOfficeBoxSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-postOfficeBox:input");
	By editAdditionalAddressOneSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-additionalAddressOne:input");
	By editAdditionalAddressTwoSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-additionalAddressTwo:input");
	By editAdditionalAddressThreeSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-additionalAddressThree:input");
	By editZipcodeSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-zipcode:input");
	By editCitySelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-city:input");
	By editCountrySelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-country:select");

	By inputTypeSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-addressType:select");
	By inputStreetSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-locationStreet-address:input");
	By inputHouseNumberSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-locationHouseNumber-address:input");
	By inputPostOfficeBoxSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-postOfficeBox-address:input");
	By inputAdditionalAddressOneSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-additionalAddressOne-address:input");
	By inputAdditionalAddressTwoSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-additionalAddressTwo-address:input");
	By inputAdditionalAddressThreeSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-additionalAddressThree-address:input");
	By inputZipcodeSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-zipcode-address:input");
	By inputCitySelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-city-address:input");
	By inputCountrySelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-country-address:select");

	By showAddressButtonSelector = By.xpath("//input[contains(@id, 'viewButton-address:button')]");
	By deleteAddressButtonSelector = By.xpath("//input[contains(@id, 'deleteButton-address:button')]");
	By addAddressButtonSelector = By.id("insure-main-form:fieldset-physicalAddress:action-add-physical-address:button");
	By editAddressButtonSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:button-addressinformation-show-bearbeiten:button");

	By saveButtonSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-addSection-speichern:button");
	By quitButtonSelector = By.id("insure-main-form:addressinformation-create:fieldset-addressinformation-create:addSection:input-addSection-abbrechen:button");
	By returnButtonSelector = By.id("insure-main-form:button-physicalAddress-showMasterData:button");

	By editSaveButtonSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-editSection-speichern:button");
	By editQuitButtonSelector = By.id("insure-main-form:addressinformation-show:fieldset-addressinformation-show:editSection:input-editSection-abbrechen:button");
}
