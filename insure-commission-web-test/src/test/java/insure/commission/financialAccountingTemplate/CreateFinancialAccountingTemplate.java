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

public class CreateFinancialAccountingTemplate {

	WebDriver driver;
	BasePage basePage = new BasePage();
	FinancialAccountingTemplateMethods financialAccountingTemplateMethods = new FinancialAccountingTemplateMethods();
	FinancialAccountingTemplateModel financialAccountingTemplateModel = new FinancialAccountingTemplateModel();

	public CreateFinancialAccountingTemplate() {
		this.driver = Hook.getDriver();
		financialAccountingTemplateModel = FinancialAccountingTemplateConfiguration.buildFinancialAccountingTemplate();
		FinancialAccountingTemplateConfiguration.getInstance().setFinancialAccountingTemplate(financialAccountingTemplateModel);
	}

	@Given("^Ich rufe die Buchungsvorlage-Ansicht auf$")
	public void ich_rufe_die_Buchungsvorlage_Ansicht_auf() throws Throwable {
		financialAccountingTemplateMethods.clickFinancialAccountingButton();
	}

	@Given("^Ich rufe die Buchungsvorlage-Anlage auf$")
	public void ich_rufe_die_Buchungsvorlage_Anlage_auf() throws Throwable {
		financialAccountingTemplateMethods.clickAddFinancialAccountingButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Buchungsvorlage aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Buchungsvorlage_aus() throws Throwable {
		financialAccountingTemplateMethods.initializeFinancialAccounting();
	}

	@When("^Ich speichere Buchungsvorlage$")
	public void ich_speichere_Buchungsvorlage() throws Throwable {
		financialAccountingTemplateMethods.clickInputSaveFinancialAccountingButton();
	}

	@Then("^Die angelegte Daten fuer Buchungsvorlage sind vorhanden$")
	public void die_angelegte_Daten_fuer_Buchungsvorlage_sind_vorhanden() throws Throwable {
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

	@Given("^Ich lege eine Buchungsvorlage an$")
	public void ich_lege_eine_Buchungsvorlage_an() throws Throwable {
		financialAccountingTemplateMethods.clickFinancialAccountingButton();
		financialAccountingTemplateMethods.clickAddFinancialAccountingButton();
		financialAccountingTemplateMethods.initializeFinancialAccounting();
		financialAccountingTemplateMethods.clickInputSaveFinancialAccountingButton();
	}
}
