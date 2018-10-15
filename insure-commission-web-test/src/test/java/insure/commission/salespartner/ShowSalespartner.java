package insure.commission.salespartner;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.salespartner.control.SalespartnerConfiguration;
import insure.commission.salespartner.control.SalespartnerMethods;
import insure.commission.salespartner.entity.SalespartnerModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class ShowSalespartner {
	WebDriver driver;
	SearchMethods searchMethods = new SearchMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	MasterdataModel masterdataModel = new MasterdataModel();
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	BasePage basePage = new BasePage();

	public ShowSalespartner() {
		this.driver = Hook.getDriver();
		salespartnerModel = SalespartnerConfiguration.buildSalespartner();
		SalespartnerConfiguration.getInstance().setSalespartner(salespartnerModel);
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
	}

	@Given("^Ich lege einen Vertriebsmitarbeiter an$")
	public void ich_lege_einen_Vertriebsmitarbeiter_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		salespartnerMethods.addSalespartnerButton();
		salespartnerMethods.initializeSalespartner();
		salespartnerMethods.saveSalespartnerButton();
		salespartnerMethods.saveSalespartnerButton();
	}

	@When("^Ich rufe die Vertriebsmitarbeiter-Detailansicht auf$")
	public void ich_rufe_die_Vertriebsmitarbeiter_Detailansicht_auf() throws Throwable {
		salespartnerMethods.showSalespartnerButton();
	}

	@Then("^Die Vertriebsmitarbeiter-Detailansicht ist angezeigt$")
	public void die_Vertriebsmitarbeiter_Detailansicht_ist_angezeigt() throws Throwable {
		salespartnerMethods.returnButton();
		masterdataMethods.searchMasterdataButton();
	}
}
