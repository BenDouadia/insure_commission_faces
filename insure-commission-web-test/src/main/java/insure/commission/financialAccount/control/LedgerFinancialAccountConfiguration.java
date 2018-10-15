package insure.commission.financialAccount.control;

import insure.commission.financialAccount.entity.LedgerFinancialAccountModel;
import insure.commission.utility.BasePage;

public class LedgerFinancialAccountConfiguration {
	private static BasePage basePage = new BasePage();
	private static LedgerFinancialAccountConfiguration instance;
	private static LedgerFinancialAccountModel ledgerFinancialAccountModel = new LedgerFinancialAccountModel();
	public static LedgerFinancialAccountConfiguration getInstance() {
		if (instance == null) {
			instance = new LedgerFinancialAccountConfiguration();
		}
		return instance;
	}

	public static LedgerFinancialAccountModel buildLedgerFinancialAccount() {
		ledgerFinancialAccountModel.setAccountNumber("Test" + basePage.randomNumber());
		ledgerFinancialAccountModel.setAccountName("Name-Test_");
		ledgerFinancialAccountModel.setShortName("Kurzename-Test_");
		ledgerFinancialAccountModel.setStatus("Buchungen erlaubt");
		ledgerFinancialAccountModel.setImpact("Mandant");
		ledgerFinancialAccountModel.setAccountType("Bestandskonto");
		ledgerFinancialAccountModel.setTaxAllowance("Keine Einschränkung");
		ledgerFinancialAccountModel.setCashFlowDirection("Ausgehend");
		ledgerFinancialAccountModel.setPaymentType("Barauszahlung");
		ledgerFinancialAccountModel.setPaymentMethod("Adhoc");
		ledgerFinancialAccountModel.setInitialValue("100");
		return ledgerFinancialAccountModel;
	}

	public static LedgerFinancialAccountModel editLedgerFinancialAccount() {
		ledgerFinancialAccountModel.setAccountName("Neu-Name-Test_");
		ledgerFinancialAccountModel.setShortName("Neu-Kurzename-Test_");
		ledgerFinancialAccountModel.setStatus("Buchungen erlaubt");
		ledgerFinancialAccountModel.setImpact("Mandant");
		ledgerFinancialAccountModel.setAccountType("Bestandskonto");
		ledgerFinancialAccountModel.setTaxAllowance("Keine Einschränkung");
		ledgerFinancialAccountModel.setCashFlowDirection("Ausgehend");
		ledgerFinancialAccountModel.setPaymentType("Barauszahlung");
		ledgerFinancialAccountModel.setPaymentMethod("Adhoc");
		ledgerFinancialAccountModel.setInitialValue("100");
		return ledgerFinancialAccountModel;
	}

	public LedgerFinancialAccountModel getLedgerFinancialAccount() {
		return ledgerFinancialAccountModel;
	}

	public void setLedgerFinancialAccount(LedgerFinancialAccountModel ledgerFinancialAccountModel) {
		LedgerFinancialAccountConfiguration.ledgerFinancialAccountModel = ledgerFinancialAccountModel;
	}
}
