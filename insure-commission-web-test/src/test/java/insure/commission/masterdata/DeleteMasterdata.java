package insure.commission.masterdata;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchConstants;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteMasterdata {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	BasePage basePage = new BasePage();
	SearchMethods searchMethods = new SearchMethods();

	public DeleteMasterdata() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.getInstance().getMasterdata();
	}

	@When("^Ich loesche den Stammdatensatz$")
	public void ich_loesche_den_Stammdatensatz() throws Throwable {
		searchMethods.deleteMasterdata(masterdataModel.getId());
	}

	@Then("^Der Stammdatensatz ist geloescht$")
	public void der_Stammdatensatz_ist_geloescht() throws Throwable {
		searchMethods.searchMasterdataId(masterdataModel.getId());
		assertEquals(0, driver.findElements(SearchConstants.showMasterdataSelector).size());
	}
}
