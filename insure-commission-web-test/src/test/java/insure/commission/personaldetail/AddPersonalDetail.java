package insure.commission.personaldetail;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.personalDetail.control.PersonalDetailConfiguration;
import insure.commission.personalDetail.control.PersonalDetailConstants;
import insure.commission.personalDetail.control.PersonalDetailMethods;
import insure.commission.personalDetail.entity.PersonalDetailModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddPersonalDetail {
	WebDriver driver;
	SearchMethods searchMethods = new SearchMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	MasterdataModel masterdataModel = new MasterdataModel();
	PersonalDetailModel personalDetailModel = new PersonalDetailModel();
	PersonalDetailMethods personalDetailMethods = new PersonalDetailMethods();
	BasePage basePage = new BasePage();

	public AddPersonalDetail() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		personalDetailModel = PersonalDetailConfiguration.buildPersonalDetail();
		PersonalDetailConfiguration.getInstance().setPersonalDetail(personalDetailModel);
	}

	@Given("^Ich rufe die Personaldetail-Detailansicht auf$")
	public void ich_rufe_die_Personaldetail_Detailansicht_auf() throws Throwable {
		masterdataMethods.personalDetailButton();
	}

	@Given("^Ich rufe die Personaldetail-Anlage auf$")
	public void ich_rufe_die_Personaldetail_Anlage_auf() throws Throwable {
		personalDetailMethods.editPersonalDetailButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Personaldetail aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Personaldetail_aus() throws Throwable {
		personalDetailMethods.initializePersonalDetail();
	}

	@When("^Ich speichere Personaldetail$")
	public void ich_speichere_Personaldetail() throws Throwable {
		personalDetailMethods.savePersonalDetailButton();
	}

	@Then("^Die angelegte Daten fuer Personaldetail sind vorhanden$")
	public void die_angelegte_Daten_fuer_Personaldetail_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getDateOfBirth(), PersonalDetailConstants.outputDateOfBirthSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getDateOfDeath(), PersonalDetailConstants.outputDateOfDeathSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getNameAtBirth(), PersonalDetailConstants.outputNameAtBirthSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getPlaceOfBirth(), PersonalDetailConstants.outputPlaceOfBirthSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getMaritalStatus(), PersonalDetailConstants.outputMaritalStatusSelector));
		personalDetailMethods.masterdataButton();
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege einen Personaldetail an$")
	public void ich_lege_einen_Personaldetail_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		masterdataMethods.personalDetailButton();
		personalDetailMethods.editPersonalDetailButton();
		personalDetailMethods.initializePersonalDetail();
		personalDetailMethods.savePersonalDetailButton();
		personalDetailMethods.masterdataButton();
	}
}
