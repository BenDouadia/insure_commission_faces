package insure.commission.communication;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import insure.commission.communication.entity.CommunicationModel;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteCommunicationSocialNetwork {

	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	CommunicationModel communicationModel = new CommunicationModel();
	BasePage basePage = new BasePage();

	public DeleteCommunicationSocialNetwork() {
		this.driver = Hook.getDriver();
	}

	@Then("^Die Kommunikation-Soziale-Netzwerke ist geloescht$")
	public void die_Kommunikation_Soziale_Netzwerke_ist_geloescht() throws Throwable {
	}

}
