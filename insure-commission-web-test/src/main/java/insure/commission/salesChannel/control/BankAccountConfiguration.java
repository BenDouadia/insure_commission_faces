package insure.commission.salesChannel.control;

import insure.commission.salesChannel.entity.BankAccountModel;
import insure.commission.utility.BasePage;

public class BankAccountConfiguration {
	private static BankAccountModel bankAccountModel = new BankAccountModel();

	private static int suffix = BasePage.randomNumber();
	private static BasePage basePage = new BasePage();
	private static BankAccountConfiguration instance;

	public static BankAccountConfiguration getInstance() {
		if (instance == null) {
			instance = new BankAccountConfiguration();
		}

		return instance;
	}

	public static BankAccountModel buildBankAccount() {
		bankAccountModel.setAccountOwner("accountOwner" + suffix);
		bankAccountModel.setMailRecipient("mailRecipient@mail.com");
		bankAccountModel.setMembershipReference("membershipReference");
		bankAccountModel.setBankName("bankName");
		bankAccountModel.setZipCode("00000");
		bankAccountModel.setCity("city");
		bankAccountModel.setBicSwift("bicSwift");
		bankAccountModel.setIban("DE25165498446146494984984");
		bankAccountModel.setCurrency("Gold");
		return bankAccountModel;
	}

	public static BankAccountModel editBankAccount() {
		bankAccountModel.setAccountOwner("new-accountOwner" + suffix);
		bankAccountModel.setMailRecipient("new-mailRecipient@mail.com");
		bankAccountModel.setMembershipReference("new-membershipReference");
		bankAccountModel.setBankName("new-bankName");
		bankAccountModel.setZipCode("11111");
		bankAccountModel.setCity("new-city");
		bankAccountModel.setBicSwift("newBicSwift");
		bankAccountModel.setIban("FR25165498446146494984984");
		bankAccountModel.setCurrency("Platin");
		return bankAccountModel;
	}

	public BankAccountModel getBankAccount() {
		return bankAccountModel;
	}

	public void setBankAccount(BankAccountModel bankAccountModel) {
		this.bankAccountModel = bankAccountModel;
	}
}
