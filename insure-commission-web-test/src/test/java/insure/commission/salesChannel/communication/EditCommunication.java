package insure.commission.salesChannel.communication;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import insure.commission.salesChannel.control.CommunicationConfiguration;
import insure.commission.salesChannel.control.CommunicationConstants;
import insure.commission.salesChannel.control.CommunicationMethods;
import insure.commission.salesChannel.control.SalesChannelConfiguration;
import insure.commission.salesChannel.control.SalesChannelConstants;
import insure.commission.salesChannel.control.SalesChannelMethods;
import insure.commission.salesChannel.entity.CommunicationModel;
import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditCommunication {
	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();


	public EditCommunication() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.buildSalesChannel();
		SalesChannelConfiguration.getInstance().setSalesChannel(salesChannelModel);
		communicationModel = CommunicationConfiguration.editCommunication();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich aendere die Kommunikation$")
	public void ich_aendere_die_Kommunikation() throws Throwable {
		communicationMethods.initializeCommunication();
	}

	@Then("^Die Aenderung fuer Kommunikation ist gespeichert$")
	public void die_Aenderung_fuer_Kommunikation_ist_gespeichert() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		basePage.selectFirstElement(SalesChannelConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getPhoneNumber(), CommunicationConstants.outputPhoneNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getEmail(), CommunicationConstants.outputEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getFax(), CommunicationConstants.outputFaxSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getWebsite(), CommunicationConstants.outputWebsiteSelector));

		salesChannelMethods.clickReturnSalesChannelButton();
	}
}
