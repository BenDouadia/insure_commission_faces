package insure.commission.masterdata;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchConstants;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataConstants;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class SearchMasterdata  {

	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();
	SearchMethods searchMethods = new SearchMethods();

	public SearchMasterdata() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
	}

	@When("^Ich suche nach Stammdaten$")
	public void ich_suche_nach_Stammdaten() throws Throwable {
		searchMethods.searchMasterdataId(masterdataModel.getId());
	}

	@Then("^Der Stammdatensatz ist vorhanden$")
	public void der_Stammdatensatz_ist_vorhanden() throws Throwable {
		basePage.selectFirstElement(SearchConstants.showMasterdataSelector);
		assertTrue(basePage.checkIfValuesAreEqual(masterdataModel.getId(), MasterdataConstants.outputIdSelector));
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege einen Stammdatensatz an$")
	public void ich_lege_einen_Stammdatensatz_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		masterdataModel.setId(driver.findElement(MasterdataConstants.outputIdSelector).getText());
		masterdataMethods.searchMasterdataButton();
	}
}
