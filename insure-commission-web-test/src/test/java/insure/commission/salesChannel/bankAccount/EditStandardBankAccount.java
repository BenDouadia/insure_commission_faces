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

public class EditStandardBankAccount {
	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	BankAccountModel bankAccountModel = new BankAccountModel();
	BankAccountMethods bankAccountMethods = new BankAccountMethods();


	public EditStandardBankAccount() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.buildSalesChannel();
		SalesChannelConfiguration.getInstance().setSalesChannel(salesChannelModel);
		bankAccountModel = BankAccountConfiguration.editBankAccount();
		BankAccountConfiguration.getInstance().setBankAccount(bankAccountModel);
	}

	@Given("^Ich aendere das Standardkonto$")
	public void ich_aendere_das_Standardkonto() throws Throwable {
		bankAccountMethods.initializeStandardBankAccount();
	}

	@Then("^Die Aenderung fuer Standardkonto ist gespeichert$")
	public void die_Aenderung_fuer_Standardkonto_ist_gespeichert() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		basePage.selectFirstElement(SalesChannelConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getAccountOwner(), BankAccountConstants.outputStandardAccountOwnerSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getMailRecipient(), BankAccountConstants.outputStandardMailRecipientSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getMembershipReference(), BankAccountConstants.outputStandardMembershipReferenceSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getBankName(), BankAccountConstants.outputStandardBankNameSelector));
//		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getZipCode(), BankAccountConstants.outputStandardZipCodeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getCity(), BankAccountConstants.outputStandardCitySelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getBicSwift(), BankAccountConstants.outputStandardBicSwiftSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getIban(), BankAccountConstants.outputStandardIbanSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getCurrency(), BankAccountConstants.outputStandardCurrencySelector));

		salesChannelMethods.clickReturnSalesChannelButton();
	}
}
