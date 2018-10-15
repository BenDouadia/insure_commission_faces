package insure.commission.communication.control;

import org.openqa.selenium.WebDriver;

import insure.commission.communication.entity.CommunicationModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class CommunicationMethods {

	CommunicationModel communicationModel = new CommunicationModel();
	BasePage basePage = new BasePage();
	WebDriver driver;

	public CommunicationMethods() {
		this.driver = Hook.getDriver();
		communicationModel = CommunicationConfiguration.getInstance().getCommunication();
	}

	public void initializeCommunicationPhone() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.inputCommunicationChannelPhoneSelector);
			basePage.selectDropdownByValue(communicationModel.getCommunicationType(), CommunicationConstants.inputCommunicationTypePhoneSelector);
			basePage.selectDropdownByValue(communicationModel.getPhoneType(), CommunicationConstants.inputPhoneTypePhoneSelector);
			basePage.selectDropdownByValue(communicationModel.getCountry(), CommunicationConstants.inputCountryPhoneSelector);

			driver.findElement(CommunicationConstants.inputAreaCodePhoneSelector).clear();
			driver.findElement(CommunicationConstants.inputAreaCodePhoneSelector).sendKeys(communicationModel.getAreaCode());

			driver.findElement(CommunicationConstants.inputNumberPhoneSelector).clear();
			driver.findElement(CommunicationConstants.inputNumberPhoneSelector).sendKeys(communicationModel.getNumber());

			driver.findElement(CommunicationConstants.inputAdvertisementPhoneSelector).click();
			driver.findElement(CommunicationConstants.inputAdvertisingFromPhoneSelector).clear();
			driver.findElement(CommunicationConstants.inputAdvertisingFromPhoneSelector).sendKeys(communicationModel.getAdvertisingFrom());

			driver.findElement(CommunicationConstants.inputAdvertisingToPhoneSelector).clear();
			driver.findElement(CommunicationConstants.inputAdvertisingToPhoneSelector).sendKeys(communicationModel.getAdvertisingTo());

			driver.findElement(CommunicationConstants.inputNotePhoneSelector).clear();
			driver.findElement(CommunicationConstants.inputNotePhoneSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editCommunicationPhone() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.editCommunicationChannelPhoneSelector);
			basePage.selectDropdownByValue(communicationModel.getCommunicationType(), CommunicationConstants.editCommunicationTypePhoneSelector);
			basePage.selectDropdownByValue(communicationModel.getPhoneType(), CommunicationConstants.editPhoneTypePhoneSelector);
			basePage.selectDropdownByValue(communicationModel.getCountry(), CommunicationConstants.editCountryPhoneSelector);

			driver.findElement(CommunicationConstants.editAreaCodePhoneSelector).clear();
			driver.findElement(CommunicationConstants.editAreaCodePhoneSelector).sendKeys(communicationModel.getAreaCode());

			driver.findElement(CommunicationConstants.editNumberPhoneSelector).clear();
			driver.findElement(CommunicationConstants.editNumberPhoneSelector).sendKeys(communicationModel.getNumber());

			driver.findElement(CommunicationConstants.editAdvertisementPhoneSelector).click();

//			driver.findElement(CommunicationConstants.editAdvertisingFromPhoneSelector).clear();
//			driver.findElement(CommunicationConstants.editAdvertisingFromPhoneSelector).sendKeys(advertisingFrom);
//
//			driver.findElement(CommunicationConstants.editAdvertisingToPhoneSelector).clear();
//			driver.findElement(CommunicationConstants.editAdvertisingToPhoneSelector).sendKeys(advertisingTo);

			driver.findElement(CommunicationConstants.editNotePhoneSelector).clear();
			driver.findElement(CommunicationConstants.editNotePhoneSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializeCommunicationSocialNetwork() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.inputCommunicationChannelSocialNetworkSelector);
			basePage.selectDropdownByValue(communicationModel.getPlatform(), CommunicationConstants.inputPlatformSocialNetworkSelector);

			driver.findElement(CommunicationConstants.inputAccountSocialNetworkSelector).clear();
			driver.findElement(CommunicationConstants.inputAccountSocialNetworkSelector).sendKeys(communicationModel.getAccount());

			driver.findElement(CommunicationConstants.inputNoteSocialNetworkSelector).clear();
			driver.findElement(CommunicationConstants.inputNoteSocialNetworkSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editCommunicationSocialNetwork() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.editCommunicationChannelSocialNetworkSelector);
			basePage.selectDropdownByValue(communicationModel.getPlatform(), CommunicationConstants.editPlatformSocialNetworkSelector);

			driver.findElement(CommunicationConstants.editAccountSocialNetworkSelector).clear();
			driver.findElement(CommunicationConstants.editAccountSocialNetworkSelector).sendKeys(communicationModel.getAccount());

			driver.findElement(CommunicationConstants.editNoteSocialNetworkSelector).clear();
			driver.findElement(CommunicationConstants.editNoteSocialNetworkSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializeCommunicationEmail() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.inputCommunicationChannelEmailSelector);
			basePage.selectDropdownByValue(communicationModel.getCommunicationType(), CommunicationConstants.inputCommunicationTypeEmailSelector);

			driver.findElement(CommunicationConstants.inputEmailAddressEmailSelector).clear();
			driver.findElement(CommunicationConstants.inputEmailAddressEmailSelector).sendKeys(communicationModel.geteMail());

			driver.findElement(CommunicationConstants.inputNoteEmailSelector).clear();
			driver.findElement(CommunicationConstants.inputNoteEmailSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editCommunicationEmail() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.editCommunicationChannelEmailSelector);
			basePage.selectDropdownByValue(communicationModel.getCommunicationType(), CommunicationConstants.editCommunicationTypeEmailSelector);

			driver.findElement(CommunicationConstants.editEmailAddressEmailSelector).clear();
			driver.findElement(CommunicationConstants.editEmailAddressEmailSelector).sendKeys(communicationModel.geteMail());

			driver.findElement(CommunicationConstants.editNoteEmailSelector).clear();
			driver.findElement(CommunicationConstants.editNoteEmailSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializeCommunicationWebsite() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.inputCommunicationChannelWebsiteSelector);

			driver.findElement(CommunicationConstants.inputUrlSelector).clear();
			driver.findElement(CommunicationConstants.inputUrlSelector).sendKeys(communicationModel.getUrl());

			driver.findElement(CommunicationConstants.inputNoteWebsiteSelector).clear();
			driver.findElement(CommunicationConstants.inputNoteWebsiteSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editCommunicationWebsite() {
		try {
			basePage.selectDropdownByValue(communicationModel.getChannel(), CommunicationConstants.editCommunicationChannelWebsiteSelector);

			driver.findElement(CommunicationConstants.editUrlWebsiteSelector).clear();
			driver.findElement(CommunicationConstants.editUrlWebsiteSelector).sendKeys(communicationModel.getUrl());

			driver.findElement(CommunicationConstants.editNoteWebsiteSelector).clear();
			driver.findElement(CommunicationConstants.editNoteWebsiteSelector).sendKeys(communicationModel.getNote());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveCommunicationButton() {
		driver.findElement(CommunicationConstants.saveCommunicationButtonSelector).click();
	}

	public void quittCommunicationButton() {
		driver.findElement(CommunicationConstants.quitCommunicationButtonSelector).click();
	}

	public void editCommunicationButton() {
		driver.findElement(CommunicationConstants.editCommunicationButtonSelector).click();
	}

	public void returnCommunicationButton() {
		driver.findElement(CommunicationConstants.returnCommunicationButtonSelector).click();
	}

	public void editSaveCommunicationButton() {
		driver.findElement(CommunicationConstants.editSaveCommunicationButtonSelector).click();
	}

	public void editQuittCommunicationButton() {
		driver.findElement(CommunicationConstants.editQuitCommunicationButtonSelector).click();
	}

	public void addCommunicationButton() {
		driver.findElement(CommunicationConstants.addCommunicationButtonSelector).click();
	}

	public void showCommunicationButton() {
		basePage.selectFirstElement(CommunicationConstants.showCommunicationButtonSelector);
	}

	public void deleteCommunicationButton() {
		basePage.selectFirstElement(CommunicationConstants.deleteCommunicationButtonSelector);
	}


	public String buildPhoneNumber(String areaCode, String number) {
		StringBuilder sb = new StringBuilder();
		return sb.append("+49 ").append(areaCode).append("-").append(number).toString();
	}
}
