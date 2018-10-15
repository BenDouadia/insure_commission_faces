package insure.commission.personalDetail.control;

import insure.commission.personalDetail.entity.PersonalDetailModel;

import insure.commission.utility.BasePage;

public class PersonalDetailConfiguration {
	private static PersonalDetailModel personalDetailModel = new PersonalDetailModel();

	static BasePage basePage;
	private static int suffix = basePage.randomNumber();
	private static PersonalDetailConfiguration instance;

	public static PersonalDetailConfiguration getInstance() {
		if (instance == null) {
			instance = new PersonalDetailConfiguration();
		}

		return instance;
	}

	public static PersonalDetailModel buildPersonalDetail() {
		personalDetailModel.setDateOfBirth("01.01.1900");
		personalDetailModel.setDateOfDeath("01.01.2000");
		personalDetailModel.setNameAtBirth("Geburtsname-Test-"+ suffix);
		personalDetailModel.setPlaceOfBirth("Geburtsort-Test-"+ suffix);
		personalDetailModel.setMaritalStatus("verheiratet");
		return personalDetailModel;
	}

	public static PersonalDetailModel editPersonalDetail() {
		personalDetailModel.setDateOfBirth("11.11.1911");
		personalDetailModel.setDateOfDeath("12.12.2000");
		personalDetailModel.setNameAtBirth("Neu-Geburtsname-Test-"+ suffix);
		personalDetailModel.setPlaceOfBirth("Neu-Geburtsort-Test-"+ suffix);
		personalDetailModel.setMaritalStatus("ledig");
		return personalDetailModel;
	}

	public PersonalDetailModel getPersonalDetail() {
		return personalDetailModel;
	}

	public void setPersonalDetail(PersonalDetailModel personalDetailModel) {
		this.personalDetailModel = personalDetailModel;
	}
}
