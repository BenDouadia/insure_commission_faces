package insure.commission.salespartner;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchConstants;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.salespartner.control.SalespartnerConfiguration;
import insure.commission.salespartner.control.SalespartnerConstants;
import insure.commission.salespartner.control.SalespartnerMethods;
import insure.commission.salespartner.entity.SalespartnerModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddSalespartner {

	WebDriver driver;
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	BasePage basePage = new BasePage();

	public AddSalespartner() {
		this.driver = Hook.getDriver();
		salespartnerModel = SalespartnerConfiguration.buildSalespartner();
		SalespartnerConfiguration.getInstance().setSalespartner(salespartnerModel);
	}

	@Given("^Ich rufe die Stammdaten-Detailansicht auf$")
	public void ich_rufe_die_Stammdaten_Detailansicht_auf() throws Throwable {
		basePage.selectFirstElement(SearchConstants.showMasterdataSelector);
	}

	@Given("^Ich rufe die Vertriebsmitarbeiter-Anlage auf$")
	public void ich_rufe_die_Vertriebsmitarbeiter_Anlage_auf() throws Throwable {
		salespartnerMethods.addSalespartnerButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Vertriebsmitarbeiter aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Vertriebsmitarbeiter_aus() throws Throwable {
		salespartnerMethods.initializeSalespartner();
	}

	@When("^Ich speichere Vertriebsmitarbeiter$")
	public void ich_speichere_Vertriebsmitarbeiter() throws Throwable {
		salespartnerMethods.saveSalespartnerButton();
		salespartnerMethods.saveSalespartnerButton();
	}

	@Then("^Die angelegte Daten fuer Vertriebsmitarbeiter sind vorhanden$")
	public void die_angelegte_Daten_fuer_Vertriebsmitarbeiter_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getParentNumber(), SalespartnerConstants.outputParentNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getParentName(), SalespartnerConstants.outputParentNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getParentFirstName(), SalespartnerConstants.outputParentFirstNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getSalesChannel(), SalespartnerConstants.outputSaleschannelSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getOrganizationRole(), SalespartnerConstants.outputOrganizationRoleSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getDateOfEntrance(), SalespartnerConstants.outputDateOfEntranceSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getMainAccountNumber(), SalespartnerConstants.outputMainAccountNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getMainAccountName(), SalespartnerConstants.outputMainAccountNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salespartnerModel.getMainAccountFirstName(), SalespartnerConstants.outputMainAccountFirstNameSelector));
		salespartnerMethods.returnButton();
		masterdataMethods.searchMasterdataButton();
	}

}
