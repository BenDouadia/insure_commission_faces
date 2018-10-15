package insure.commission.financialAccountingTemplate;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.financialAccountingTemplate.control.FinancialAccountingTemplateConfiguration;
import insure.commission.financialAccountingTemplate.control.FinancialAccountingTemplateConstants;
import insure.commission.financialAccountingTemplate.control.FinancialAccountingTemplateMethods;
import insure.commission.financialAccountingTemplate.entity.FinancialAccountingTemplateModel;
import insure.commission.utility.Hook;

public class DeleteFinancialAccountingTemplate {
	WebDriver driver;
	FinancialAccountingTemplateMethods financialAccountingTemplateMethods = new FinancialAccountingTemplateMethods();
	FinancialAccountingTemplateModel financialAccountingTemplateModel = new FinancialAccountingTemplateModel();

	public DeleteFinancialAccountingTemplate() {
		this.driver = Hook.getDriver();
		financialAccountingTemplateModel = FinancialAccountingTemplateConfiguration.getInstance().getFinancialAccountingTemplate();
	}

	@When("^Ich loesche die Buchungsvorlage$")
	public void ich_loesche_die_Buchungsvorlage() throws Throwable {
		financialAccountingTemplateMethods.clickDeleteFinancialAccountingButton();
	}

	@Then("^Die Buchungsvorlage ist geloescht$")
	public void die_Buchungsvorlage_ist_geloescht() throws Throwable {
		financialAccountingTemplateMethods.searchFinancialAccountingName(financialAccountingTemplateModel.getName());
		assertEquals(0, driver.findElements(FinancialAccountingTemplateConstants.deleteButtonSelector).size());
	}
}
