package insure.commission.salespartner;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.salespartner.control.SalespartnerConstants;
import insure.commission.salespartner.control.SalespartnerMethods;
import insure.commission.salespartner.entity.SalespartnerModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class ReactiveSalespartner {
	WebDriver driver;
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public ReactiveSalespartner() {
		this.driver = Hook.getDriver();
	}

	@Given("^Ich rufe Die Reaktivierung-Maske auf$")
	public void ich_rufe_Die_Reaktivierung_Maske_auf() throws Throwable {
		salespartnerMethods.contractReactiviteButton();
	}

	@Given("^Ich gebe das Wirksamkeitsdatum ein$")
	public void ich_gebe_das_Wirksamkeitsdatum_ein() throws Throwable {
		driver.findElement(SalespartnerConstants.inputDateOfReactivationSelector).clear();
		driver.findElement(SalespartnerConstants.inputDateOfReactivationSelector).sendKeys(basePage.getCurrentDate());
	}

	@When("^Ich speichere die Reaktivierung$")
	public void ich_speichere_die_Reaktivierung() throws Throwable {
		salespartnerMethods.saveContractReactivationButton();
	}

	@Then("^Der Vertriebsmitarbeiter ist reaktiviert$")
	public void der_Vertriebsmitarbeiter_ist_reaktiviert() throws Throwable {
		salespartnerMethods.returnButton();
		assertTrue(true);
		masterdataMethods.searchMasterdataButton();
	}
}
