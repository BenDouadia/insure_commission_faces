package insure.commission.address.control;

import org.openqa.selenium.WebDriver;

import insure.commission.address.control.AddressConstants;
import insure.commission.address.entity.AddressModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddressMethods {

	AddressModel addressModel = new AddressModel();
	BasePage basePage = new BasePage();

	WebDriver driver;
	public AddressMethods() {
		this.driver = Hook.getDriver();
		addressModel = AddressConfiguration.getInstance().getAddress();
	}
	public void initializeAddress() {
		try {
			basePage.selectDropdownByValue(addressModel.getType(), AddressConstants.inputTypeSelector);

			driver.findElement(AddressConstants.inputStreetSelector).clear();
			driver.findElement(AddressConstants.inputStreetSelector).sendKeys(addressModel.getStreet());

			driver.findElement(AddressConstants.inputHouseNumberSelector).clear();
			driver.findElement(AddressConstants.inputHouseNumberSelector).sendKeys(addressModel.getHouseNumber());

			driver.findElement(AddressConstants.inputPostOfficeBoxSelector).clear();
			driver.findElement(AddressConstants.inputPostOfficeBoxSelector).sendKeys(addressModel.getPostOfficeBox());

			driver.findElement(AddressConstants.inputAdditionalAddressOneSelector).clear();
			driver.findElement(AddressConstants.inputAdditionalAddressOneSelector).sendKeys(addressModel.getAdditionalAddressOne());

			driver.findElement(AddressConstants.inputAdditionalAddressTwoSelector).clear();
			driver.findElement(AddressConstants.inputAdditionalAddressTwoSelector).sendKeys(addressModel.getAdditionalAddressTwo());

			driver.findElement(AddressConstants.inputAdditionalAddressThreeSelector).clear();
			driver.findElement(AddressConstants.inputAdditionalAddressThreeSelector).sendKeys(addressModel.getAdditionalAddressThree());

			driver.findElement(AddressConstants.inputCitySelector).clear();
			driver.findElement(AddressConstants.inputCitySelector).sendKeys(addressModel.getCity());

			driver.findElement(AddressConstants.inputZipcodeSelector).clear();
			driver.findElement(AddressConstants.inputZipcodeSelector).sendKeys(addressModel.getZipcode());

			basePage.selectDropdownByValue(addressModel.getCountry(), AddressConstants.inputCountrySelector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editAddress() {
		try {
			basePage.selectDropdownByValue(addressModel.getType(), AddressConstants.editTypeSelector);

			driver.findElement(AddressConstants.editStreetSelector).clear();
			driver.findElement(AddressConstants.editStreetSelector).sendKeys(addressModel.getStreet());

			driver.findElement(AddressConstants.editHouseNumberSelector).clear();
			driver.findElement(AddressConstants.editHouseNumberSelector).sendKeys(addressModel.getHouseNumber());

			driver.findElement(AddressConstants.editPostOfficeBoxSelector).clear();
			driver.findElement(AddressConstants.editPostOfficeBoxSelector).sendKeys(addressModel.getPostOfficeBox());

			driver.findElement(AddressConstants.editAdditionalAddressOneSelector).clear();
			driver.findElement(AddressConstants.editAdditionalAddressOneSelector).sendKeys(addressModel.getAdditionalAddressOne());

			driver.findElement(AddressConstants.editAdditionalAddressTwoSelector).clear();
			driver.findElement(AddressConstants.editAdditionalAddressTwoSelector).sendKeys(addressModel.getAdditionalAddressTwo());

			driver.findElement(AddressConstants.editAdditionalAddressThreeSelector).clear();
			driver.findElement(AddressConstants.editAdditionalAddressThreeSelector).sendKeys(addressModel.getAdditionalAddressThree());

			driver.findElement(AddressConstants.editCitySelector).clear();
			driver.findElement(AddressConstants.editCitySelector).sendKeys(addressModel.getCity());

			driver.findElement(AddressConstants.editZipcodeSelector).clear();
			driver.findElement(AddressConstants.editZipcodeSelector).sendKeys(addressModel.getZipcode());

			basePage.selectDropdownByValue(addressModel.getCountry(), AddressConstants.editCountrySelector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveAddressButton() {
		driver.findElement(AddressConstants.saveButtonSelector).click();
	}

	public void quittAddressButton() {
		driver.findElement(AddressConstants.quitButtonSelector).click();
	}

	public void editAddressButton() {
		driver.findElement(AddressConstants.editAddressButtonSelector).click();
	}

	public void addAddressButton() {
		driver.findElement(AddressConstants.addAddressButtonSelector).click();
	}

	public void showAddressButton() {
		basePage.selectFirstElement(AddressConstants.showAddressButtonSelector);
	}

	public void deleteAddressButton() {
		basePage.selectFirstElement(AddressConstants.deleteAddressButtonSelector);
	}

	public void returnAddressButton() {
		driver.findElement(AddressConstants.returnButtonSelector).click();
	}

	public void editSaveAddressButton() {
		driver.findElement(AddressConstants.editSaveButtonSelector).click();
	}

	public void editQuitAddressButton() {
		driver.findElement(AddressConstants.editQuitButtonSelector).click();
	}

	public String buildAddress(String street, String houseNumber, String zipcode, String city, String country) {
		StringBuilder sb = new StringBuilder();
		return sb.append(street).append(" ").append(houseNumber).append(", ")
				.append(zipcode).append(" ").append(city).append(", ")
				.append(country).toString();
	}
}
