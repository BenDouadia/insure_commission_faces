package insure.commission.address.control;

import insure.commission.address.entity.AddressModel;
import insure.commission.utility.BasePage;

public class AddressConfiguration {

	private static AddressModel addressModel = new AddressModel();

	private static int suffix = BasePage.randomNumber();
	private static AddressConfiguration instance;

	public static AddressConfiguration getInstance() {
		if (instance == null) {
			instance = new AddressConfiguration();
		}

		return instance;
	}

	public static AddressModel buildAddress() {
		addressModel.setType("Standard");
		addressModel.setStreet("Strasse-Test-" + suffix);
		addressModel.setHouseNumber("00");
		addressModel.setPostOfficeBox("000");
		addressModel.setAdditionalAddressOne("Adresszusatz-1-Test-" + suffix);
		addressModel.setAdditionalAddressTwo("Adresszusatz-2-Test-" + suffix);
		addressModel.setAdditionalAddressThree("Adresszusatz-3-Test-" + suffix);
		addressModel.setZipcode("00000");
		addressModel.setCity("Stadt-Test-" + suffix);
		addressModel.setCountry("Deutschland");
		return addressModel;
	}

	public static AddressModel editAddress() {
		addressModel.setType("Standard");
		addressModel.setStreet("Neu-Strasse-Test-" + suffix);
		addressModel.setHouseNumber("11");
		addressModel.setPostOfficeBox("111");
		addressModel.setAdditionalAddressOne("Neu-Adresszusatz-1-Test-" + suffix);
		addressModel.setAdditionalAddressTwo("Neu-Adresszusatz-2-Test-" + suffix);
		addressModel.setAdditionalAddressThree("Neu-Adresszusatz-3-Test-" + suffix);
		addressModel.setZipcode("11111");
		addressModel.setCity("Neu-Stadt-Test-" + suffix);
		addressModel.setCountry("Marokko");
		return addressModel;
	}

	public AddressModel getAddress() {
		return addressModel;
	}

	public void setAddress(AddressModel addressModel) {
		this.addressModel = addressModel;
	}
}
