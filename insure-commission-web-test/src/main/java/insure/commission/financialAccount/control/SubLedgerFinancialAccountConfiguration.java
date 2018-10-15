package insure.commission.financialAccount.control;

import insure.commission.financialAccount.entity.SubLedgerFinancialAccountModel;

public class SubLedgerFinancialAccountConfiguration {
	private static SubLedgerFinancialAccountConfiguration instance;
	private static SubLedgerFinancialAccountModel subLedgerFinancialAccountModel = new SubLedgerFinancialAccountModel();
	private static SubLedgerFinancialAccountMethods subLedgerFinancialAccountManager = new SubLedgerFinancialAccountMethods();

	public static SubLedgerFinancialAccountConfiguration getInstance() {
		if (instance == null) {
			instance = new SubLedgerFinancialAccountConfiguration();
		}
		return instance;
	}

	public static SubLedgerFinancialAccountModel buildFinancialAccount() {
		subLedgerFinancialAccountModel.setAccountNumber("Test" + subLedgerFinancialAccountManager.randomNumber());
		subLedgerFinancialAccountModel.setAccountName("Name-Test_");
		subLedgerFinancialAccountModel.setShortName("Kurzename-Test_");
		subLedgerFinancialAccountModel.setStatus("Buchungen erlaubt");
		subLedgerFinancialAccountModel.setImpact("Mandant");
		subLedgerFinancialAccountModel.setAccountType("Bestandskonto");
		subLedgerFinancialAccountModel.setTaxAllowance("Keine Einschränkung");
		subLedgerFinancialAccountModel.setCashFlowDirection("Ausgehend");
		subLedgerFinancialAccountModel.setPaymentType("Barauszahlung");
		subLedgerFinancialAccountModel.setPaymentMethod("Adhoc");
		subLedgerFinancialAccountModel.setInitialValue("100");
		return subLedgerFinancialAccountModel;
	}

	public static SubLedgerFinancialAccountModel editFinancialAccount() {
		subLedgerFinancialAccountModel.setAccountName("Neu-Name-Test_");
		subLedgerFinancialAccountModel.setShortName("Neu-Kurzename-Test_");
		subLedgerFinancialAccountModel.setStatus("Buchungen erlaubt");
		subLedgerFinancialAccountModel.setImpact("Mandant");
		subLedgerFinancialAccountModel.setAccountType("Bestandskonto");
		subLedgerFinancialAccountModel.setTaxAllowance("Keine Einschränkung");
		subLedgerFinancialAccountModel.setCashFlowDirection("Ausgehend");
		subLedgerFinancialAccountModel.setPaymentType("Barauszahlung");
		subLedgerFinancialAccountModel.setPaymentMethod("Adhoc");
		subLedgerFinancialAccountModel.setInitialValue("100");
		return subLedgerFinancialAccountModel;
	}

	public SubLedgerFinancialAccountModel getFinancialAccount() {
		return subLedgerFinancialAccountModel;
	}

	public void setFinancialAccount(SubLedgerFinancialAccountModel financialAccountModel) {
		SubLedgerFinancialAccountConfiguration.subLedgerFinancialAccountModel = financialAccountModel;
	}
}
