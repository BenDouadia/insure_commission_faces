package insure.commission.address.entity;


public class AddressModel {

	String type;
	String street;
	String houseNumber;
	String postOfficeBox;
	String additionalAddressOne;
	String additionalAddressTwo;
	String additionalAddressThree;
	String zipcode;
	String city;
	String country;

	public String getType() {
		return type;
	}

	public String getStreet() {
		return street;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getAdditionalAddressOne() {
		return additionalAddressOne;
	}

	public String getAdditionalAddressTwo() {
		return additionalAddressTwo;
	}

	public String getPostOfficeBox() {
		return postOfficeBox;
	}

	public String getAdditionalAddressThree() {
		return additionalAddressThree;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setPostOfficeBox(String postOfficeBox) {
		this.postOfficeBox = postOfficeBox;
	}

	public void setAdditionalAddressOne(String additionalAddressOne) {
		this.additionalAddressOne = additionalAddressOne;
	}

	public void setAdditionalAddressTwo(String additionalAddressTwo) {
		this.additionalAddressTwo = additionalAddressTwo;
	}

	public void setAdditionalAddressThree(String additionalAddressThree) {
		this.additionalAddressThree = additionalAddressThree;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
