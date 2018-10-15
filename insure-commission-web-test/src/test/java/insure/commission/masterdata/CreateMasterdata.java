package insure.commission.masterdata;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataConstants;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class CreateMasterdata {

	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	SearchMethods searchMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public CreateMasterdata() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
	}

	@Given("^Ich rufe die Stammdatensatz-Anlage auf$")
	public void ich_rufe_die_Stammdatensatz_Anlage_auf() throws Throwable {
		searchMethods.createMasterdataButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Stammdatensatz aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Stammdatensatz_aus() throws Throwable {
		masterdataMethods.initializeMasterdata();
	}

	@When("^Ich speichere Stammdaten$")
	public void ich_speichere_Stammdaten() throws Throwable {
		masterdataMethods.clickSaveButton();
		masterdataModel.setId(driver.findElement(MasterdataConstants.outputIdSelector).getText());
	}

	@Then("^Die angelegte Daten fuer Stammdaten sind vorhanden$")
	public void die_angelegte_Daten_fuer_Stammdaten_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getId(), MasterdataConstants.outputIdSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getType().toString(), MasterdataConstants.outputTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getGender().toString(), MasterdataConstants.outputGenderSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getTitle(), MasterdataConstants.outputTitelSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getName(), MasterdataConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getFirstName(), MasterdataConstants.outputFirstNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getAdditionalNameOne(), MasterdataConstants.outputAdditionalNameOneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getCategory(), MasterdataConstants.outputCategorySelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getCommentOne(), MasterdataConstants.outputCommentOneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getCommentTwo(), MasterdataConstants.outputCommentTwoSelector));
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getPersonalSalutation(), MasterdataConstants.outputPersonalSalutationSelector));
		masterdataMethods.searchMasterdataButton();
	}
}
