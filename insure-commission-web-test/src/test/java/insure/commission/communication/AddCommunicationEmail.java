package insure.commission.communication;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import insure.commission.communication.control.CommunicationConfiguration;
import insure.commission.communication.control.CommunicationConstants;
import insure.commission.communication.control.CommunicationMethods;
import insure.commission.communication.entity.CommunicationModel;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddCommunicationEmail{
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	SearchMethods searchMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddCommunicationEmail() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		communicationModel = CommunicationConfiguration.buildCommunicationEmail();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich fuelle die Pflichfelder fuer Kommunikation-E-Mail aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Kommunikation_E_Mail_aus() throws Throwable {
		communicationMethods.initializeCommunicationEmail();
	}

	@Then("^Die angelegte Daten fuer Kommunikation-E-Mail sind vorhanden$")
	public void die_angelegte_Daten_fuer_Kommunikation_E_Mail_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(), CommunicationConstants.outputCommunicationChannelEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getCommunicationType(),
				CommunicationConstants.outputCommunicationTypeEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.geteMail(), CommunicationConstants.outputEmailAddressEmailSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNoteEmailSelector));
		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege eine Kommunikation-E-Mail an$")
	public void ich_lege_eine_Kommunikation_E_Mail_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		communicationMethods.addCommunicationButton();
		communicationMethods.initializeCommunicationEmail();
		communicationMethods.saveCommunicationButton();
		communicationMethods.saveCommunicationButton();
	}
}
