package insure.commission.personalDetail.control;

import org.openqa.selenium.By;

public interface PersonalDetailConstants {

	By outputDateOfBirthSelector = By.id("insure-main-form:personDetail:fieldset-personDetail:output-dateOfBirth:output");
	By outputDateOfDeathSelector = By.id("insure-main-form:personDetail:fieldset-personDetail:output-dateOfDeath:output");
	By outputNameAtBirthSelector = By.id("insure-main-form:personDetail:fieldset-personDetail:output-nameAtBirth:output");
	By outputPlaceOfBirthSelector = By.id("insure-main-form:personDetail:fieldset-personDetail:output-placeOfBirth:output");
	By outputMaritalStatusSelector = By.id("insure-main-form:personDetail:fieldset-personDetail:output-maritalStatus:output");

	By inputDateOfBirthSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-dateOfBirth:inputInputDate");
	By inputDateOfDeathSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-dateOfDeath:inputInputDate");
	By inputNameAtBirthSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-nameAtBirth:input");
	By inputPlaceOfBirthSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-placeOfBirth:input");
	By inputMaritalStatusSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-maritalStatus:select");

	By editPersonalDetailButtonSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:button-personDetail-bearbeiten:button");
	By masterdataButtonSelector = By.id("insure-main-form:button-person-showMasterdata:button");
	By savePersonalDetailButtonSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-editSection-speichern:button");
	By quitPersonalDetailButtonSelector = By
			.id("insure-main-form:personDetail:fieldset-personDetail:editSection:input-editSection-abbrechen:button");
}
