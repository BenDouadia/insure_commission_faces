package insure.commission.financialAccountingTemplate;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.financialAccountingTemplate.control.FinancialAccountingTemplateConfiguration;
import insure.commission.financialAccountingTemplate.control.FinancialAccountingTemplateConstants;
import insure.commission.financialAccountingTemplate.control.FinancialAccountingTemplateMethods;
import insure.commission.financialAccountingTemplate.entity.FinancialAccountingTemplateModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditFinancialAccountingTemplate {
	WebDriver driver;
	BasePage basePage = new BasePage();
	FinancialAccountingTemplateModel financialAccountingTemplateModel = new FinancialAccountingTemplateModel();
	FinancialAccountingTemplateMethods financialAccountingTemplateMethods = new FinancialAccountingTemplateMethods();


	public EditFinancialAccountingTemplate() {
		this.driver = Hook.getDriver();
		financialAccountingTemplateModel = FinancialAccountingTemplateConfiguration.editFinancialAccountingTemplate();
		FinancialAccountingTemplateConfiguration.getInstance().setFinancialAccountingTemplate(financialAccountingTemplateModel);
	}

	@Given("^Ich suche nach Buchungsvorlage$")
	public void ich_suche_nach_Buchungsvorlage() throws Throwable {
		financialAccountingTemplateMethods.searchFinancialAccountingName(financialAccountingTemplateModel.getName());
	}

	@Given("^Ich rufe die Buchungsvorlage-Detailansicht auf$")
	public void ich_rufe_die_Buchungsvorlage_Detailansicht_auf() throws Throwable {
		financialAccountingTemplateMethods.clickShowFinancialAccountingButton();
	}

	@Given("^Ich rufe die Buchungsvorlage-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Buchungsvorlage_Bearbeiten_Maske_auf() throws Throwable {
		financialAccountingTemplateMethods.clickEditFinancialAccountingButton();
	}

	@Given("^Ich aendere die Buchungsvorlage$")
	public void ich_aendere_die_Buchungsvorlage() throws Throwable {
		financialAccountingTemplateMethods.editFinancialAccounting();
	}

	@When("^Ich speichere die Aenderung fuer Buchungsvorlage$")
	public void ich_speichere_die_Aenderung_fuer_Buchungsvorlage() throws Throwable {
		financialAccountingTemplateMethods.clickEditSaveFinancialAccountingButton();
	}

	@Then("^Die Aenderung fuer Buchungsvorlage ist gespeichert$")
	public void die_Aenderung_fuer_Buchungsvorlage_ist_gespeichert() throws Throwable {
		financialAccountingTemplateMethods.clickReturnFinancialAccountingButton();
		financialAccountingTemplateMethods.searchFinancialAccountingName(financialAccountingTemplateModel.getName());
		financialAccountingTemplateMethods.clickShowFinancialAccountingButton();

		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getBookingType(), FinancialAccountingTemplateConstants.outputBookingTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getName(), FinancialAccountingTemplateConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getValue() + ".000000", FinancialAccountingTemplateConstants.outputValueSelector));
		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getCalculation(), FinancialAccountingTemplateConstants.outputCalculationSelector));
		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getRepeat(), FinancialAccountingTemplateConstants.outputRepeatSelector));
		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getRepeatCount(), FinancialAccountingTemplateConstants.outputRepeatCountSelector));
//		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getAccount(), FinancialAccountingTemplateConstants.outputAccountSelector));
//		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getOffsettingAccount(), FinancialAccountingTemplateConstants.outputOffsettingAccountSelector));
//		assertTrue(basePage.checkIfValuesAreEqual(financialAccountingTemplateModel.getCostCenter(), FinancialAccountingTemplateConstants.outputCostCenterSelector));

		financialAccountingTemplateMethods.clickReturnFinancialAccountingButton();
	}

}
