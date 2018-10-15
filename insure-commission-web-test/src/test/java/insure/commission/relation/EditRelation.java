package insure.commission.relation;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataConfiguration;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.relation.control.RelationConfiguration;
import insure.commission.relation.control.RelationConstants;
import insure.commission.relation.control.RelationMethods;
import insure.commission.relation.entity.RelationModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class EditRelation {
	WebDriver driver;
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	MasterdataModel masterdataModel = new MasterdataModel();
	RelationModel relationModel = new RelationModel();
	RelationMethods relationMethods = new RelationMethods();
	BasePage basePage = new BasePage();

	public EditRelation() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.getInstance().getMasterdata();
		relationModel = RelationConfiguration.editRelation();
		RelationConfiguration.getInstance().setRelation(relationModel);
	}

	@Given("^Ich rufe die Beziehung-Bearbeiten-Maske auf$")
	public void ich_rufe_die_Beziehung_Bearbeiten_Maske_auf() throws Throwable {
		relationMethods.editRelation();
	}

	@Given("^Ich aendere die Beziehung$")
	public void ich_aendere_die_Beziehung() throws Throwable {
		relationMethods.editRelation();
	}

	@When("^Ich speichere die Aenderung fuer Beziehung$")
	public void ich_speichere_die_Aenderung_fuer_Beziehung() throws Throwable {
		relationMethods.editSaveRelationButton();
	}

	@Then("^Die Beziehung ist geaendert$")
	public void die_Beziehung_ist_geaendert() throws Throwable {
		assertTrue(basePage.checkIfValuesAreEqual(relationModel.getSourceFunction(), RelationConstants.outputSourceFunctionSelector));
		assertTrue(basePage.checkIfValuesAreEqual(relationModel.getTargetFunction(), RelationConstants.outputTargetFunctionSelector));
		assertTrue(basePage.checkIfValuesAreEqual(relationModel.getTargetRelation(), RelationConstants.outputTargetRelationSelector));
		masterdataMethods.searchMasterdataButton();
	}

}
