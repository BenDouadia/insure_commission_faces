package insure.commission.salesChannel.control;

import org.openqa.selenium.WebDriver;

import insure.commission.salesChannel.entity.BankAccountModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class BankAccountMethods {
	WebDriver driver;
	BasePage basePage = new BasePage();
	BankAccountModel bankAccountModel = new BankAccountModel();

	public BankAccountMethods() {
		this.driver = Hook.getDriver();
		bankAccountModel = BankAccountConfiguration.getInstance().getBankAccount();
	}

	public void initializeCustomerBankAccount() {
		try {

			driver.findElement(BankAccountConstants.inputCustomerAccountOwnerSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerAccountOwnerSelector).sendKeys(bankAccountModel.getAccountOwner());

			driver.findElement(BankAccountConstants.inputCustomerMailRecipientSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerMailRecipientSelector).sendKeys(bankAccountModel.getMailRecipient());

			driver.findElement(BankAccountConstants.inputCustomerMembershipReferenceSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerMembershipReferenceSelector).sendKeys(bankAccountModel.getMembershipReference());

			driver.findElement(BankAccountConstants.inputCustomerBankNameSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerBankNameSelector).sendKeys(bankAccountModel.getBankName());

			driver.findElement(BankAccountConstants.inputCustomerZipCodeSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerZipCodeSelector).sendKeys(bankAccountModel.getZipCode());

			driver.findElement(BankAccountConstants.inputCustomerCitySelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerCitySelector).sendKeys(bankAccountModel.getCity());

			driver.findElement(BankAccountConstants.inputCustomerBicSwiftSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerBicSwiftSelector).sendKeys(bankAccountModel.getBicSwift());

			driver.findElement(BankAccountConstants.inputCustomerIbanSelector).clear();
			driver.findElement(BankAccountConstants.inputCustomerIbanSelector).sendKeys(bankAccountModel.getIban());

			basePage.selectDropdownByValue(bankAccountModel.getCurrency(), BankAccountConstants.inputCustomerCurrencySelector);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializeStandardBankAccount() {
		try {

			driver.findElement(BankAccountConstants.inputStandardAccountOwnerSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardAccountOwnerSelector).sendKeys(bankAccountModel.getAccountOwner());

			driver.findElement(BankAccountConstants.inputStandardMailRecipientSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardMailRecipientSelector).sendKeys(bankAccountModel.getMailRecipient());

			driver.findElement(BankAccountConstants.inputStandardMembershipReferenceSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardMembershipReferenceSelector).sendKeys(bankAccountModel.getMembershipReference());

			driver.findElement(BankAccountConstants.inputStandardBankNameSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardBankNameSelector).sendKeys(bankAccountModel.getBankName());

			driver.findElement(BankAccountConstants.inputStandardZipCodeSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardZipCodeSelector).sendKeys(bankAccountModel.getZipCode());

			driver.findElement(BankAccountConstants.inputStandardCitySelector).clear();
			driver.findElement(BankAccountConstants.inputStandardCitySelector).sendKeys(bankAccountModel.getCity());

			driver.findElement(BankAccountConstants.inputStandardBicSwiftSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardBicSwiftSelector).sendKeys(bankAccountModel.getBicSwift());

			driver.findElement(BankAccountConstants.inputStandardIbanSelector).clear();
			driver.findElement(BankAccountConstants.inputStandardIbanSelector).sendKeys(bankAccountModel.getIban());

			basePage.selectDropdownByValue(bankAccountModel.getCurrency(), BankAccountConstants.inputStandardCurrencySelector);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initializeSalespartnerBankAccount() {
		try {

			driver.findElement(BankAccountConstants.inputSalespartnerAccountOwnerSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerAccountOwnerSelector).sendKeys(bankAccountModel.getAccountOwner());

			driver.findElement(BankAccountConstants.inputSalespartnerMailRecipientSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerMailRecipientSelector).sendKeys(bankAccountModel.getMailRecipient());

			driver.findElement(BankAccountConstants.inputSalespartnerMembershipReferenceSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerMembershipReferenceSelector).sendKeys(bankAccountModel.getMembershipReference());

			driver.findElement(BankAccountConstants.inputSalespartnerBankNameSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerBankNameSelector).sendKeys(bankAccountModel.getBankName());

			driver.findElement(BankAccountConstants.inputSalespartnerZipCodeSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerZipCodeSelector).sendKeys(bankAccountModel.getZipCode());

			driver.findElement(BankAccountConstants.inputSalespartnerCitySelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerCitySelector).sendKeys(bankAccountModel.getCity());

			driver.findElement(BankAccountConstants.inputSalespartnerBicSwiftSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerBicSwiftSelector).sendKeys(bankAccountModel.getBicSwift());

			driver.findElement(BankAccountConstants.inputSalespartnerIbanSelector).clear();
			driver.findElement(BankAccountConstants.inputSalespartnerIbanSelector).sendKeys(bankAccountModel.getIban());

			basePage.selectDropdownByValue(bankAccountModel.getCurrency(), BankAccountConstants.inputSalespartnerCurrencySelector);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
