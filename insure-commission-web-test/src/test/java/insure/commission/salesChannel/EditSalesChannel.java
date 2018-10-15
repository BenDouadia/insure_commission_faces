package insure.commission.salesChannel;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.salesChannel.control.SalesChannelConfiguration;
import insure.commission.salesChannel.control.SalesChannelConstants;
import insure.commission.salesChannel.control.SalesChannelMethods;
import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditSalesChannel {
	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();


	public EditSalesChannel() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.editSalesChannel();
		SalesChannelConfiguration.getInstance().setSalesChannel(salesChannelModel);
	}

	@Given("^Ich suche nach Vertriebsweg$")
	public void ich_suche_nach_Vertriebsweg() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
	}

	@Given("^Ich rufe die Vertriebsweg-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Vertriebsweg_Bearbeiten_Maske_auf() throws Throwable {
		basePage.selectFirstElement(SalesChannelConstants.editButtonSelector);
	}

	@Given("^Ich aendere den Vertriebsweg$")
	public void ich_aendere_den_Vertriebsweg() throws Throwable {
		salesChannelMethods.editSalesChannel();
	}

	@When("^Ich speichere die Aenderung fuer Vertriebsweg$")
	public void ich_speichere_die_Aenderung_fuer_Vertriebsweg() throws Throwable {
		salesChannelMethods.clickEditSaveSalesChannelButton();
	}

	@Then("^Die Aenderung fuer Vertriebsweg ist gespeichert$")
	public void die_Aenderung_fuer_Vertriebsweg_ist_gespeichert() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		basePage.selectFirstElement(SalesChannelConstants.showButtonSelector);

		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getNumber(), SalesChannelConstants.outputNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getShortName(), SalesChannelConstants.outputShortNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getName(), SalesChannelConstants.outputNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getCompanyName(), SalesChannelConstants.outputCompanyNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getExecutiveName(), SalesChannelConstants.outputExecutiveNameSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getTradeRegister(), SalesChannelConstants.outputTradeRegisterSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getCreditorId(), SalesChannelConstants.outputCreditorIdSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getCountry(), SalesChannelConstants.outputCountrySelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getZipcode(), SalesChannelConstants.outputZipcodeSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getCity(), SalesChannelConstants.outputCitySelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getStreet(), SalesChannelConstants.outputStreetSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getHouseNumber(), SalesChannelConstants.outputHouseNumberSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getLanguage(), SalesChannelConstants.outputLanguageSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getCurrency(), SalesChannelConstants.outputCurrencySelector));
//		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getContractStatus(), SalesChannelConstants.outputContractStatusSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getContractForm(), SalesChannelConstants.outputContractFormSelector));
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getProbationTime(), SalesChannelConstants.outputProbationTimeSelector));
		salesChannelMethods.clickReturnSalesChannelButton();
	}
}
