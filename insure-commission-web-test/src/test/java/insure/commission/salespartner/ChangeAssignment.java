package insure.commission.salespartner;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.salespartner.control.SalespartnerConfiguration;
import insure.commission.salespartner.control.SalespartnerMethods;
import insure.commission.salespartner.entity.SalespartnerModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class ChangeAssignment {
	WebDriver driver;
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public ChangeAssignment() {
		this.driver = Hook.getDriver();
		salespartnerModel = SalespartnerConfiguration.editSalespartner();
		SalespartnerConfiguration.getInstance().setSalespartner(salespartnerModel);
	}

	@Given("^Ich rufe die Vertriebszuordnung-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Vertriebszuordnung_Bearbeiten_Maske_auf() throws Throwable {
		salespartnerMethods.changeAssignmentButton();
	}

	@Given("^Ich aendere der Vertriebskanal, Vertriebsrolle und das Wirksamkeitsdatum$")
	public void ich_aendere_der_Vertriebskanal_Vertriebsrolle_und_das_Wirksamkeitsdatum() throws Throwable {
		salespartnerMethods.editAssignment();
	}

	@When("^Ich speichere die Aenderung fuer Vertriebszuordnung$")
	public void ich_speichere_die_Aenderung_fuer_Vertriebszuordnung() throws Throwable {
		salespartnerMethods.editSaveAssignmentButtonSelector();
	}

	@Then("^Die Vertriebszuordnung ist geaendert$")
	public void die_Vertriebszuordnung_ist_geaendert() throws Throwable {
		salespartnerMethods.returnButton();
		masterdataMethods.searchMasterdataButton();
	}
}
