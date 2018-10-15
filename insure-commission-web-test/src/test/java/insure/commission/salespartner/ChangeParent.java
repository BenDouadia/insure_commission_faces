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

public class ChangeParent {
	WebDriver driver;
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public ChangeParent() {
		this.driver = Hook.getDriver();
		salespartnerModel = SalespartnerConfiguration.editSalespartner();
		SalespartnerConfiguration.getInstance().setSalespartner(salespartnerModel);
	}

	@Given("^Ich rufe die Uebergeordneter-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Uebergeordneter_Bearbeiten_Maske_auf() throws Throwable {
		salespartnerMethods.changeParentButton();
	}

	@Given("^Ich aendere den Uebergeordneter und das Wirksamkeitsdatum$")
	public void ich_aendere_den_Uebergeordneter_und_das_Wirksamkeitsdatum() throws Throwable {
		salespartnerMethods.editParent();
	}

	@When("^Ich speichere die Aenderung fuer Uebergeordneter$")
	public void ich_speichere_die_Aenderung_fuer_Uebergeordneter() throws Throwable {
		salespartnerMethods.editSaveParentButtonSelector();
	}

	@Then("^Der Uebergeordneter ist gewechselt$")
	public void der_Uebergeordneter_ist_gewechselt() throws Throwable {
		salespartnerMethods.returnButton();
		masterdataMethods.searchMasterdataButton();
	}

}
