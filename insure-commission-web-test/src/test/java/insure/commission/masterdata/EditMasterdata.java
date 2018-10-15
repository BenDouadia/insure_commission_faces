package insure.commission.masterdata;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataConstants;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditMasterdata {

	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public EditMasterdata() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.editMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
	}

	@Given("^Ich rufe die Stammdaten-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Stammdaten_Bearbeiten_Maske_auf() throws Throwable {
		masterdataMethods.clickEditButton();
	}

	@Given("^Ich aendere die Stammdaten$")
	public void ich_aendere_die_Stammdaten() throws Throwable {
		masterdataMethods.editMasterdata();
	}

	@When("^Ich speichere die Aenderung fuer Stammdaten$")
	public void ich_speichere_die_Aenderung_fuer_Stammdaten() throws Throwable {
		masterdataMethods.editSaveMasterdataButton();
	}

	@Then("^Die Aenderung fuer Stammdaten ist gespeichert$")
	public void die_Aenderung_fuer_Stammdaten_ist_gespeichert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getGender().toString(), MasterdataConstants.outputGenderSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getTitle(), MasterdataConstants.outputTitelSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getName(), MasterdataConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getFirstName(), MasterdataConstants.outputFirstNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getAdditionalNameOne(), MasterdataConstants.outputAdditionalNameOneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getAdditionalNameTwo(), MasterdataConstants.outputAdditionalNameTwoSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getNationality(), MasterdataConstants.outputNationalitySelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getLanguage(), MasterdataConstants.outputLanguageSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getCategory(), MasterdataConstants.outputCategorySelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getCommentOne(), MasterdataConstants.outputCommentOneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getCommentTwo(), MasterdataConstants.outputCommentTwoSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getPersonalSalutation(), MasterdataConstants.outputPersonalSalutationSelector));
		masterdataMethods.searchMasterdataButton();
	}

}
