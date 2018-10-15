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

public class DismissSalespartner {
	WebDriver driver;
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	SalespartnerMethods salespartnerMethods = new SalespartnerMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public DismissSalespartner() {
		this.driver = Hook.getDriver();
	}

	@Given("^Ich rufe die Kuendigung-Maske auf$")
	public void ich_rufe_die_Kuendigung_Maske_auf() throws Throwable {
		salespartnerMethods.contractCancellationButton();
	}

	@Given("^Ich gebe den Kuendigungsgrund und das Wirksamkeitsdatum ein$")
	public void ich_gebe_den_Kuendigungsgrund_und_das_Wirksamkeitsdatum_ein() throws Throwable {
		basePage.selectDropdownByValue("Inkompetenz", SalespartnerConstants.inputReasonOfTerminationSelector);

		driver.findElement(SalespartnerConstants.inputDateOfTerminationSelector).clear();
		driver.findElement(SalespartnerConstants.inputDateOfTerminationSelector).sendKeys(basePage.getCurrentDate());
	}

	@When("^Ich speichere die Kuendigung$")
	public void ich_speichere_die_Kuendigung() throws Throwable {
		salespartnerMethods.saveContractCancellationButton();
	}

	@Then("^Der Vertriebsmitarbeiter ist gekuendigt$")
	public void der_Vertriebsmitarbeiter_ist_gekuendigt() throws Throwable {
		salespartnerMethods.returnButton();
		assertTrue(true);
		masterdataMethods.searchMasterdataButton();
	}
}
