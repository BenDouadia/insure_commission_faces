package insure.commission.salesChannel;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.salesChannel.control.SalesChannelConfiguration;
import insure.commission.salesChannel.control.SalesChannelConstants;
import insure.commission.salesChannel.control.SalesChannelMethods;
import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteSalesChannel {
	WebDriver driver;
	SalesChannelMethods salesChannelMethods = new SalesChannelMethods();
	SalesChannelModel salesChannelModel = new SalesChannelModel();
	BasePage basePage = new BasePage();

	public DeleteSalesChannel() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.getInstance().getSalesChannel();
	}

	@When("^Ich loesche den Vertriebsweg$")
	public void ich_loesche_den_Vertriebsweg() throws Throwable {
		salesChannelMethods.clickDeleteSalesChannelButton();
	}

	@Then("^Der Vertriebsweg ist geloescht$")
	public void der_Vertriebsweg_ist_geloescht() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		assertEquals(0, driver.findElements(SalesChannelConstants.deleteButtonSelector).size());
	}

	@Then("^Der Vertriebsweg wird geloescht$")
	public void der_Vertriebsweg_wird_geloescht() throws Throwable {
		salesChannelMethods.searchSalesChannelName(salesChannelModel.getName());
		basePage.selectFirstElement(SalesChannelConstants.deleteButtonSelector);
	}
}
