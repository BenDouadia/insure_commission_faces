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

public class CreateCostCenter {
	WebDriver driver;
	BasePage basePage = new BasePage();
	CostCenterMethods costCenterMethods = new CostCenterMethods();
	CostCenterModel costCenterModel = new CostCenterModel();

	public CreateCostCenter() {
		this.driver = Hook.getDriver();
		costCenterModel = CostCenterConfiguration.buildCostCenter();
		CostCenterConfiguration.getInstance().setCostCenter(costCenterModel);
	}

	@Given("^Ich rufe die Kostenstelle-Ansicht auf$")
	public void ich_rufe_die_Kostenstelle_Ansicht_auf() throws Throwable {
		costCenterMethods.clickCostCenterButton();
	}

	@Given("^Ich rufe die Kostenstelle-Anlage auf$")
	public void ich_rufe_die_Kostenstelle_Anlage_auf() throws Throwable {
		costCenterMethods.clickAddCostCenterButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Kostenstelle aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Kostenstelle_aus() throws Throwable {
		costCenterMethods.initializeCostCenter();
	}

	@When("^Ich speichere Kostenstelle$")
	public void ich_speichere_Kostenstelle() throws Throwable {
		costCenterMethods.clickInputSaveCostCenterButton();
	}

	@Then("^Die angelegte Daten fuer Kostenstelle sind vorhanden$")
	public void die_angelegte_Daten_fuer_Kostenstelle_sind_vorhanden() throws Throwable {
		costCenterMethods.searchCostCenterNumber(costCenterModel.getNumber());
		basePage.selectFirstElement(CostCenterConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(costCenterModel.getNumber(), CostCenterConstants.outputNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(costCenterModel.getName(), CostCenterConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(costCenterModel.getShortName(), CostCenterConstants.outputShortNameSelector));
		costCenterMethods.clickReturnCostCenterButton();
	}

	@Given("^Ich lege eine Kostenstelle an$")
	public void ich_lege_eine_Kostenstelle_an() throws Throwable {
		costCenterMethods.clickCostCenterButton();
		costCenterMethods.clickAddCostCenterButton();
		costCenterMethods.initializeCostCenter();
		costCenterMethods.clickInputSaveCostCenterButton();
	}
}
