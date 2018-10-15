package insure.commission.salesChannel;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import insure.commission.salesChannel.control.SalesChannelConfiguration;
import insure.commission.salesChannel.control.SalesChannelConstants;
import insure.commission.salesChannel.control.SalesChannelMethods;
import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class ShowSalesChannel {
	WebDriver driver;
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	BasePage basePage = new BasePage();

	public ShowSalesChannel() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.getInstance().getSalesChannel();
	}

	@Given("^Ich rufe die Vertriebsweg-Detailansicht auf$")
	public void ich_rufe_die_Vertriebsweg_Detailansicht_auf() throws Throwable {
		basePage.selectFirstElement(SalesChannelConstants.showButtonSelector);
	}

	@Then("^Der Vertriebsweg ist angezeigt$")
	public void der_Vertriebsweg_ist_angezeigt() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(salesChannelModel.getName(), SalesChannelConstants.outputNameSelector));
		salesChannelMethods.clickReturnSalesChannelButton();
	}
}
