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

public class AddCommunicationWebsite {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	SearchMethods searchMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddCommunicationWebsite() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		communicationModel = CommunicationConfiguration.buildCommunicationWebsite();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}


	@Given("^Ich fuelle die Pflichfelder fuer Kommunikation-Webseite aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Kommunikation_Webseite_aus() throws Throwable {
		communicationMethods.initializeCommunicationWebsite();
	}

	@Then("^Die angelegte Daten fuer Kommunikation-Webseite sind vorhanden$")
	public void die_angelegte_Daten_fuer_Kommunikation_Webseite_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel() ,CommunicationConstants.outputCommunicationChannelWebsiteSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getUrl(), CommunicationConstants.outputUrlWebsiteSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNoteWebsiteSelector));

		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege eine Kommunikation-Webseite an$")
	public void ich_lege_eine_Kommunikation_Webseite_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		communicationMethods.addCommunicationButton();
		communicationMethods.initializeCommunicationWebsite();
		communicationMethods.saveCommunicationButton();
		communicationMethods.saveCommunicationButton();
	}
}
