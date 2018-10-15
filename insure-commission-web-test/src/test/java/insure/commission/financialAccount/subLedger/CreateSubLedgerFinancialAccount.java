package insure.commission.financialAccount.subLedger;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.financialAccount.control.SubLedgerFinancialAccountConfiguration;
import insure.commission.financialAccount.control.SubLedgerFinancialAccountConstants;
import insure.commission.financialAccount.control.SubLedgerFinancialAccountMethods;
import insure.commission.financialAccount.entity.SubLedgerFinancialAccountModel;
import insure.commission.utility.Hook;

public class CreateSubLedgerFinancialAccount {
	WebDriver driver;
	SubLedgerFinancialAccountMethods subLedgerFinancialAccountMethods = new SubLedgerFinancialAccountMethods();
	SubLedgerFinancialAccountModel subLedgerFinancialAccountModel = new SubLedgerFinancialAccountModel();

	public CreateSubLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		subLedgerFinancialAccountModel = SubLedgerFinancialAccountConfiguration.buildFinancialAccount();
		SubLedgerFinancialAccountConfiguration.getInstance().setFinancialAccount(subLedgerFinancialAccountModel);
	}

	@Given("^Ich rufe die Nebenbuch-Ansicht auf$")
	public void ich_rufe_die_Nebenbuch_Ansicht_auf() {
		subLedgerFinancialAccountMethods.clickFinancialAccountButton();
	}

	@Given("^Ich rufe die Nebenbuch-Anlage auf$")
	public void ich_rufe_die_Nebenbuch_Anlage_auf() {
		subLedgerFinancialAccountMethods.clickAddFinancialAccountButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Nebenbuch aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Nebenbuch_aus() {
		subLedgerFinancialAccountMethods.initializeFinancialAccount();
	}

	@When("^Ich speichere Nebenbuch$")
	public void ich_speichere_Nebenbuch() {
		subLedgerFinancialAccountMethods.clickInputSaveFinancialAccountButton();
	}

	@Then("^Die angelegte Daten fuer Nebenbuch sind vorhanden$")
	public void die_angelegte_Daten_fuer_Nebenbuch_sind_vorhanden() {
		subLedgerFinancialAccountMethods.searchAccountNumber(subLedgerFinancialAccountModel.getAccountNumber());
		subLedgerFinancialAccountMethods.selectFirstElement(SubLedgerFinancialAccountConstants.showButtonSelector);

		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getAccountNumber(), SubLedgerFinancialAccountConstants.outputAccountNumberSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getName(), SubLedgerFinancialAccountConstants.outputNameSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getShortName(), SubLedgerFinancialAccountConstants.outputShortNameSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getStatus(), SubLedgerFinancialAccountConstants.outputStatusSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getImpact(), SubLedgerFinancialAccountConstants.outputImpactSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getAccountType(), SubLedgerFinancialAccountConstants.outputAccountTypeSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getTaxAllowance(), SubLedgerFinancialAccountConstants.outputTaxAllowanceSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getCashFlowDirection(), SubLedgerFinancialAccountConstants.outputCashFlowDirectionSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getPaymentType(), SubLedgerFinancialAccountConstants.outputPaymentTypeSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getPaymentMethod(), SubLedgerFinancialAccountConstants.outputPaymentMethodSelector));
		assertTrue(subLedgerFinancialAccountMethods.checkIfValuesAreEqual(subLedgerFinancialAccountModel.getInitialValue()+ ",00", SubLedgerFinancialAccountConstants.outputInitialValueSelector));

		subLedgerFinancialAccountMethods.clickReturnFinancialAccountButton();
	}

	@Given("^Ich lege ein Nebenbuch an$")
	public void ich_lege_ein_Nebenbuch_an() {
		subLedgerFinancialAccountMethods.clickFinancialAccountButton();
		subLedgerFinancialAccountMethods.clickAddFinancialAccountButton();
		subLedgerFinancialAccountMethods.initializeFinancialAccount();
		subLedgerFinancialAccountMethods.clickInputSaveFinancialAccountButton();
	}
}
