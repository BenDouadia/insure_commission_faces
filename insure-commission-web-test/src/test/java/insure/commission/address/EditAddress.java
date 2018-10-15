package insure.commission.address;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.address.control.AddressConfiguration;
import insure.commission.address.control.AddressConstants;
import insure.commission.address.control.AddressMethods;
import insure.commission.address.entity.AddressModel;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditAddress {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	AddressModel addressModel = new AddressModel();
	AddressMethods addressMethods = new AddressMethods();
	BasePage basePage = new BasePage();

	public EditAddress() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.getInstance().getMasterdata();
		addressModel = AddressConfiguration.editAddress();
		AddressConfiguration.getInstance().setAddress(addressModel);
	}

	@Given("^Ich rufe die Adresse-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Adresse_Bearbeiten_Maske_auf() throws Throwable {
		addressMethods.editAddressButton();
	}

	@Given("^Ich aendere die Adresse$")
	public void ich_aendere_die_Adresse() throws Throwable {
		addressMethods.editAddress();
	}

	@When("^Ich speichere die Aenderung fuer Adresse$")
	public void ich_speichere_die_Aenderung_fuer_Adresse() throws Throwable {
		addressMethods.editSaveAddressButton();
	}

	@Then("^Die Adresse ist geaendert$")
	public void die_Adresse_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getType(), AddressConstants.outputTypeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getStreet(), AddressConstants.outputStreetSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getHouseNumber(), AddressConstants.outputHouseNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getPostOfficeBox(), AddressConstants.outputPostOfficeBoxSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getAdditionalAddressOne(), AddressConstants.outputAdditionalAddressOneSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getAdditionalAddressTwo(), AddressConstants.outputAdditionalAddressTwoSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getAdditionalAddressThree(), AddressConstants.outputAdditionalAddressThreeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getCity(), AddressConstants.outputCitySelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getZipcode(), AddressConstants.outputZipcodeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(addressModel.getCountry(), AddressConstants.outputCountrySelector));
		addressMethods.returnAddressButton();
		masterdataMethods.searchMasterdataButton();
	}
}
