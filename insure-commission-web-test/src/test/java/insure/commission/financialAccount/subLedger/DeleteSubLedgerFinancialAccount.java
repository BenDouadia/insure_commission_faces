package insure.commission.financialAccount.subLedger;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.financialAccount.control.SubLedgerFinancialAccountConfiguration;
import insure.commission.financialAccount.control.SubLedgerFinancialAccountConstants;
import insure.commission.financialAccount.control.SubLedgerFinancialAccountMethods;
import insure.commission.financialAccount.entity.SubLedgerFinancialAccountModel;
import insure.commission.utility.Hook;

public class DeleteSubLedgerFinancialAccount {
	WebDriver driver;
	SubLedgerFinancialAccountMethods subLedgerFinancialAccountMethods = new SubLedgerFinancialAccountMethods();
	SubLedgerFinancialAccountModel subLedgerFinancialAccountModel = new SubLedgerFinancialAccountModel();

	public DeleteSubLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		subLedgerFinancialAccountModel = SubLedgerFinancialAccountConfiguration.getInstance().getFinancialAccount();
	}

	@When("^Ich loesche das Nebenbuch$")
	public void ich_loesche_das_Nebenbuch() throws Throwable {
		subLedgerFinancialAccountMethods.clickDeleteFinancialAccountButton();
	}

	@Then("^Das Nebenbuch ist geloescht$")
	public void das_Nebenbuch_ist_geloescht() throws Throwable {
		subLedgerFinancialAccountMethods.searchAccountNumber(subLedgerFinancialAccountModel.getAccountNumber());
		assertEquals(0, driver.findElements(SubLedgerFinancialAccountConstants.deleteButtonSelector).size());
	}
}
