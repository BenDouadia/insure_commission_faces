package insure.commission.communication.control;

import org.openqa.selenium.By;

public interface CommunicationConstants {
	//Email
		By outputCommunicationChannelEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-communicationChannel-communication:output");
		By outputCommunicationTypeEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-communicationType-email-communication:output");
		By outputEmailAddressEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-email-communication:output");
		By outputNoteEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-note-emailAccount-communication:output");

		By editCommunicationChannelEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-communicationChannel-communication:select");
		By editCommunicationTypeEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-communicationType-email-communication:select");
		By editEmailAddressEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-email-communication:input");
		By editNoteEmailSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-note-emailAccount-communication:input");

		By inputCommunicationChannelEmailSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-communicationChannel-communication:select");
		By inputCommunicationTypeEmailSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-communicationType-email-communication:select");
		By inputEmailAddressEmailSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-email-communication:input");
		By inputNoteEmailSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-note-emailAccount-communication:input");

		//SocialNetwork
		By outputCommunicationChannelSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-communicationChannel-communication:output");
		By outputPlatformSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-socialMediaType-communication:output");
		By outputAccountSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-account-communication:output");
		By outputNoteSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-note-socialMediaAccount-communication:output");

		By editCommunicationChannelSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-communicationChannel-communication:select");
		By editPlatformSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-socialMediaType-communication:select");
		By editAccountSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-account-communication:input");
		By editNoteSocialNetworkSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-note-socialMediaAccount-communication:input");

		By inputCommunicationChannelSocialNetworkSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-communicationChannel-communication:select");
		By inputPlatformSocialNetworkSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-socialMediaType-communication:select");
		By inputAccountSocialNetworkSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-account-communication:input");
		By inputNoteSocialNetworkSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-note-socialMediaAccount-communication:input");

		//Website
		By outputCommunicationChannelWebsiteSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-communicationChannel-communication:output");
		By outputUrlWebsiteSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-homepage-communication:output");
		By outputNoteWebsiteSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:output-note-homePageAccount-communication:output");

		By editCommunicationChannelWebsiteSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-communicationChannel-communication:select");
		By editUrlWebsiteSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-homepage-communication:input");
		By editNoteWebsiteSelector = By.id("insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-note-homePageAccount-communication:input");

		By inputCommunicationChannelWebsiteSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-communicationChannel-communication:select");
		By inputUrlSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-homepage-communication:input");
		By inputNoteWebsiteSelector = By.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-note-homePageAccount-communication:input");

		//Phone
		By outputCommunicationChannelPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-communicationChannel-communication:output");
		By outputCommunicationTypePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-communicationType-communication:output");
		By outputPhoneTypePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-phoneType-communication:output");
		By outputCountryPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-country-communication:output");
		By outputAreaCodePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-areaCode-communication:output");
		By outputNumberPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-number-communication:output");
		By outputAdvertisementPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-advertisement-communication:icon");
		By outputAdvertisingFromPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:input-advertisingFrom-communication:output");
		By outputAdvertisingToPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:input-advertisingTo-communication:output");
		By outputNotePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:output-note-entity-communication:output");

		By editCommunicationChannelPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-communicationChannel-communication:select");
		By editCommunicationTypePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-communicationType-communication:select");
		By editPhoneTypePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-phoneType-communication:select");
		By editCountryPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-country-communication:select");
		By editAreaCodePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-areaCode-communication:input");
		By editNumberPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-number-communication:input");
		By editAdvertisementPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-advertisement-communication:icon");
		By editAdvertisingFromPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-advertisingFrom-communication:input");
		By editAdvertisingToPhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-advertisingTo-communication:input");
		By editNotePhoneSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-note-entity-communication:input");

		By inputCommunicationChannelPhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-communicationChannel-communication:select");
		By inputCommunicationTypePhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-communicationType-phone-communication:select");
		By inputPhoneTypePhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-phoneType-communication-communication:select");
		By inputCountryPhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-country-communication:select");
		By inputAreaCodePhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-areaCode-communication:input");
		By inputNumberPhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-number-communication:input");
		By inputAdvertisementPhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-advertisement-communication:icon");
		By inputAdvertisingFromPhoneSelector = By.id(
				"insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-advertisingFrom-communication:input");
		By inputAdvertisingToPhoneSelector = By.id(
				"insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-advertisingTo-communication:input");
		By inputNotePhoneSelector = By
				.id("insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-note-entity-communication:input");

		By showCommunicationButtonSelector = By
				.xpath("//input[contains(@id, 'viewButton-communication:button')]");
		By deleteCommunicationButtonSelector = By
				.xpath("//input[contains(@id, 'deleteButton-communication:button')]");
		By addCommunicationButtonSelector = By
				.id("insure-main-form:fieldset-communication:action-add-communication:button");
		By returnCommunicationButtonSelector = By.id("insure-main-form:button-masterDataShow:button");
		By editCommunicationButtonSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:button-communicationdetails-bearbeiten:button");

		By saveCommunicationButtonSelector = By.id(
				"insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-addSection-speichern:button");
		By quitCommunicationButtonSelector = By.id(
				"insure-main-form:communicationDetails:fieldset-communicationDetails:addSection:input-addSection-abbrechen:button");

		By editSaveCommunicationButtonSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-editSection-speichern:button");
		By editQuitCommunicationButtonSelector = By.id(
				"insure-main-form:communicationdetails:fieldset-communicationdetails:editSection:input-editSection-abbrechen:button");

}
