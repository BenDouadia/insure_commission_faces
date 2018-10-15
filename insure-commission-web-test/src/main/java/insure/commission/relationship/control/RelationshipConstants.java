package insure.commission.relationship.control;

import org.openqa.selenium.By;

public interface RelationshipConstants {

	String inputNoElementSelector = "Keine zugeordnet";
	String inputGroupsSelector = "insure-main-form:relationship:fieldset-relationship:editSection:input-groups:selectMany:body:list";
	String inputTagsSelector = "insure-main-form:relationship:fieldset-relationship:editSection:input-tags:selectMany:body:list";

	By outputGroupsSelector = By.id("insure-main-form:relationship:fieldset-relationship:output-groups:output");
	By outputTagsSelector = By.id("insure-main-form:relationship:fieldset-relationship:output-tags:output");

	By editRelationshipButtonSelector = By.id("insure-main-form:relationship:fieldset-relationship:button-relationship-bearbeiten:button");
	By saveRelationshipButtonSelector = By.id("insure-main-form:relationship:fieldset-relationship:editSection:input-editSection-speichern:button");
	By quitRelationshipButtonSelector = By.id("insure-main-form:relationship:fieldset-relationship:editSection:input-editSection-abbrechen:button");

}
