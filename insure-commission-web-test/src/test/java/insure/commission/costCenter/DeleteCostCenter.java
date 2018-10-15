package insure.commission.costCenter;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.costCenter.control.CostCenterConfiguration;
import insure.commission.costCenter.control.CostCenterConstants;
import insure.commission.costCenter.entity.CostCenterModel;
import insure.commission.utility.Hook;
import insure.commission.costCenter.control.CostCenterMethods;

public class DeleteCostCenter {
	WebDriver driver;
	CostCenterMethods costCenterMethods = new CostCenterMethods();
	CostCenterModel costCenterModel = new CostCenterModel();

	public DeleteCostCenter() {
		this.driver = Hook.getDriver();
		costCenterModel = CostCenterConfiguration.getInstance().getCostCenter();
	}

	@When("^Ich loesche die Kostenstelle$")
	public void ich_loesche_die_Kostenstelle() throws Throwable {
		costCenterMethods.clickDeleteCostCenterButton();
	}

	@Then("^Die Kostenstelle ist geloescht$")
	public void die_Kostenstelle_ist_geloescht() throws Throwable {
		costCenterMethods.searchCostCenterNumber(costCenterModel.getNumber());
		assertEquals(0, driver.findElements(CostCenterConstants.deleteButtonSelector).size());
	}
}
