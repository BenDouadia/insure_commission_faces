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

public class ChangeMainAccount {
	WebDriver driver;
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public ChangeMainAccount() {
		this.driver = Hook.getDriver();
		salespartnerModel = SalespartnerConfiguration.editSalespartner();
		SalespartnerConfiguration.getInstance().setSalespartner(salespartnerModel);
	}

	@Given("^Ich rufe die Hauptkonto-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Hauptkonto_Bearbeiten_Maske_auf() throws Throwable {
		salespartnerMethods.changeMainAccountButton();
	}

	@Given("^Ich aendere das Hauptkonto und das Wirksamkeitsdatum$")
	public void ich_aendere_das_Hauptkonto_und_das_Wirksamkeitsdatum() throws Throwable {
		salespartnerMethods.editMainAccount();
	}

	@When("^Ich speichere die Aenderung fuer Hauptkonto$")
	public void ich_speichere_die_Aenderung_fuer_Hauptkonto() throws Throwable {
		salespartnerMethods.editSaveMainAccountButtonSelector();
	}

	@Then("^Das Hauptkonto ist geaendert$")
	public void das_Hauptkonto_ist_geaendert() throws Throwable {
		salespartnerMethods.returnButton();
		masterdataMethods.searchMasterdataButton();
	}
}
