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

public class CreateSalesChannel {

	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	SalesChannelModel salesChannelModel = new SalesChannelModel();

	public CreateSalesChannel() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.buildSalesChannel();
		SalesChannelConfiguration.getInstance().setSalesChannel(salesChannelModel);;
	}

	@Given("^Ich rufe die Vertriebsweg-Ansicht auf$")
	public void ich_rufe_die_Vertriebsweg_Ansicht_auf() throws Throwable {
		salesChannelMethods.clickSalesChannelButton();
	}

	@Given("^Ich rufe die Vertriebsweg-Anlage auf$")
	public void ich_rufe_die_Vertriebsweg_Anlage_auf() throws Throwable {
		salesChannelMethods.clickAddSalesChannelButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Vertriebsweg aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Vertriebsweg_aus() throws Throwable {
		salesChannelMethods.initializeSalesChannel();
	}

	@When("^Ich speichere Vertriebsweg$")
	public void ich_speichere_Vertriebsweg() throws Throwable {
		salesChannelMethods.clickInputSaveSalesChannelButton();
	}

	@Then("^Die angelegte Daten fuer Vertriebsweg sind vorhanden$")
	public void die_angelegte_Daten_fuer_Vertriebsweg_sind_vorhanden() throws Throwable {
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

	@Given("^Ich lege einen Vertriebsweg an$")
	public void ich_lege_einen_Vertriebsweg_an() throws Throwable {
		salesChannelMethods.clickSalesChannelButton();
		salesChannelMethods.clickAddSalesChannelButton();
		salesChannelMethods.initializeSalesChannel();
		salesChannelMethods.clickInputSaveSalesChannelButton();
	}

}
