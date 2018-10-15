package insure.commission.masterdata.control;

import org.openqa.selenium.By;

public interface MasterdataConstants {

	By outputIdSelector = By.id("insure-main-form:masterdata:fieldset-masterdata:output-id:output");
	By outputTypeSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-type:output");
	By outputNameSelector = By.id("insure-main-form:masterdata:fieldset-masterdata:output-name:output");
	By outputFirstNameSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-firstName:output");
	By outputTitelSelector = By.id("insure-main-form:masterdata:fieldset-masterdata:output-title:output");
	By outputGenderSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-gender:output");
	By outputAdditionalNameOneSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-additionalNameOne:output");
	By outputAdditionalNameTwoSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-additionalNameTwo:output");
	By outputNationalitySelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-land:output");
	By outputLanguageSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-language:output");
	By outputCommentOneSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-commentOne:output");
	By outputCommentTwoSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-commentTwo:output");
	By outputPersonalSalutationSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-personalSalutation:output");
	By outputCategorySelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:output-category:output");

	By inputTypeSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-masterDataType:select");
	By inputTitelSelector = By.id("insure-main-form:fieldset-masterDataAdd:input-titel-person:select");
	By inputFirstNameSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-firstName-person:input");
	By inputNameSelector = By.id("insure-main-form:fieldset-masterDataAdd:input-name-person:input");
	By inputAdditionalNameOneSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-additionalNameOne-person:input");
	By inputAdditionalNameTwoSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-additionalNameTwo:input");
	By inputNationalitySelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-nationality:select");
	By inputCategorySelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-category-person:select");
	By inputLanguageSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-language-person:select");
	By inputCommentOneSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-commentOne-person:select");
	By inputCommentTwoSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-commentTwo-person:select");
	By inputPersonalSalutationSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:input-personalSalutation-person:input");

	By editGenderSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-gender:select");
	By editTitelSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-titel:select");
	By editFirstNameSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-firstName:input");
	By editNameSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-name:input");
	By editAdditionalNameOneSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-additionalNameOne:input");
	By editAdditionalNameTwoSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-additionalNameTwo:input");
	By editNationalitySelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-nationality:select");
	By editCategorySelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-category:select");
	By editLanguageSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-language:select");
	By editCommentOneSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-commentOne:select");
	By editCommentTwoSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:output-commentTwo:select");
	By editPersonalSalutationSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-personalSalutation:input");

	By saveButtonSelector = By.id("insure-main-form:button-save:button");
	By personalDetailButtonSelector = By.id("insure-main-form:button-showPerson:button");
	By searchButtonSelector = By
			.id("insure-main-form:button-masterDataSearch-showMasterdata:button");
	By quitButtonSelector = By.id("insure-main-form:button-discard:button");
	By backButtonSelector = By.id("insure-main-form:masterdata-return:button");
	By addExternalSalespartnerButtonSelector = By
			.id("insure-main-form:fieldset-masterDataAdd:add-externalsalespartner:button");
	By addAddressAndCommunicationButtonSelector = By
			.id("insure-main-form:button-addAddressCommunication:button");

	By editButtonSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:button-masterdata-bearbeiten:button");
	By editSaveButtonSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-editSection-speichern:button");
	By editQuitButtonSelector = By
			.id("insure-main-form:masterdata:fieldset-masterdata:editSection:input-editSection-abbrechen:button");
}
