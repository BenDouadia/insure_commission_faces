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
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;



public class AddCommunicationPhone {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	SearchMethods searchMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddCommunicationPhone() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		communicationModel = CommunicationConfiguration.buildCommunicationPhone();
		CommunicationConfiguration.getInstance().setCommunication(communicationModel);
	}

	@Given("^Ich rufe die Kommunikation-Anlage auf$")
	public void ich_rufe_die_Kommunikation_Anlage_auf() throws Throwable {
		communicationMethods.addCommunicationButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Kommunikation-Telefon aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Kommunikation_Telefon_aus() throws Throwable {
		communicationMethods.initializeCommunicationPhone();
	}

	@When("^Ich speichere Kommunikation$")
	public void ich_speichere_Kommunikation() throws Throwable {
		communicationMethods.saveCommunicationButton();
		communicationMethods.saveCommunicationButton();
	}

	@When("^Ich rufe die Kommunikation-Detailansicht auf$")
	public void ich_rufe_die_Kommunikation_Detailansicht_auf() throws Throwable {
		communicationMethods.showCommunicationButton();
	}

	@Then("^Die angelegte Daten fuer Kommunikation-Telefon sind vorhanden$")
	public void die_angelegte_Daten_fuer_Kommunikation_Telefon_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getChannel(), CommunicationConstants.outputCommunicationChannelPhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getCommunicationType(), CommunicationConstants.outputCommunicationTypePhoneSelector));
//		assertTrue(checkValue(communication.getPhoneType(), communication.getOutputPhoneTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getCountry(), CommunicationConstants.outputCountryPhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getAreaCode(), CommunicationConstants.outputAreaCodePhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNumber(), CommunicationConstants.outputNumberPhoneSelector));
//		assertTrue(checkValue(communication.getAdvertisement(), communication.getOutputAdvertisementSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getAdvertisingFrom(), CommunicationConstants.outputAdvertisingFromPhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getAdvertisingTo(), CommunicationConstants.outputAdvertisingToPhoneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(communicationModel.getNote(), CommunicationConstants.outputNotePhoneSelector));
		communicationMethods.returnCommunicationButton();
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege eine Kommunikation-Telefon an$")
	public void ich_lege_eine_Kommunikation_Telefon_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		communicationMethods.addCommunicationButton();
		communicationMethods.initializeCommunicationPhone();
		communicationMethods.saveCommunicationButton();
		communicationMethods.saveCommunicationButton();
	}
}
