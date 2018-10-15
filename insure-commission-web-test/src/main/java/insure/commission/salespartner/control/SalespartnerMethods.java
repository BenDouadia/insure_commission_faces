package insure.commission.salespartner.control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import insure.commission.salespartner.entity.SalespartnerModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class SalespartnerMethods {

	WebDriver driver;
	SalespartnerModel salespartnerModel = new SalespartnerModel();
	BasePage basePage = new BasePage();

	public SalespartnerMethods()
	{
		this.driver = Hook.getDriver();
		salespartnerModel = SalespartnerConfiguration.getInstance().getSalespartner();
	}

	public void initializeSalespartner() {
		try {
			driver.findElement(SalespartnerConstants.inputDateOfEntranceSelector).clear();
			driver.findElement(SalespartnerConstants.inputDateOfEntranceSelector).sendKeys(salespartnerModel.getDateOfEntrance());

			basePage.selectDropdownByValue(salespartnerModel.getSalesChannel(), SalespartnerConstants.inputSaleschannelSelector);
			basePage.selectDropdownByValue(salespartnerModel.getOrganizationRole(), SalespartnerConstants.inputOrganizationRoleSelector);
			basePage.selectDropdownByValue(salespartnerModel.getParentNumber() + "    " + salespartnerModel.getParentName(), SalespartnerConstants.inputParentSelector);
			basePage.selectDropdownByValue(salespartnerModel.getMainAccountNumber() + "    " + salespartnerModel.getMainAccountName(), SalespartnerConstants.inputMainAccountSelector);

			driver.findElement(SalespartnerConstants.inputSalespartnerNnumberSelector).clear();
			driver.findElement(SalespartnerConstants.inputSalespartnerNnumberSelector).sendKeys(""+ basePage.randomNumber());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editParent() {
		try {
			basePage.selectDropdownByValue(salespartnerModel.getParentNumber() + "    " + salespartnerModel.getParentName(), SalespartnerConstants.editParentSelector);

			driver.findElement(SalespartnerConstants.editParentDateOfEntranceSelector).clear();
			driver.findElement(SalespartnerConstants.editParentDateOfEntranceSelector).sendKeys(salespartnerModel.getDateOfEntrance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editAssignment() {
		try {
			basePage.selectDropdownByValue(salespartnerModel.getSalesChannel(), SalespartnerConstants.editSaleschannelSelector);
			basePage.selectDropdownByValue(salespartnerModel.getOrganizationRole(), SalespartnerConstants.editOrganizationRoleSelector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editMainAccount() {
		try {
			basePage.selectDropdownByValue(salespartnerModel.getMainAccountNumber() + "    " + salespartnerModel.getMainAccountName(), SalespartnerConstants.editMainAccountSelector);

			driver.findElement(SalespartnerConstants.editMainAccountDateOfEntranceSelector).clear();
			driver.findElement(SalespartnerConstants.editMainAccountDateOfEntranceSelector).sendKeys(salespartnerModel.getDateOfEntrance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addSalespartnerButton() {
		driver.findElement(SalespartnerConstants.addSalespartnerButtonSelector).click();
	}

	public void saveSalespartnerButton() {
		driver.findElement(SalespartnerConstants.saveSalespartnerButtonSelector).click();
	}

	public void quittSalespartnerButton() {
		driver.findElement(SalespartnerConstants.quitSalespartnerButtonSelector).click();
	}

	public void showParentsalespartnerButton() {
		driver.findElement(SalespartnerConstants.showParentSalespartnerButtonSelector).click();
	}

	public void changeParentButton() {
		driver.findElement(SalespartnerConstants.changeParentSalespartnerButtonSelector).click();
	}

	public void showAssignmentButton() {
		driver.findElement(SalespartnerConstants.showAssignmentButtonSelector).click();
	}

	public void changeAssignmentButton() {
		driver.findElement(SalespartnerConstants.changeAssignmentButtonSelector).click();
	}

	public void showStatusTimeButton() {
		driver.findElement(SalespartnerConstants.showStatusTimeButtonSelector).click();
	}

	public void showMainAccountButton() {
		driver.findElement(SalespartnerConstants.showMainAccountButtonSelector).click();
	}

	public void changeMainAccountButton() {
		driver.findElement(SalespartnerConstants.changeMainAccountButtonSelector).click();
	}

	public void returnButton() {
		driver.findElement(SalespartnerConstants.returnSalespartnerButtonSelector).click();
	}

	public void changeLogShowButton() {
		driver.findElement(SalespartnerConstants.changeLogShowButtonSelector).click();
	}

	public void externalSystemIdButton() {
		driver.findElement(SalespartnerConstants.externalSystemIdButtonSelector).click();
	}

	public void contractCancellationButton() {
		driver.findElement(SalespartnerConstants.contractCancellationButtonSelector).click();
	}

	public void contractReactiviteButton() {
		driver.findElement(SalespartnerConstants.contractReactiviteButtonSelector).click();
	}

	public void saveContractCancellationButton() {
		driver.findElement(SalespartnerConstants.saveContractCancellationButtonSelector).click();
	}

	public void quitContractCancellationButton() {
		driver.findElement(SalespartnerConstants.quitContractCancellationButtonSelector).click();
	}

	public void saveContractReactivationButton() {
		driver.findElement(SalespartnerConstants.saveContractReactivationButtonSelector).click();
	}

	public void quitContractReactivationButton() {
		driver.findElement(SalespartnerConstants.quitContractReactivationButtonSelector).click();
	}

	public void showSalespartnerButton() {
		driver.findElement(SalespartnerConstants.showsalespartnerButtonSelector).click();
	}

	public By getInputReasonOfTerminationSelector() {
		return SalespartnerConstants.inputReasonOfTerminationSelector;
	}

	public By getInputDateOfTerminationSelector() {
		return SalespartnerConstants.inputDateOfTerminationSelector;
	}

	public By getInputDateOfReactivationSelector() {
		return SalespartnerConstants.inputDateOfReactivationSelector;
	}

	public By editSaveParentButtonSelector() {
		return SalespartnerConstants.editSaveParentButtonSelector;
	}

	public By editQuitParentButtonSelector() {
		return SalespartnerConstants.editQuitParentButtonSelector;
	}

	public By editSaveAssignmentButtonSelector() {
		return SalespartnerConstants.editSaveAssignmentButtonSelector;
	}

	public By editQuitAssignmentButtonSelector() {
		return SalespartnerConstants.editQuitAssignmentButtonSelector;
	}

	public By editSaveMainAccountButtonSelector() {
		return SalespartnerConstants.editSaveMainAccountButtonSelector;
	}

	public By editQuitMainAccountButtonSelector() {
		return SalespartnerConstants.editQuitMainAccountButtonSelector;
	}
}
