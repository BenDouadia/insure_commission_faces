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
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddAddress {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	AddressModel addressModel = new AddressModel();
	AddressMethods addressMethods = new AddressMethods();
	SearchMethods searchModel = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddAddress() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		addressModel = AddressConfiguration.buildAddress();
		AddressConfiguration.getInstance().setAddress(addressModel);
	}

	@Given("^Ich rufe die Adresse-Anlage auf$")
	public void ich_rufe_die_Adresse_Anlage_auf() throws Throwable {
		addressMethods.addAddressButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Adresse aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Adresse_aus() throws Throwable {
		addressMethods.initializeAddress();
	}

	@When("^Ich speichere Adresse$")
	public void ich_speichere_Adresse() throws Throwable {
		addressMethods.saveAddressButton();
	}

	@When("^Ich rufe die Adresse-Detailansicht auf$")
	public void ich_rufe_die_Adresse_Detailansicht_auf() throws Throwable {
		addressMethods.showAddressButton();
	}

	@Then("^Die angelegte Daten fuer Adresse sind vorhanden$")
	public void die_angelegte_Daten_fuer_Adresse_sind_vorhanden() throws Throwable {
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

	@Given("^Ich lege eine Adresse an$")
	public void ich_lege_eine_Adresse_an() throws Throwable {
		searchModel.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		addressMethods.addAddressButton();
		addressMethods.initializeAddress();
		addressMethods.saveAddressButton();
	}
}
