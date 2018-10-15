package insure.commission.costCenter;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.costCenter.control.CostCenterConfiguration;
import insure.commission.costCenter.control.CostCenterConstants;
import insure.commission.costCenter.entity.CostCenterModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;
import insure.commission.costCenter.control.CostCenterMethods;

public class EditCostCenter {
	WebDriver driver;
	BasePage basePage = new BasePage();
	CostCenterModel costCenterModel = new CostCenterModel();
	CostCenterMethods costCenterMethods = new CostCenterMethods();


	public EditCostCenter() {
		this.driver = Hook.getDriver();
		costCenterModel = CostCenterConfiguration.editCostCenter();
		CostCenterConfiguration.getInstance().setCostCenter(costCenterModel);
	}

	@Given("^Ich suche nach Kostenstelle$")
	public void ich_suche_nach_Kostenstelle() throws Throwable {
		costCenterMethods.searchCostCenterNumber(costCenterModel.getNumber());
	}

	@Given("^Ich rufe die Kostenstelle-Detailansicht auf$")
	public void ich_rufe_die_Kostenstelle_Detailansicht_auf() throws Throwable {
		basePage.selectFirstElement(CostCenterConstants.showButtonSelector);
	}

	@Given("^Ich rufe die Kostenstelle-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Kostenstelle_Bearbeiten_Maske_auf() throws Throwable {
		costCenterMethods.clickEditCostCenterButton();;
	}

	@Given("^Ich aendere die Kostenstelle$")
	public void ich_aendere_die_Kostenstelle() throws Throwable {
		costCenterMethods.editCostCenter();
	}

	@When("^Ich speichere die Aenderung fuer Kostenstelle$")
	public void ich_speichere_die_Aenderung_fuer_Kostenstelle() throws Throwable {
		costCenterMethods.clickEditSaveCostCenterButton();
	}

	@Then("^Die Aenderung fuer Kostenstelle ist gespeichert$")
	public void die_Aenderung_fuer_Kostenstelle_ist_gespeichert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(costCenterModel.getNumber(), CostCenterConstants.outputNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(costCenterModel.getName(), CostCenterConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(costCenterModel.getShortName(), CostCenterConstants.outputShortNameSelector));
		costCenterMethods.clickReturnCostCenterButton();
	}

}
