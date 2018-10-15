package insure.commission.financialAccountingTemplate.control;

import insure.commission.financialAccountingTemplate.entity.FinancialAccountingTemplateModel;
import insure.commission.utility.BasePage;

public class FinancialAccountingTemplateConfiguration {
	private static BasePage basePage = new BasePage();
	private static FinancialAccountingTemplateConfiguration instance;
	private static FinancialAccountingTemplateModel financialAccountingModel = new FinancialAccountingTemplateModel();

	public static FinancialAccountingTemplateConfiguration getInstance() {
		if (instance == null) {
			instance = new FinancialAccountingTemplateConfiguration();
		}
		return instance;
	}

	public static FinancialAccountingTemplateModel buildFinancialAccountingTemplate() {
		financialAccountingModel.setBookingType("Haben");
		financialAccountingModel.setName("Name_"+ basePage.randomNumber());
		financialAccountingModel.setValue("40");
		financialAccountingModel.setCalculation("Abzüglich");
		financialAccountingModel.setRepeat("monatlich");
		financialAccountingModel.setRepeatCount("4");
		financialAccountingModel.setAccount("Test101, Neu-Name-Test_");
		financialAccountingModel.setOffsettingAccount("Test258, Name-Test_");
		financialAccountingModel.setCostCenter("Test543, Name-Test_");
		return financialAccountingModel;
	}

	public static FinancialAccountingTemplateModel editFinancialAccountingTemplate() {
		financialAccountingModel.setBookingType("Soll");
//		financialAccountingModel.setName("Neu-Name_"+ basePage.randomNumber());
		financialAccountingModel.setValue("100");
		financialAccountingModel.setCalculation("Zuzüglich");
		financialAccountingModel.setRepeat("einmalig");
		financialAccountingModel.setRepeatCount("2");
		financialAccountingModel.setAccount("Test258, Name-Test_");
		financialAccountingModel.setOffsettingAccount("Test101, Neu-Name-Test_");
		financialAccountingModel.setCostCenter("Test725, Name-Test_");
		return financialAccountingModel;
	}


	public FinancialAccountingTemplateModel getFinancialAccountingTemplate() {
		return financialAccountingModel;
	}

	public void setFinancialAccountingTemplate(FinancialAccountingTemplateModel financialAccountingModel) {
		FinancialAccountingTemplateConfiguration.financialAccountingModel = financialAccountingModel;
	}
}
