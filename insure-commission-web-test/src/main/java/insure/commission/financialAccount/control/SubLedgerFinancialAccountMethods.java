package insure.commission.financialAccount.control;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import insure.commission.financialAccount.entity.SubLedgerFinancialAccountModel;
import insure.commission.utility.Hook;

public class SubLedgerFinancialAccountMethods {
	WebDriver driver;
	SubLedgerFinancialAccountModel subLedgerFinancialAccountModel;

	public SubLedgerFinancialAccountMethods() {
		this.driver = Hook.getDriver();
		subLedgerFinancialAccountModel = SubLedgerFinancialAccountConfiguration.getInstance().getFinancialAccount();
	}

	public void initializeFinancialAccount() {
		try {

			driver.findElement(SubLedgerFinancialAccountConstants.inputAccountNumberSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.inputAccountNumberSelector).sendKeys(subLedgerFinancialAccountModel.getAccountNumber());

			driver.findElement(SubLedgerFinancialAccountConstants.inputNameSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.inputNameSelector).sendKeys(subLedgerFinancialAccountModel.getName());

			driver.findElement(SubLedgerFinancialAccountConstants.inputShortNameSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.inputShortNameSelector).sendKeys(subLedgerFinancialAccountModel.getShortName());

			selectDropdownByValue(subLedgerFinancialAccountModel.getStatus(), SubLedgerFinancialAccountConstants.inputStatusSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getImpact(), SubLedgerFinancialAccountConstants.inputImpactSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getAccountType(), SubLedgerFinancialAccountConstants.inputAccountTypeSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getTaxAllowance(), SubLedgerFinancialAccountConstants.inputTaxAllowanceSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getCashFlowDirection(), SubLedgerFinancialAccountConstants.inputCashFlowDirectionSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getPaymentType(), SubLedgerFinancialAccountConstants.inputPaymentTypeSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getPaymentMethod(), SubLedgerFinancialAccountConstants.inputPaymentMethodSelector);

			driver.findElement(SubLedgerFinancialAccountConstants.inputInitialValueSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.inputInitialValueSelector).sendKeys(subLedgerFinancialAccountModel.getInitialValue());

			driver.findElement(SubLedgerFinancialAccountConstants.inputNegativeValueAllowedButtonSelector).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editFinancialAccount() {
		try {

			driver.findElement(SubLedgerFinancialAccountConstants.editNameSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.editNameSelector).sendKeys(subLedgerFinancialAccountModel.getName());

			driver.findElement(SubLedgerFinancialAccountConstants.editShortNameSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.editShortNameSelector).sendKeys(subLedgerFinancialAccountModel.getShortName());

			selectDropdownByValue(subLedgerFinancialAccountModel.getStatus(), SubLedgerFinancialAccountConstants.editStatusSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getImpact(), SubLedgerFinancialAccountConstants.editImpactSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getAccountType(), SubLedgerFinancialAccountConstants.editAccountTypeSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getTaxAllowance(), SubLedgerFinancialAccountConstants.editTaxAllowanceSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getCashFlowDirection(), SubLedgerFinancialAccountConstants.editCashFlowDirectionSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getPaymentType(), SubLedgerFinancialAccountConstants.editPaymentTypeSelector);
			selectDropdownByValue(subLedgerFinancialAccountModel.getPaymentMethod(), SubLedgerFinancialAccountConstants.editPaymentMethodSelector);

			driver.findElement(SubLedgerFinancialAccountConstants.editInitialValueSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.editInitialValueSelector).sendKeys(subLedgerFinancialAccountModel.getInitialValue());

//			driver.findElement(negativeValueAllowedButtonSelector).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.subLedgerFinancialAccountButtonSelector).click();
	}

	public void clickAddFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.addButtonSelector).click();
	}

	public void clickInputSaveFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.inputSaveButtonSelector).click();
	}

	public void clickEditSaveFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.editSaveButtonSelector).click();
	}

	public void clickShowFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.showButtonSelector).click();
	}

	public void clickResetFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.resetButtonSelector).click();
	}

	public void clickDeleteFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.deleteButtonSelector).click();
	}

	public void clickSearchFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.searchButtonSelector).click();
	}

	public void clickLogoutFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.logoutButtonSelector).click();
	}

	public void clickReturnFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.returnButtonSelector).click();
	}

	public void clickQuitFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.inputQuitButtonSelector).click();
	}

	public void clickEditQuitFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.editQuitButtonSelector).click();
	}

	public void clickEditFinancialAccountButton() {
		driver.findElement(SubLedgerFinancialAccountConstants.editButtonSelector).click();
	}

	public void selectDropdownByValue(String value, By by) {
		try {
			WebElement selectElement = driver.findElement(by);
			Select dropdown = new Select(selectElement);
			dropdown.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean checkIfValuesAreEqual(Object value, By by) {
		try {
			Object element = driver.findElement(by).getText();
			if (element.equals(value.toString())) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static int randomNumber() {
		int random = (int) (Math.random() * 1000);
		return random;
	}

	public void searchAccountNumber(String accountNumber) {
		try {
			driver.findElement(SubLedgerFinancialAccountConstants.accountNumberSelector).clear();
			driver.findElement(SubLedgerFinancialAccountConstants.accountNumberSelector).sendKeys(accountNumber);

			clickSearchFinancialAccountButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFirstElement(By by) {
		try {
			List<WebElement> rows = driver.findElements(by);
			if (rows.size() > 0) {
				rows.get(0).click();
			} else {
				driver.findElement(by).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
