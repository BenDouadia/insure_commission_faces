package insure.commission.financialAccount.ledger;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.financialAccount.control.LedgerFinancialAccountConfiguration;
import insure.commission.financialAccount.control.LedgerFinancialAccountConstants;
import insure.commission.financialAccount.control.LedgerFinancialAccountMethods;
import insure.commission.financialAccount.entity.LedgerFinancialAccountModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditLedgerFinancialAccount {
	WebDriver driver;
	BasePage basePage = new BasePage();
	LedgerFinancialAccountMethods ledgerFinancialAccountMethods = new LedgerFinancialAccountMethods();
	LedgerFinancialAccountModel ledgerFinancialAccountModel = new LedgerFinancialAccountModel();

	public EditLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		ledgerFinancialAccountModel = LedgerFinancialAccountConfiguration.editLedgerFinancialAccount();
		LedgerFinancialAccountConfiguration.getInstance().setLedgerFinancialAccount(ledgerFinancialAccountModel);
	}

	@Given("^Ich suche nach Hauptbuch$")
	public void ich_suche_nach_Hauptbuch() throws Throwable {
		ledgerFinancialAccountMethods.searchLedgerFinancialAccountNumber(ledgerFinancialAccountModel.getAccountNumber());
	}

	@Given("^Ich rufe die Hauptbuch-Detailansicht auf$")
	public void ich_rufe_die_Hauptbuch_Detailansicht_auf() throws Throwable {
		basePage.selectFirstElement(LedgerFinancialAccountConstants.showButtonSelector);
	}

	@Given("^Ich rufe die Hauptbuch-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Hauptbuch_Bearbeiten_Maske_auf() throws Throwable {
		ledgerFinancialAccountMethods.clickEditLedgerFinancialAccountButton();;
	}

	@Given("^Ich aendere das Hauptbuch$")
	public void ich_aendere_das_Hauptbuch() throws Throwable {
		ledgerFinancialAccountMethods.editLedgerFinancialAccount();
	}

	@When("^Ich speichere die Aenderung fuer Hauptbuch$")
	public void ich_speichere_die_Aenderung_fuer_Hauptbuch() throws Throwable {
		ledgerFinancialAccountMethods.clickEditSaveLedgerFinancialAccountButton();
	}

	@Then("^Die Aenderung fuer Hauptbuch ist gespeichert$")
	public void die_Aenderung_fuer_Hauptbuch_ist_gespeichert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getAccountNumber(), LedgerFinancialAccountConstants.outputAccountNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getName(), LedgerFinancialAccountConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getShortName(), LedgerFinancialAccountConstants.outputShortNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getStatus(), LedgerFinancialAccountConstants.outputStatusSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getImpact(), LedgerFinancialAccountConstants.outputImpactSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getAccountType(), LedgerFinancialAccountConstants.outputAccountTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getTaxAllowance(), LedgerFinancialAccountConstants.outputTaxAllowanceSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getCashFlowDirection(), LedgerFinancialAccountConstants.outputCashFlowDirectionSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getPaymentType(), LedgerFinancialAccountConstants.outputPaymentTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getPaymentMethod(), LedgerFinancialAccountConstants.outputPaymentMethodSelector));
		assertTrue(basePage.checkIfValuesAreEqual(ledgerFinancialAccountModel.getInitialValue()+ ",00", LedgerFinancialAccountConstants.outputInitialValueSelector));

		ledgerFinancialAccountMethods.clickReturnLedgerFinancialAccountButton();
	}

}
