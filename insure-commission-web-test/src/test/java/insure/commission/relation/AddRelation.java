package insure.commission.relation;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.dashboard.control.SearchMethods;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.relation.control.RelationConfiguration;
import insure.commission.relation.control.RelationConstants;
import insure.commission.relation.control.RelationMethods;
import insure.commission.relation.entity.RelationModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class AddRelation {
	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	RelationModel relationModel = new RelationModel();
	RelationMethods relationMethods = new RelationMethods();
	SearchMethods searchaMethods = new SearchMethods();
	BasePage basePage = new BasePage();

	public AddRelation() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.buildMasterdata();
		MasterdataConfiguration.getInstance().setMasterdata(masterdataModel);
		relationModel = RelationConfiguration.buildRelation();
		RelationConfiguration.getInstance().setRelation(relationModel);
	}

	@Given("^Ich rufe die Beziehung-Anlage auf$")
	public void ich_rufe_die_Beziehung_Anlage_auf() throws Throwable {
		relationMethods.addRelationButton();
	}

	@Given("^Ich fuelle die Pflichfelder fuer Beziehung aus$")
	public void ich_fuelle_die_Pflichfelder_fuer_Beziehung_aus() throws Throwable {
		relationMethods.setRelation();
	}

	@When("^Ich speichere Beziehung$")
	public void ich_speichere_Beziehung() throws Throwable {
		relationMethods.saveRelationButton();
	}

	@Then("^Die angelegte Daten fuer Beziehung sind vorhanden$")
	public void die_angelegte_Daten_fuer_Beziehung_sind_vorhanden() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(relationModel.getSourceFunction(), RelationConstants.outputSourceFunctionSelector));
		assertTrue(basePage.checkIfValuesAreEqual(relationModel.getTargetFunction(), RelationConstants.outputTargetFunctionSelector));
		assertTrue(basePage.checkIfValuesAreEqual(relationModel.getTargetRelation(), RelationConstants.outputTargetRelationSelector));
		masterdataMethods.searchMasterdataButton();
	}

	@Given("^Ich lege eine Beziehung an$")
	public void ich_lege_eine_Beziehung_an() throws Throwable {
		searchaMethods.createMasterdataButton();
		masterdataMethods.initializeMasterdata();
		masterdataMethods.clickSaveButton();
		relationMethods.addRelationButton();
		relationMethods.setRelation();
		relationMethods.saveRelationButton();
	}
}
