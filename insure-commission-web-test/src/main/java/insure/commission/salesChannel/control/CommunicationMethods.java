package insure.commission.salesChannel.control;

import org.openqa.selenium.WebDriver;

import insure.commission.salesChannel.entity.CommunicationModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class CommunicationMethods {
	WebDriver driver;
	BasePage basePage = new BasePage();
	CommunicationModel communicationModel = new CommunicationModel();

	public CommunicationMethods() {
		this.driver = Hook.getDriver();
		communicationModel = CommunicationConfiguration.getInstance().getCommunication();
	}

	public void initializeCommunication() {
		try {

			driver.findElement(CommunicationConstants.inputPhoneNumberSelector).clear();
			driver.findElement(CommunicationConstants.inputPhoneNumberSelector).sendKeys(communicationModel.getPhoneNumber());

			driver.findElement(CommunicationConstants.inputFaxSelector).clear();
			driver.findElement(CommunicationConstants.inputFaxSelector).sendKeys(communicationModel.getFax());

			driver.findElement(CommunicationConstants.inputEmailSelector).clear();
			driver.findElement(CommunicationConstants.inputEmailSelector).sendKeys(communicationModel.getEmail());

			driver.findElement(CommunicationConstants.inputWebsiteSelector).clear();
			driver.findElement(CommunicationConstants.inputWebsiteSelector).sendKeys(communicationModel.getWebsite());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
