package insure.commission.financialAccountingTemplate.control;

import org.openqa.selenium.WebDriver;

import insure.commission.financialAccountingTemplate.entity.FinancialAccountingTemplateModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class FinancialAccountingTemplateMethods {
	WebDriver driver;
	BasePage basePage = new BasePage();
	FinancialAccountingTemplateModel financialAccountingModel;

	public FinancialAccountingTemplateMethods() {
		this.driver = Hook.getDriver();
		financialAccountingModel = FinancialAccountingTemplateConfiguration.getInstance().getFinancialAccountingTemplate();
	}

	public void initializeFinancialAccounting() {
		try {
			basePage.selectDropdownByValue(financialAccountingModel.getBookingType(), FinancialAccountingTemplateConstants.inputBookingTypeSelector);

			driver.findElement(FinancialAccountingTemplateConstants.inputNameSelector).clear();
			driver.findElement(FinancialAccountingTemplateConstants.inputNameSelector).sendKeys(financialAccountingModel.getName());

			driver.findElement(FinancialAccountingTemplateConstants.inputValueSelector).clear();
			driver.findElement(FinancialAccountingTemplateConstants.inputValueSelector).sendKeys(financialAccountingModel.getValue());

			basePage.selectDropdownByValue(financialAccountingModel.getCalculation(), FinancialAccountingTemplateConstants.inputCalculationSelector);
			basePage.selectDropdownByValue(financialAccountingModel.getRepeat(), FinancialAccountingTemplateConstants.inputRepeatSelector);

			driver.findElement(FinancialAccountingTemplateConstants.inputRepeatCountSelector).clear();
			driver.findElement(FinancialAccountingTemplateConstants.inputRepeatCountSelector).sendKeys(financialAccountingModel.getRepeatCount());

			basePage.selectDropdownByValue(financialAccountingModel.getAccount(), FinancialAccountingTemplateConstants.inputAccountSelector);
			basePage.selectDropdownByValue(financialAccountingModel.getOffsettingAccount(), FinancialAccountingTemplateConstants.inputOffsettingAccountSelector);
			basePage.selectDropdownByValue(financialAccountingModel.getCostCenter(), FinancialAccountingTemplateConstants.inputCostCenterSelector);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editFinancialAccounting() {
		try {
			basePage.selectDropdownByValue(financialAccountingModel.getBookingType(), FinancialAccountingTemplateConstants.editBookingTypeSelector);

//			driver.findElement(FinancialAccountingTemplateConstants.editNameSelector).clear();
//			driver.findElement(FinancialAccountingTemplateConstants.editNameSelector).sendKeys(financialAccountingModel.getName());

			driver.findElement(FinancialAccountingTemplateConstants.editValueSelector).clear();
			driver.findElement(FinancialAccountingTemplateConstants.editValueSelector).sendKeys(financialAccountingModel.getValue());

			basePage.selectDropdownByValue(financialAccountingModel.getCalculation(), FinancialAccountingTemplateConstants.editCalculationSelector);
			basePage.selectDropdownByValue(financialAccountingModel.getRepeat(), FinancialAccountingTemplateConstants.editRepeatSelector);

			driver.findElement(FinancialAccountingTemplateConstants.editRepeatCountSelector).clear();
			driver.findElement(FinancialAccountingTemplateConstants.editRepeatCountSelector).sendKeys(financialAccountingModel.getRepeatCount());

			basePage.selectDropdownByValue(financialAccountingModel.getAccount(), FinancialAccountingTemplateConstants.editAccountSelector);
			basePage.selectDropdownByValue(financialAccountingModel.getOffsettingAccount(), FinancialAccountingTemplateConstants.editOffsettingAccountSelector);
			basePage.selectDropdownByValue(financialAccountingModel.getCostCenter(), FinancialAccountingTemplateConstants.editCostCenterSelector);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.financialAccountingButtonSelector).click();
	}

	public void clickAddFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.addButtonSelector).click();
	}

	public void clickInputSaveFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.inputSaveButtonSelector).click();
	}

	public void clickEditSaveFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.editSaveButtonSelector).click();
	}

	public void clickShowFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.showButtonSelector).click();
	}

	public void clickResetFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.resetButtonSelector).click();
	}

	public void clickDeleteFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.deleteButtonSelector).click();
	}

	public void clickSearchFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.searchButtonSelector).click();
	}

	public void clickLogoutFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.logoutButtonSelector).click();
	}

	public void clickReturnFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.returnButtonSelector).click();
	}

	public void clickQuitFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.inputQuitButtonSelector).click();
	}

	public void clickEditQuitFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.editQuitButtonSelector).click();
	}

	public void clickEditFinancialAccountingButton() {
		driver.findElement(FinancialAccountingTemplateConstants.editButtonSelector).click();
	}

	public void searchFinancialAccountingName(String name) {
		try {
			driver.findElement(FinancialAccountingTemplateConstants.searchNameSelector).clear();
			driver.findElement(FinancialAccountingTemplateConstants.searchNameSelector).sendKeys(name);

			clickSearchFinancialAccountingButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
