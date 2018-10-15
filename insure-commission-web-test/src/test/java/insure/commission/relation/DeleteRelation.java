package insure.commission.relation;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import insure.commission.masterdata.control.MasterdataMethods;
import insure.commission.relation.control.RelationConfiguration;
import insure.commission.relation.control.RelationConstants;
import insure.commission.relation.control.RelationMethods;
import insure.commission.relation.entity.RelationModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class DeleteRelation {
	WebDriver driver;
	RelationModel relationModel = new RelationModel();
	RelationMethods relationMethods = new RelationMethods();
	MasterdataMethods masterdataMethods = new MasterdataMethods();
	BasePage basePage = new BasePage();

	public DeleteRelation() {
		this.driver = Hook.getDriver();
		relationModel = RelationConfiguration.getInstance().getRelation();
	}

	@When("^Ich loesche die Beziehung$")
	public void ich_loesche_die_Beziehung() throws Throwable {
		relationMethods.deleteRelationButton();
		relationMethods.deleteConfirmationRelationButton();
	}

	@Then("^Die Beziehung ist geloescht$")
	public void die_Beziehung_ist_geloescht() throws Throwable {
		assertFalse(basePage.checkIfValueExist(RelationConstants.outputTargetFunctionSelector));
		masterdataMethods.searchMasterdataButton();
	}

}
