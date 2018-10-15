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

public class AddCommunicationSocialNetwork {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	SearchMethods searchMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddCommunicationSocialNetwork() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		communicationModel = CommunicationConfiguration.buildCommunicationSocialNetwork();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich fuelle die Pflichfelder fuer Kommunikation-Soziale-Netzwerke aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Kommunikation_Soziale_Netzwerke_aus() throws Throwable {
		communicationMethods.initializeCommunicationSocialNetwork();
	}

	@Then("^Die angelegte Daten fuer Kommunikation-Soziale-Netzwerke sind vorhanden$")
	public void die_angelegte_Daten_fuer_Kommunikation_Soziale_Netzwerke_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(),
				CommunicationConstants.outputCommunicationChannelSocialNetworkSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getPlatform(),
				CommunicationConstants.outputPlatformSocialNetworkSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getAccount(),
				CommunicationConstants.outputAccountSocialNetworkSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(),
				CommunicationConstants.outputNoteSocialNetworkSelector));
		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege eine Kommunikation-Soziale-Netzwerke an$")
	public void ich_lege_eine_Kommunikation_Soziale_Netzwerke_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		communicationMethods.addCommunicationButton();
		communicationMethods.initializeCommunicationSocialNetwork();
		communicationMethods.saveCommunicationButton();
		communicationMethods.saveCommunicationButton();
	}

}
