package insure.commission.relationship;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.relationship.control.RelationshipConfiguration;
import insure.commission.relationship.control.RelationshipConstants;
import insure.commission.relationship.control.RelationshipMethods;
import insure.commission.relationship.entity.RelationshipModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteRelationship {
	WebDriver driver;
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	RelationshipModel relationshipModel = new RelationshipModel();
	RelationshipMethods relatioshipMethods = new RelationshipMethods();
	BasePage basePage = new BasePage();

	public DeleteRelationship() {
		this.driver = Hook.getDriver();
		relationshipModel = RelationshipConfiguration.getInstance().getRelationship();
	}

	@When("^Ich loesche die Zuordnung$")
	public void ich_loesche_die_Zuordnung() throws Throwable {
		relatioshipMethods.editRelationshipButton();
		relatioshipMethods.deselectRelationship();
		relatioshipMethods.saveRelationshipButton();
	}

	@Then("^Die Zuordnung ist geloescht$")
	public void die_Zuordnung_ist_geloescht() throws Throwable {
		assertFalse(basePage.checkIfValuesAreEqual(relationshipModel.getGroup(), RelationshipConstants.outputGroupsSelector));
		masterdataMethods.searchMasterdataButton();
	}
}
