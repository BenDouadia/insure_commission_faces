package insure.commission.relationship;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.relationship.control.RelationshipConfiguration;
import insure.commission.relationship.control.RelationshipConstants;
import insure.commission.relationship.control.RelationshipMethods;
import insure.commission.relationship.entity.RelationshipModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddRelationship {
	WebDriver driver;
	RelationshipModel relationshipModel = new RelationshipModel();
	RelationshipMethods relatioshipMethods = new RelationshipMethods();
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	SearchMethods searchMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddRelationship() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		relationshipModel = RelationshipConfiguration.buildRelationship();
		RelationshipConfiguration.getInstance().setRelationship(relationshipModel);
	}

	@Given("^Ich rufe die Zuordnung-Anlage auf$")
	public void ich_rufe_die_Zuordnung_Anlage_auf() throws Throwable {
		relatioshipMethods.editRelationshipButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Zuordnung aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Zuordnung_aus() throws Throwable {
		relatioshipMethods.setRelationship();
	}

	@When("^Ich speichere Zuordnung$")
	public void ich_speichere_Zuordnung() throws Throwable {
		relatioshipMethods.saveRelationshipButton();
	}

	@Then("^Die angelegte Daten fuer Zuordnung sind vorhanden$")
	public void die_angelegte_Daten_fuer_Zuordnung_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(relationshipModel.getGroup(), RelationshipConstants.outputGroupsSelector));
		assertTrue(basePage.checkIfValuesAreEqual(relationshipModel.getTag(), RelationshipConstants.outputTagsSelector));
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege eine Zuordnung an$")
	public void ich_lege_eine_Zuordnung_an() throws Throwable {
		searchMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		relatioshipMethods.editRelationshipButton();
		relatioshipMethods.setRelationship();
		relatioshipMethods.saveRelationshipButton();
	}
}
