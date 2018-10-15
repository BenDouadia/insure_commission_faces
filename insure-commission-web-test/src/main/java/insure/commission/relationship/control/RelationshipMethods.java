package insure.commission.relationship.control;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import insure.commission.relationship.entity.RelationshipModel;
import insure.commission.utility.Hook;

public class RelationshipMethods {

	WebDriver driver;
	RelationshipModel relationshipModel = new RelationshipModel();

	public RelationshipMethods() {
		this.driver = Hook.getDriver();
		relationshipModel = RelationshipConfiguration.getInstance().getRelationship();
	}

	public void setRelationship() {
		try {
			selectCheckBoxByValue(RelationshipConstants.inputGroupsSelector, relationshipModel.getGroup());
			selectCheckBoxByValue(RelationshipConstants.inputTagsSelector, relationshipModel.getTag());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editRelationship() {
		try {
			deselectCheckBoxByValue(RelationshipConstants.inputGroupsSelector, RelationshipConstants.inputNoElementSelector);
			selectCheckBoxByValue(RelationshipConstants.inputGroupsSelector, relationshipModel.getGroup());
			deselectCheckBoxByValue(RelationshipConstants.inputTagsSelector, RelationshipConstants.inputNoElementSelector);
			selectCheckBoxByValue(RelationshipConstants.inputTagsSelector, relationshipModel.getTag());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deselectRelationship() {
		try {
			deselectCheckBoxByValue(RelationshipConstants.inputGroupsSelector, RelationshipConstants.inputNoElementSelector);
			deselectCheckBoxByValue(RelationshipConstants.inputTagsSelector, RelationshipConstants.inputNoElementSelector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveRelationshipButton() {
		driver.findElement(RelationshipConstants.saveRelationshipButtonSelector).click();
	}

	public void quitRelationshipButton() {
		driver.findElement(RelationshipConstants.quitRelationshipButtonSelector).click();
	}

	public void editRelationshipButton() {
		driver.findElement(RelationshipConstants.editRelationshipButtonSelector).click();
	}

	public void selectCheckBoxByValue(String id, String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(
					By.xpath("//div[contains(@id,'" + id + "')]/div[1]/a//div[contains(text()," + "'" + value + "')]")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deselectCheckBoxByValue(String id, String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", driver.findElement(
					By.xpath("//div[contains(@id,'" + id + "')]/a[2]//div[contains(text()," + "'" + value + "')]")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
