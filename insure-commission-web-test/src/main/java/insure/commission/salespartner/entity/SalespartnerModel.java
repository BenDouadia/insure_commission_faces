package insure.commission.salespartner.entity;


public class SalespartnerModel {
	String parentNumber;
	String parentName;
	String parentFirstName;
	String salesChannel;
	String organizationRole;
	String mainAccountNumber;
	String mainAccountName;
	String mainAccountFirstName;
	String dateOfEntrance;

	public String getSalesChannel() {
		return salesChannel;
	}

	public String getOrganizationRole() {
		return organizationRole;
	}

	public String getDateOfEntrance() {
		return dateOfEntrance;
	}

	public String getParentNumber() {
		return parentNumber;
	}

	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}

	public String getParentName() {
		return parentName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public String getMainAccountNumber() {
		return mainAccountNumber;
	}

	public String getMainAccountName() {
		return mainAccountName;
	}

	public String getMainAccountFirstName() {
		return mainAccountFirstName;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public void setOrganizationRole(String organizationRole) {
		this.organizationRole = organizationRole;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public void setMainAccountNumber(String mainAccountNumber) {
		this.mainAccountNumber = mainAccountNumber;
	}

	public void setMainAccountName(String mainAccountName) {
		this.mainAccountName = mainAccountName;
	}

	public void setMainAccountFirstName(String mainAccountFirstName) {
		this.mainAccountFirstName = mainAccountFirstName;
	}

	public void setDateOfEntrance(String dateOfEntrance) {
		this.dateOfEntrance = dateOfEntrance;
	}

}
