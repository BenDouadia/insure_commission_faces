package insure.commission.communication;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import insure.commission.communication.control.CommunicationConfiguration;
import insure.commission.communication.control.CommunicationConstants;
import insure.commission.communication.control.CommunicationMethods;
import insure.commission.communication.entity.CommunicationModel;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditCommunicationSocialNetwork {
	WebDriver driver;
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	BasePage basePage = new BasePage();

	public EditCommunicationSocialNetwork() {
		this.driver = Hook.getDriver();
		communicationModel = CommunicationConfiguration.editCommunicationSocialNetwork();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich aendere die Kommunikation-Soziale-Netzwerke$")
	public void ich_aendere_die_Kommunikation_Soziale_Netzwerke() throws Throwable {
		communicationMethods.editCommunicationSocialNetwork();
	}

	@Then("^Die Kommunikation-Soziale-Netzwerke ist geaendert$")
	public void die_Kommunikation_Soziale_Netzwerke_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(), CommunicationConstants.outputCommunicationChannelSocialNetworkSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getPlatform(), CommunicationConstants.outputPlatformSocialNetworkSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getAccount(), CommunicationConstants.outputAccountSocialNetworkSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNoteSocialNetworkSelector));
		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}

}
