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
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditCommunicationEmail {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	BasePage basePage = new BasePage();

	public EditCommunicationEmail() {
		this.driver = Hook.getDriver();
		communicationModel = CommunicationConfiguration.buildCommunicationEmail();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}


	@Given("^Ich aendere die Kommunikation-E-Mail$")
	public void ich_aendere_die_Kommunikation_E_Mail() throws Throwable {
		communicationMethods.editCommunicationEmail();
	}

	@Then("^Die Kommunikation-E-Mail ist geaendert$")
	public void die_Kommunikation_E_Mail_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(), CommunicationConstants.outputCommunicationChannelEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getCommunicationType(),
				CommunicationConstants.outputCommunicationTypeEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.geteMail(), CommunicationConstants.outputEmailAddressEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNoteEmailSelector));
		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}
}
