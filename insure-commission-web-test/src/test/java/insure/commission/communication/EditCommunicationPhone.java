package insure.commission.communication;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.communication.control.CommunicationConfiguration;
import insure.commission.communication.control.CommunicationConstants;
import insure.commission.communication.control.CommunicationMethods;
import insure.commission.communication.entity.CommunicationModel;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditCommunicationPhone {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	BasePage basePage = new BasePage();

	public EditCommunicationPhone() {
		this.driver = Hook.getDriver();
		communicationModel = CommunicationConfiguration.editCommunicationPhone();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich rufe die Kommunikation-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Kommunikation_Bearbeiten_Maske_auf() throws Throwable {
		communicationMethods.editCommunicationButton();
	}

	@Given("^Ich aendere die Kommunikation-Telefon$")
	public void ich_aendere_die_Kommunikation_Telefon() throws Throwable {
		communicationMethods.editCommunicationPhone();
	}

	@When("^Ich speichere die Aenderung fuer Kommunikation$")
	public void ich_speichere_die_Aenderung_fuer_Kommunikation() throws Throwable {
		communicationMethods.editSaveCommunicationButton();
	}

	@Then("^Die Kommunikation-Telefon ist geaendert$")
	public void die_Kommunikation_Telefon_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(), CommunicationConstants.outputCommunicationChannelPhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getCommunicationType(), CommunicationConstants.outputCommunicationTypePhoneSelector));
//		assertTrue(checkValue(communication.getPhoneType(), communication.getOutputPhoneTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getCountry(), CommunicationConstants.outputCountryPhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getAreaCode(), CommunicationConstants.outputAreaCodePhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNumber(), CommunicationConstants.outputNumberPhoneSelector));
//		assertTrue(checkValue(communication.getAdvertisement(), communication.getOutputAdvertisementSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNotePhoneSelector));
		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}
}
