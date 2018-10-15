package insure.commission.salesChannel.bankAccount;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import insure.commission.salesChannel.control.BankAccountConfiguration;
import insure.commission.salesChannel.control.BankAccountConstants;
import insure.commission.salesChannel.control.BankAccountMethods;
import insure.commission.salesChannel.control.SalesChannelConfiguration;
import insure.commission.salesChannel.control.SalesChannelConstants;
import insure.commission.salesChannel.control.SalesChannelMethods;
import insure.commission.salesChannel.entity.BankAccountModel;
import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditCustomerBankAccount {

	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	BankAccountModel bankAccountModel = new BankAccountModel();
	BankAccountMethods bankAccountMethods = new BankAccountMethods();


	public EditCustomerBankAccount() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.buildSalesChannel();
		SalesChannelConfiguration.getInstance().setSalesChannel(salesChannelModel);
		bankAccountModel = BankAccountConfiguration.editBankAccount();
		BankAccountConfiguration.getInstance().setBankAccount(bankAccountModel);
	}
	@Given("^Ich aendere das Kundenkonto$")
	public void ich_aendere_das_Kundenkonto() throws Throwable {
		bankAccountMethods.initializeCustomerBankAccount();
	}

	@Then("^Die Aenderung fuer Kundenkonto ist gespeichert$")
	public void die_Aenderung_fuer_Kundenkonto_ist_gespeichert() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		basePage.selectFirstElement(SalesChannelConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getAccountOwner(), BankAccountConstants.outputCustomerAccountOwnerSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getMailRecipient(), BankAccountConstants.outputCustomerMailRecipientSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getMembershipReference(), BankAccountConstants.outputCustomerMembershipReferenceSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getBankName(), BankAccountConstants.outputCustomerBankNameSelector));
//		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getZipCode(), BankAccountConstants.outputCustomerZipCodeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getCity(), BankAccountConstants.outputCustomerCitySelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getBicSwift(), BankAccountConstants.outputCustomerBicSwiftSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getIban(), BankAccountConstants.outputCustomerIbanSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getCurrency(), BankAccountConstants.outputCustomerCurrencySelector));

		salesChannelMethods.clickReturnSalesChannelButton();
	}

}
