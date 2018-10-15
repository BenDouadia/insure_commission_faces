package insure.commission.financialAccount.ledger;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import insure.commission.financialAccount.control.LedgerFinancialAccountConfiguration;
import insure.commission.financialAccount.control.LedgerFinancialAccountConstants;
import insure.commission.financialAccount.control.LedgerFinancialAccountMethods;
import insure.commission.financialAccount.entity.LedgerFinancialAccountModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class SearchLedgerFinancialAccount {

	WebDriver driver;
	BasePage basePage = new BasePage();
	LedgerFinancialAccountMethods ledgerFinancialAccountMethods = new LedgerFinancialAccountMethods();
	LedgerFinancialAccountModel ledgerFinancialAccountModel = new LedgerFinancialAccountModel();

	public SearchLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		ledgerFinancialAccountModel = LedgerFinancialAccountConfiguration.getInstance().getLedgerFinancialAccount();
	}

	@Then("^Das Hauptbuch ist vorhanden$")
	public void das_Hauptbuch_ist_vorhanden() throws Throwable {
		basePage.selectFirstElement(LedgerFinancialAccountConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getAccountNumber(), LedgerFinancialAccountConstants.outputAccountNumberSelector));

		ledgerFinancialAccountMethods.clickReturnLedgerFinancialAccountButton();
	}

}
