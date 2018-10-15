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

public class EditSalespartnerBankAccount {
	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	BankAccountModel bankAccountModel = new BankAccountModel();
	BankAccountMethods bankAccountMethods = new BankAccountMethods();


	public EditSalespartnerBankAccount() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.buildSalesChannel();
		SalesChannelConfiguration.getInstance().setSalesChannel(salesChannelModel);
		bankAccountModel = BankAccountConfiguration.editBankAccount();
		BankAccountConfiguration.getInstance().setBankAccount(bankAccountModel);
	}

	@Given("^Ich aendere das Vermittlerkonto$")
	public void ich_aendere_das_Vermittlerkonto() throws Throwable {
		bankAccountMethods.initializeSalespartnerBankAccount();
	}

	@Then("^Die Aenderung fuer Vermittlerkonto ist gespeichert$")
	public void die_Aenderung_fuer_Vermittlerkonto_ist_gespeichert() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		basePage.selectFirstElement(SalesChannelConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getAccountOwner(), BankAccountConstants.outputSalespartnerAccountOwnerSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getMailRecipient(), BankAccountConstants.outputSalespartnerMailRecipientSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getMembershipReference(), BankAccountConstants.outputSalespartnerMembershipReferenceSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getBankName(), BankAccountConstants.outputSalespartnerBankNameSelector));
//		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getZipCode(), BankAccountConstants.outputSalespartnerZipCodeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getCity(), BankAccountConstants.outputSalespartnerCitySelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getBicSwift(), BankAccountConstants.outputSalespartnerBicSwiftSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getIban(), BankAccountConstants.outputSalespartnerIbanSelector));
		assertTrue(basePage.checkIfValuesAreEqual(bankAccountModel.getCurrency(), BankAccountConstants.outputSalespartnerCurrencySelector));

		salesChannelMethods.clickReturnSalesChannelButton();
	}
}
