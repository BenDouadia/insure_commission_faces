package insure.commission.communication;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.communication.control.CommunicationMethods;
import insure.commission.communication.entity.CommunicationModel;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteCommunicationPhone {

	WebDriver driver;
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	CommunicationModel communicationModel = new CommunicationModel();
	CommunicationMethods communicationMethods = new CommunicationMethods();
	BasePage basePage = new BasePage();

	public DeleteCommunicationPhone() {
		this.driver = Hook.getDriver();
	}

	@When("^Ich loesche die Kommunikation$")
	public void ich_loesche_die_Kommunikation() throws Throwable {
		communicationMethods.deleteCommunicationButton();
	}

	@Then("^Die Kommunikation-Telefon ist geloescht$")
	public void die_Kommunikation_Telefon_ist_geloescht() throws Throwable {
		String phoneNumber = communicationMethods.buildPhoneNumber(communicationModel.getAreaCode(), communicationModel.getNumber());
		assertFalse(basePage.checkIfValueExist(phoneNumber));
		masterdataMethods.searchMasterdataButton();
	}
}
