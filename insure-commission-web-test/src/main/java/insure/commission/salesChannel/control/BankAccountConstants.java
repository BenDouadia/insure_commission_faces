package insure.commission.salesChannel.control;

import org.openqa.selenium.By;

public interface BankAccountConstants {

	// Customer Account
	By inputCustomerAccountOwnerSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-bankAccount-depositor:input");
	By inputCustomerMailRecipientSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-bankAccount-mailRecipient:input");
	By inputCustomerMembershipReferenceSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-bankAccount-membershipReference:input");
	By inputCustomerBankNameSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-bankAccount-bankName:input");
	By inputCustomerZipCodeSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-zipCode:input");
	By inputCustomerCitySelector = By.id("insure-main-form:fieldset-customerBankAccount:input-city:input");
	By inputCustomerBicSwiftSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-bankAccount-bicSwift:input");
	By inputCustomerIbanSelector = By.id("insure-main-form:fieldset-customerBankAccount:input-bankAccount-iban:input");
	By inputCustomerCurrencySelector = By.id("insure-main-form:fieldset-customerBankAccount:input-currency:select");

	By outputCustomerAccountOwnerSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-bankAccount-depositor:output");
	By outputCustomerMailRecipientSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-bankAccount-mailRecipient:output");
	By outputCustomerMembershipReferenceSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-bankAccount-membershipReference:output");
	By outputCustomerBankNameSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-bankAccount-bankName:output");
	By outputCustomerZipCodeSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-zipCode:output");
	By outputCustomerCitySelector = By.id("insure-main-form:fieldset-customerBankAccount:output-city:output");
	By outputCustomerBicSwiftSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-bankAccount-bicSwift:output");
	By outputCustomerIbanSelector = By.id("insure-main-form:fieldset-customerBankAccount:output-bankAccount-iban:output");
	By outputCustomerCurrencySelector = By.id("insure-main-form:fieldset-customerBankAccount:output-currency:output");

	// Standard Account
	By inputStandardAccountOwnerSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-bankAccount-depositor:input");
	By inputStandardMailRecipientSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-bankAccount-mailRecipient:input");
	By inputStandardMembershipReferenceSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-bankAccount-membershipReference:input");
	By inputStandardBankNameSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-bankAccount-bankName:input");
	By inputStandardZipCodeSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-zipCode:input");
	By inputStandardCitySelector = By.id("insure-main-form:fieldset-standardBankAccount:input-city:input");
	By inputStandardBicSwiftSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-bankAccount-bicSwift:input");
	By inputStandardIbanSelector = By.id("insure-main-form:fieldset-standardBankAccount:input-bankAccount-iban:input");
	By inputStandardCurrencySelector = By.id("insure-main-form:fieldset-standardBankAccount:input-currency:select");

	By outputStandardAccountOwnerSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-bankAccount-depositor:output");
	By outputStandardMailRecipientSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-bankAccount-mailRecipient:output");
	By outputStandardMembershipReferenceSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-bankAccount-membershipReference:output");
	By outputStandardBankNameSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-bankAccount-bankName:output");
	By outputStandardZipCodeSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-zipCode:output");
	By outputStandardCitySelector = By.id("insure-main-form:fieldset-standardBankAccount:output-city:output");
	By outputStandardBicSwiftSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-bankAccount-bicSwift:output");
	By outputStandardIbanSelector = By.id("insure-main-form:fieldset-standardBankAccount:output-bankAccount-iban:output");
	By outputStandardCurrencySelector = By.id("insure-main-form:fieldset-standardBankAccount:output-currency:output");

	// Salespartner Account
	By inputSalespartnerAccountOwnerSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-bankAccount-depositor:input");
	By inputSalespartnerMailRecipientSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-bankAccount-mailRecipient:input");
	By inputSalespartnerMembershipReferenceSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-bankAccount-membershipReference:input");
	By inputSalespartnerBankNameSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-bankAccount-bankName:input");
	By inputSalespartnerZipCodeSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-zipCode:input");
	By inputSalespartnerCitySelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-city:input");
	By inputSalespartnerBicSwiftSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-bankAccount-bicSwift:input");
	By inputSalespartnerIbanSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-bankAccount-iban:input");
	By inputSalespartnerCurrencySelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:input-currency:select");

	By outputSalespartnerAccountOwnerSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-bankAccount-depositor:output");
	By outputSalespartnerMailRecipientSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-bankAccount-mailRecipient:output");
	By outputSalespartnerMembershipReferenceSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-bankAccount-membershipReference:output");
	By outputSalespartnerBankNameSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-bankAccount-bankName:output");
	By outputSalespartnerZipCodeSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-zipCode:output");
	By outputSalespartnerCitySelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-city:output");
	By outputSalespartnerBicSwiftSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-bankAccount-bicSwift:output");
	By outputSalespartnerIbanSelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-bankAccount-iban:output");
	By outputSalespartnerCurrencySelector = By.id("insure-main-form:fieldset-salesPartnerBankAccount:output-currency:output");
}
