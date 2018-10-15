package insure.commission.financialAccount.ledger;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.financialAccount.control.LedgerFinancialAccountConfiguration;
import insure.commission.financialAccount.control.LedgerFinancialAccountConstants;
import insure.commission.financialAccount.control.LedgerFinancialAccountMethods;
import insure.commission.financialAccount.entity.LedgerFinancialAccountModel;
import insure.commission.utility.Hook;

public class DeleteLedgerFinancialAccount {
	WebDriver driver;
	LedgerFinancialAccountMethods ledgerFinancialAccountMethods = new LedgerFinancialAccountMethods();
	LedgerFinancialAccountModel ledgerFinancialAccountModel = new LedgerFinancialAccountModel();

	public DeleteLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		ledgerFinancialAccountModel = LedgerFinancialAccountConfiguration.getInstance().getLedgerFinancialAccount();
	}

	@When("^Ich loesche das Hauptbuch$")
	public void ich_loesche_das_Hauptbuch() throws Throwable {
		ledgerFinancialAccountMethods.clickDeleteLedgerFinancialAccountButton();
	}

	@Then("^Das Hauptbuch ist geloescht$")
	public void das_Hauptbuch_ist_geloescht() throws Throwable {
		ledgerFinancialAccountMethods.searchLedgerFinancialAccountNumber(ledgerFinancialAccountModel.getAccountNumber());
		assertEquals(0, driver.findElements(LedgerFinancialAccountConstants.deleteButtonSelector).size());
	}
}
