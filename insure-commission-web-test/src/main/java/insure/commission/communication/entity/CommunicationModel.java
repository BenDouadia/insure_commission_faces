package insure.commission.communication.entity;


public class CommunicationModel {

	String communicationChannel;
	String communicationType;
	String phoneType;
	String country;
	String areaCode;
	String number;
	String advertisement;
	String advertisingFrom;
	String advertisingTo;
	String eMail;
	String platform;
	String account;
	String url;
	String note;

	public String getChannel() {
		return communicationChannel;
	}

	public String getCommunicationType() {
		return communicationType;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public String getCountry() {
		return country;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public String getNumber() {
		return number;
	}

	public String getAdvertisement() {
		return advertisement;
	}

	public String getAdvertisingFrom() {
		return advertisingFrom;
	}

	public String getAdvertisingTo() {
		return advertisingTo;
	}

	public String geteMail() {
		return eMail;
	}

	public String getPlatform() {
		return platform;
	}

	public String getAccount() {
		return account;
	}

	public String getUrl() {
		return url;
	}

	public String getNote() {
		return note;
	}

	public void setChannel(String communicationChannel) {
		this.communicationChannel = communicationChannel;
	}

	public void setType(String communicationType) {
		this.communicationType = communicationType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setAdvertisement(String advertisement) {
		this.advertisement = advertisement;
	}

	public void setAdvertisingFrom(String advertisingFrom) {
		this.advertisingFrom = advertisingFrom;
	}

	public void setAdvertisingTo(String advertisingTo) {
		this.advertisingTo = advertisingTo;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
