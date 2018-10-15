package insure.commission.relationship;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.relationship.control.RelationshipConfiguration;
import insure.commission.relationship.control.RelationshipConstants;
import insure.commission.relationship.control.RelationshipMethods;
import insure.commission.relationship.entity.RelationshipModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditRelationship {
	WebDriver driver;
	RelationshipModel relationshipModel = new RelationshipModel();
	RelationshipMethods relatioshipMethods = new RelationshipMethods();
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public EditRelationship() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.getInstance().getMasterdata();
		relationshipModel = RelationshipConfiguration.editRelationship();
		RelationshipConfiguration.getInstance().setRelationship(relationshipModel);
	}

	@Given("^Ich rufe die Zuordnung-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Zuordnung_Bearbeiten_Maske_auf() throws Throwable {
		relatioshipMethods.editRelationshipButton();
	}

	@Given("^Ich aendere die Zuordnung$")
	public void ich_aendere_die_Zuordnung() throws Throwable {
		relatioshipMethods.editRelationship();
	}

	@When("^Ich speichere die Aenderung fuer Zuordnung$")
	public void ich_speichere_die_Aenderung_fuer_Zuordnung() throws Throwable {
		relatioshipMethods.saveRelationshipButton();
	}

	@Then("^Die Zuordnung ist geaendert$")
	public void die_Zuordnung_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(relationshipModel.getGroup(), RelationshipConstants.outputGroupsSelector));
		assertTrue(basePage.checkIfValuesAreEqual(relationshipModel.getTag(), RelationshipConstants.outputTagsSelector));
		masterdataMethods.searchMasterdataButton();
	}
}
