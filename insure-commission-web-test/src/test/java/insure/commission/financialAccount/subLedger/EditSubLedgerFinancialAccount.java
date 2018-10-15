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

public class EditSubLedgerFinancialAccount {
	WebDriver driver;
	SubLedgerFinancialAccountMethods subLedgerFinancialAccountMethods = new SubLedgerFinancialAccountMethods();
	SubLedgerFinancialAccountModel subLedgerFinancialAccountModel = new SubLedgerFinancialAccountModel();

	public EditSubLedgerFinancialAccount() {
		this.driver = Hook.getDriver();
		subLedgerFinancialAccountModel = SubLedgerFinancialAccountConfiguration.editFinancialAccount();
		SubLedgerFinancialAccountConfiguration.getInstance().setFinancialAccount(subLedgerFinancialAccountModel);
	}

	@Given("^Ich suche nach Nebenbuch$")
	public void ich_suche_nach_Nebenbuch() throws Throwable {
		subLedgerFinancialAccountMethods.searchAccountNumber(subLedgerFinancialAccountModel.getAccountNumber());
	}

	@Given("^Ich rufe die Nebenbuch-Detailansicht auf$")
	public void ich_rufe_die_Nebenbuch_Detailansicht_auf() throws Throwable {
		subLedgerFinancialAccountMethods.selectFirstElement(SubLedgerFinancialAccountConstants.showButtonSelector);
	}

	@Given("^Ich rufe die Nebenbuch-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Nebenbuch_Bearbeiten_Maske_auf() throws Throwable {
		subLedgerFinancialAccountMethods.clickEditFinancialAccountButton();
	}

	@Given("^Ich aendere das Nebenbuch$")
	public void ich_aendere_das_Nebenbuch() throws Throwable {
		subLedgerFinancialAccountMethods.editFinancialAccount();
	}

	@When("^Ich speichere die Aenderung fuer Nebenbuch$")
	public void ich_speichere_die_Aenderung_fuer_Nebenbuch() throws Throwable {
		subLedgerFinancialAccountMethods.clickEditSaveFinancialAccountButton();
	}

	@Then("^Die Aenderung fuer Nebenbuch ist gespeichert$")
	public void die_Aenderung_fuer_Nebenbuch_ist_gespeichert() throws Throwable {
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

}
