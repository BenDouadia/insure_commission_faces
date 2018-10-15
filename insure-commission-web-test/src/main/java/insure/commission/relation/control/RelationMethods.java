package insure.commission.relation.control;

import org.openqa.selenium.WebDriver;

import insure.commission.relation.entity.RelationModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class RelationMethods {
	WebDriver driver;
	RelationModel relationModel = new RelationModel();
	BasePage basePage = new BasePage();

	public RelationMethods() {
		this.driver = Hook.getDriver();
		relationModel = RelationConfiguration.getInstance().getRelation();
	}

	public void setRelation() {
		try {
			basePage.selectDropdownByValue(relationModel.getSourceFunction(), RelationConstants.inputSourceFunctionSelector);

			driver.findElement(RelationConstants.inputSourceFunctionOneSelector).clear();
			driver.findElement(RelationConstants.inputSourceFunctionOneSelector).sendKeys(relationModel.getSourceFunctionOne());
			driver.findElement(RelationConstants.inputSourceFunctionOTwoSelector).clear();
			driver.findElement(RelationConstants.inputSourceFunctionOTwoSelector).sendKeys(relationModel.getSourceFunctionTwo());

			basePage.selectDropdownByValue(relationModel.getTargetRelation(), RelationConstants.inputTargetRelationSelector);
			basePage.selectDropdownByValue(relationModel.getTargetFunction(), RelationConstants.inputTargetFunctionSelector);

			driver.findElement(RelationConstants.inputTargetFunctionOneSelector).clear();
			driver.findElement(RelationConstants.inputTargetFunctionOneSelector).sendKeys(relationModel.getTargetFunction());
			driver.findElement(RelationConstants.inputTargetFunctionTwoSelector).clear();
			driver.findElement(RelationConstants.inputTargetFunctionTwoSelector).sendKeys(relationModel.getTargetFunctionTwo());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editRelation() {
		try {
			basePage.selectDropdownByValue(relationModel.getSourceFunction(), RelationConstants.editSourceFunctionSelector);

			driver.findElement(RelationConstants.editSourceFunctionOneSelector).clear();
			driver.findElement(RelationConstants.editSourceFunctionOneSelector).sendKeys(relationModel.getSourceFunctionOne());

			driver.findElement(RelationConstants.editSourceFunctionOTwoSelector).clear();
			driver.findElement(RelationConstants.editSourceFunctionOTwoSelector).sendKeys(relationModel.getSourceFunctionTwo());

			basePage.selectDropdownByValue(relationModel.getTargetRelation(), RelationConstants.editTargetRelationSelector);
			basePage.selectDropdownByValue(relationModel.getTargetFunction(), RelationConstants.editTargetFunctionSelector);

			driver.findElement(RelationConstants.editTargetFunctionOneSelector).clear();
			driver.findElement(RelationConstants.editTargetFunctionOneSelector).sendKeys(relationModel.getTargetFunctionOne());

			driver.findElement(RelationConstants.editTargetFunctionTwoSelector).clear();
			driver.findElement(RelationConstants.editTargetFunctionTwoSelector).sendKeys(relationModel.getTargetFunctionTwo());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addRelationButton() {
		driver.findElement(RelationConstants.addRelationButtonSelector).click();
	}

	public void saveRelationButton() {
		driver.findElement(RelationConstants.saveRelationButtonSelector).click();
	}

	public void quittRelationButton() {
		driver.findElement(RelationConstants.quitRelationButtonSelector).click();
	}

	public void editSaveRelationButton() {
		driver.findElement(RelationConstants.editSaveRelationButtonSelector).click();
	}

	public void editQuitRelationButton() {
		driver.findElement(RelationConstants.editQuitRelationButtonSelector).click();
	}

	public void deleteRelationButton() {
		driver.findElement(RelationConstants.deleteRelationButtonSelector).click();
	}

	public void deleteConfirmationRelationButton() {
		driver.findElement(RelationConstants.deleteConfirmationRelationButtonSelector).click();
	}

	public void deleteCancellationRelationButton() {
		driver.findElement(RelationConstants.deleteCancellationRelationButtonSelector).click();
	}

	public void editRelationButton() {
		driver.findElement(RelationConstants.editRelationButtonSelector).click();
	}
}
