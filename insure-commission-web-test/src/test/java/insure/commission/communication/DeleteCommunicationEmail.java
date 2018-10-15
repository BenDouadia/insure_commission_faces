package insure.commission.communication;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import insure.commission.communication.entity.CommunicationModel;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteCommunicationEmail {
	BasePage basePage = new BasePage();

	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	CommunicationModel communicationModel = new CommunicationModel();

	public DeleteCommunicationEmail() {
		this.driver = Hook.getDriver();
	}

	@Then("^Die Kommunikation-E-Mail ist geloescht$")
	public void die_Kommunikation_E_Mail_ist_geloescht() throws Throwable {

	}
}
