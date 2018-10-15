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

public class CreateLedgerFinancialAccount {
	WebDriver driver;
	BasePage basePage = new BasePage();
	LedgerFinancialAccountMethods ledgerFinancialAccountMethods = new LedgerFinancialAccountMethods();
	LedgerFinancialAccountModel ledgerFinancialAccountModel = new LedgerFinancialAccountModel();

	public CreateLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		ledgerFinancialAccountModel = LedgerFinancialAccountConfiguration.buildLedgerFinancialAccount();
		LedgerFinancialAccountConfiguration.getInstance().setLedgerFinancialAccount(ledgerFinancialAccountModel);
	}

	@Given("^Ich rufe die Hauptbuch-Ansicht auf$")
	public void ich_rufe_die_Hauptbuch_Ansicht_auf() throws Throwable {
		ledgerFinancialAccountMethods.clickLedgerFinancialAccountButton();
	}

	@Given("^Ich rufe die Hauptbuch-Anlage auf$")
	public void ich_rufe_die_Hauptbuch_Anlage_auf() throws Throwable {
		ledgerFinancialAccountMethods.clickAddLedgerFinancialAccountButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Hauptbuch aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Hauptbuch_aus() throws Throwable {
		ledgerFinancialAccountMethods.initializeLedgerFinancialAccount();
	}

	@When("^Ich speichere Hauptbuch$")
	public void ich_speichere_Hauptbuch() throws Throwable {
		ledgerFinancialAccountMethods.clickInputSaveLedgerFinancialAccountButton();
	}

	@Then("^Die angelegte Daten fuer Hauptbuch sind vorhanden$")
	public void die_angelegte_Daten_fuer_Hauptbuch_sind_vorhanden() throws Throwable {
		ledgerFinancialAccountMethods.searchLedgerFinancialAccountNumber(ledgerFinancialAccountModel.getAccountNumber());
		basePage.selectFirstElement(LedgerFinancialAccountConstants.showButtonSelector);

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

	@Given("^Ich lege ein Hauptbuch an$")
	public void ich_lege_ein_Hauptbuch_an() throws Throwable {
		ledgerFinancialAccountMethods.clickLedgerFinancialAccountButton();
		ledgerFinancialAccountMethods.clickAddLedgerFinancialAccountButton();
		ledgerFinancialAccountMethods.initializeLedgerFinancialAccount();
		ledgerFinancialAccountMethods.clickInputSaveLedgerFinancialAccountButton();
	}
}
