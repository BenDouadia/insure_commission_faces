package insure.commission.costCenter.control;

import org.openqa.selenium.WebDriver;

import insure.commission.costCenter.control.CostCenterConfiguration;
import insure.commission.costCenter.control.CostCenterConstants;
import insure.commission.costCenter.entity.CostCenterModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class CostCenterMethods {
	WebDriver driver;
	BasePage basePage = new BasePage();
	CostCenterModel costCenterModel;

	public CostCenterMethods() {
		this.driver = Hook.getDriver();
		costCenterModel = CostCenterConfiguration.getInstance().getCostCenter();
	}

	public void initializeCostCenter() {
		try {

			driver.findElement(CostCenterConstants.inputNumberSelector).clear();
			driver.findElement(CostCenterConstants.inputNumberSelector).sendKeys(costCenterModel.getNumber());

			driver.findElement(CostCenterConstants.inputNameSelector).clear();
			driver.findElement(CostCenterConstants.inputNameSelector).sendKeys(costCenterModel.getName());

			driver.findElement(CostCenterConstants.inputShortNameSelector).clear();
			driver.findElement(CostCenterConstants.inputShortNameSelector).sendKeys(costCenterModel.getShortName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editCostCenter() {
		try {

			driver.findElement(CostCenterConstants.editNameSelector).clear();
			driver.findElement(CostCenterConstants.editNameSelector).sendKeys(costCenterModel.getName());

			driver.findElement(CostCenterConstants.editShortNameSelector).clear();
			driver.findElement(CostCenterConstants.editShortNameSelector).sendKeys(costCenterModel.getShortName());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickCostCenterButton() {
		driver.findElement(CostCenterConstants.costCenterButtonSelector).click();
	}

	public void clickAddCostCenterButton() {
		driver.findElement(CostCenterConstants.addButtonSelector).click();
	}

	public void clickInputSaveCostCenterButton() {
		driver.findElement(CostCenterConstants.inputSaveButtonSelector).click();
	}

	public void clickEditSaveCostCenterButton() {
		driver.findElement(CostCenterConstants.editSaveButtonSelector).click();
	}

	public void clickShowCostCenterButton() {
		driver.findElement(CostCenterConstants.showButtonSelector).click();
	}

	public void clickResetCostCenterButton() {
		driver.findElement(CostCenterConstants.resetButtonSelector).click();
	}

	public void clickDeleteCostCenterButton() {
		driver.findElement(CostCenterConstants.deleteButtonSelector).click();
	}

	public void clickSearchCostCenterButton() {
		driver.findElement(CostCenterConstants.searchButtonSelector).click();
	}

	public void clickLogoutCostCenterButton() {
		driver.findElement(CostCenterConstants.logoutButtonSelector).click();
	}

	public void clickReturnCostCenterButton() {
		driver.findElement(CostCenterConstants.returnButtonSelector).click();
	}

	public void clickQuitCostCenterButton() {
		driver.findElement(CostCenterConstants.inputQuitButtonSelector).click();
	}

	public void clickEditQuitCostCenterButton() {
		driver.findElement(CostCenterConstants.editQuitButtonSelector).click();
	}

	public void clickEditCostCenterButton() {
		driver.findElement(CostCenterConstants.editButtonSelector).click();
	}

	public void searchCostCenterNumber(String number) {
		try {
			driver.findElement(CostCenterConstants.numberSelector).clear();
			driver.findElement(CostCenterConstants.numberSelector).sendKeys(number);

			clickSearchCostCenterButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
