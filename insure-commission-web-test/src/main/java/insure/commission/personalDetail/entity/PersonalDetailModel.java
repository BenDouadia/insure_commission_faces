package insure.commission.personalDetail.entity;


public class PersonalDetailModel{
	String dateOfBirth;
	String dateOfDeath;
	String nameAtBirth;
	String placeOfBirth;
	String maritalStatus;

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getDateOfDeath() {
		return dateOfDeath;
	}

	public String getNameAtBirth() {
		return nameAtBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public void setNameAtBirth(String nameAtBirth) {
		this.nameAtBirth = nameAtBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
}
