package insure.commission.financialAccount.entity;

public class SubLedgerFinancialAccountModel {
	String accountNumber;
	String accountName;
	String shortName;
	String status;
	String accountingType;
	String impact;
	String accountType;
	String taxAllowance;
	String cashFlowDirection;
	String paymentType;
	String paymentMethod;
	String initialValue;


	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAccountingType() {
		return accountingType;
	}
	public void setAccountingType(String accountingType) {
		this.accountingType = accountingType;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getTaxAllowance() {
		return taxAllowance;
	}
	public void setTaxAllowance(String taxAllowance) {
		this.taxAllowance = taxAllowance;
	}
	public String getCashFlowDirection() {
		return cashFlowDirection;
	}
	public void setCashFlowDirection(String cashFlowDirection) {
		this.cashFlowDirection = cashFlowDirection;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getInitialValue() {
		return initialValue;
	}
	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}
}
