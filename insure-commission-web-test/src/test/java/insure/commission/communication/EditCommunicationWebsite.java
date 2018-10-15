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

public class EditCommunicationWebsite {
	WebDriver driver;
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	BasePage basePage = new BasePage();

	public EditCommunicationWebsite() {
		this.driver = Hook.getDriver();
		communicationModel = CommunicationConfiguration.editCommunicationWebsite();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich aendere die Kommunikation-Webseite$")
	public void ich_aendere_die_Kommunikation_Webseite() throws Throwable {
		communicationMethods.editCommunicationWebsite();
	}

	@Then("^Die Kommunikation-Webseite ist geaendert$")
	public void die_Kommunikation_Webseite_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(), CommunicationConstants.outputCommunicationChannelWebsiteSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getUrl(), CommunicationConstants.outputUrlWebsiteSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNoteWebsiteSelector));

		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}

}
