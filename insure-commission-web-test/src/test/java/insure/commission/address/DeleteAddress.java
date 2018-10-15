package insure.commission.address;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.address.control.AddressConfiguration;
import insure.commission.address.control.AddressMethods;
import insure.commission.address.entity.AddressModel;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteAddress {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	AddressModel addressModel = new AddressModel();
	AddressMethods addressMethods = new AddressMethods();
	BasePage basePage = new BasePage();

	public DeleteAddress() {
		this.driver = Hook.getDriver();
		addressModel = AddressConfiguration.getInstance().getAddress();
	}
	@When("^Ich loesche die Adresse$")
	public void ich_loesche_die_Adresse() throws Throwable {
		addressMethods.deleteAddressButton();
	}

	@Then("^Die Adresse ist geloescht$")
	public void die_Adresse_ist_geloescht() throws Throwable {
		String postalAddress = addressMethods.buildAddress(addressModel.getStreet(), addressModel.getHouseNumber(),
				addressModel.getZipcode(), addressModel.getCity(), addressModel.getCountry());
		assertFalse(basePage.checkIfValueExist(postalAddress));
		masterdataMethods.searchMasterdataButton();
	}
}
