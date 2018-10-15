package insure.commission.personaldetail;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.personalDetail.control.PersonalDetailConfiguration;
import insure.commission.personalDetail.control.PersonalDetailConstants;
import insure.commission.personalDetail.control.PersonalDetailMethods;
import insure.commission.personalDetail.entity.PersonalDetailModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditPersonalDetail {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	PersonalDetailModel personalDetailModel = new PersonalDetailModel();
	PersonalDetailMethods personalDetailMethods = new PersonalDetailMethods();
	BasePage basePage = new BasePage();

	public EditPersonalDetail() {
		this.driver = Hook.getDriver();
		personalDetailModel = PersonalDetailConfiguration.editPersonalDetail();
		PersonalDetailConfiguration.getInstance().setPersonalDetail(personalDetailModel);
	}

	@Given("^Ich rufe die Personaldetail-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Personaldetail_Bearbeiten_Maske_auf() throws Throwable {
		personalDetailMethods.editPersonalDetailButton();
	}

	@Given("^Ich aendere das Personaldetail$")
	public void ich_aendere_das_Personaldetail() throws Throwable {
		personalDetailMethods.initializePersonalDetail();

	}

	@When("^Ich speichere die Aenderung fuer Personaldetail$")
	public void ich_speichere_die_Aenderung_fuer_Personaldetail() throws Throwable {
		personalDetailMethods.savePersonalDetailButton();
	}

	@Then("^Das Personaldetail ist geaendert$")
	public void das_Personaldetail_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getDateOfBirth(), PersonalDetailConstants.outputDateOfBirthSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getDateOfDeath(), PersonalDetailConstants.outputDateOfDeathSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getNameAtBirth(), PersonalDetailConstants.outputNameAtBirthSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getPlaceOfBirth(), PersonalDetailConstants.outputPlaceOfBirthSelector));
		assertTrue(basePage.checkIfValuesAreEqual(personalDetailModel.getMaritalStatus(), PersonalDetailConstants.outputMaritalStatusSelector));
		personalDetailMethods.masterdataButton();
		masterdataMethods.searchMasterdataButton();
	}
}
