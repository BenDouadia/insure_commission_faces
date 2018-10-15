package insure.commission.financialAccount.control;

import org.openqa.selenium.WebDriver;

import insure.commission.financialAccount.entity.LedgerFinancialAccountModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class LedgerFinancialAccountMethods {
	WebDriver driver;
	BasePage basePage = new BasePage();
	LedgerFinancialAccountModel ledgerFinancialAccountModel;

	public LedgerFinancialAccountMethods() {
		this.driver = Hook.getDriver();
		ledgerFinancialAccountModel = LedgerFinancialAccountConfiguration.getInstance().getLedgerFinancialAccount();
	}

	public void initializeLedgerFinancialAccount() {
		try {

			driver.findElement(LedgerFinancialAccountConstants.inputAccountNumberSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.inputAccountNumberSelector).sendKeys(ledgerFinancialAccountModel.getAccountNumber());

			driver.findElement(LedgerFinancialAccountConstants.inputNameSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.inputNameSelector).sendKeys(ledgerFinancialAccountModel.getName());

			driver.findElement(LedgerFinancialAccountConstants.inputShortNameSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.inputShortNameSelector).sendKeys(ledgerFinancialAccountModel.getShortName());

			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getStatus(), LedgerFinancialAccountConstants.inputStatusSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getImpact(), LedgerFinancialAccountConstants.inputImpactSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getAccountType(), LedgerFinancialAccountConstants.inputAccountTypeSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getTaxAllowance(), LedgerFinancialAccountConstants.inputTaxAllowanceSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getCashFlowDirection(), LedgerFinancialAccountConstants.inputCashFlowDirectionSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getPaymentType(), LedgerFinancialAccountConstants.inputPaymentTypeSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getPaymentMethod(), LedgerFinancialAccountConstants.inputPaymentMethodSelector);

			driver.findElement(LedgerFinancialAccountConstants.inputInitialValueSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.inputInitialValueSelector).sendKeys(ledgerFinancialAccountModel.getInitialValue());

			driver.findElement(LedgerFinancialAccountConstants.negativeValueAllowedButtonSelector).click();
			driver.findElement(LedgerFinancialAccountConstants.exportableButtonSelector).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editLedgerFinancialAccount() {
		try {

			driver.findElement(LedgerFinancialAccountConstants.editNameSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.editNameSelector).sendKeys(ledgerFinancialAccountModel.getName());

			driver.findElement(LedgerFinancialAccountConstants.editShortNameSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.editShortNameSelector).sendKeys(ledgerFinancialAccountModel.getShortName());

			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getStatus(), LedgerFinancialAccountConstants.editStatusSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getImpact(), LedgerFinancialAccountConstants.editImpactSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getAccountType(), LedgerFinancialAccountConstants.editAccountTypeSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getTaxAllowance(), LedgerFinancialAccountConstants.editTaxAllowanceSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getCashFlowDirection(), LedgerFinancialAccountConstants.editCashFlowDirectionSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getPaymentType(), LedgerFinancialAccountConstants.editPaymentTypeSelector);
			basePage.selectDropdownByValue(ledgerFinancialAccountModel.getPaymentMethod(), LedgerFinancialAccountConstants.editPaymentMethodSelector);

			driver.findElement(LedgerFinancialAccountConstants.editInitialValueSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.editInitialValueSelector).sendKeys(ledgerFinancialAccountModel.getInitialValue());

//			driver.findElement(negativeValueAllowedButtonSelector).click();
//			driver.findElement(exportableButtonSelector).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.ledgerFinancialAccountButtonSelector).click();
	}

	public void clickAddLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.addButtonSelector).click();
	}

	public void clickInputSaveLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.inputSaveButtonSelector).click();
	}

	public void clickEditSaveLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.editSaveButtonSelector).click();
	}

	public void clickShowLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.showButtonSelector).click();
	}

	public void clickResetLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.resetButtonSelector).click();
	}

	public void clickDeleteLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.deleteButtonSelector).click();
	}

	public void clickSearchLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.searchButtonSelector).click();
	}

	public void clickLogoutLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.logoutButtonSelector).click();
	}

	public void clickReturnLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.returnButtonSelector).click();
	}

	public void clickQuitLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.inputQuitButtonSelector).click();
	}

	public void clickEditQuitLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.editQuitButtonSelector).click();
	}

	public void clickEditLedgerFinancialAccountButton() {
		driver.findElement(LedgerFinancialAccountConstants.editButtonSelector).click();
	}

	public void searchLedgerFinancialAccountNumber(String number) {
		try {
			driver.findElement(LedgerFinancialAccountConstants.accountNumberSelector).clear();
			driver.findElement(LedgerFinancialAccountConstants.accountNumberSelector).sendKeys(number);

			clickSearchLedgerFinancialAccountButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
