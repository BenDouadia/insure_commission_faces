package insure.commission.relation.control;

import org.openqa.selenium.By;

public interface RelationConstants {

	By inputSourceFunctionSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-source-function:select");
	By inputSourceFunctionOneSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-source-function-one:input");
	By inputSourceFunctionOTwoSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-source-function-two:input");
	By inputTargetRelationSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-target:select");
	By inputTargetFunctionSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-target-function:select");
	By inputTargetFunctionOneSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-target-function-one:input");
	By inputTargetFunctionTwoSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-target-function-two:input");

	By editSourceFunctionSelector = By.id("");
	By editSourceFunctionOneSelector = By.id("");
	By editSourceFunctionOTwoSelector = By.id("");
	By editTargetRelationSelector = By.id("");
	By editTargetFunctionSelector = By.id("");
	By editTargetFunctionOneSelector = By.id("");
	By editTargetFunctionTwoSelector = By.id("");

	By outputSourceFunctionSelector = By.id("insure-main-form:fieldset-relationship:relationships:0:card-relationship:relationship-source-function:output");
	By outputSourceFunctionOneSelector = By.id("");
	By outputSourceFunctionOTwoSelector = By.id("");
	By outputTargetRelationSelector = By.id("insure-main-form:fieldset-relationship:relationships:0:card-relationship:relationship-target:output");
	By outputTargetFunctionSelector = By.id("insure-main-form:fieldset-relationship:relationships:0:card-relationship:relationship-target-function:output");
	By outputTargetFunctionOneSelector = By.id("");
	By outputTargetFunctionTwoSelector = By.id("");

	By addRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:action-add-relationship:link");
	By deleteRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:relationships:0:card-relationship:action-delete-relationship:button");
	By deleteConfirmationRelationButtonSelector = By.xpath("//input[contains(@id, 'input-relationship-delete-save:button')]");
	By deleteCancellationRelationButtonSelector = By.xpath("//input[contains(@id, 'input-relationship-delete-discard:button')]");
	By saveRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-add-save:button");
	By quitRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-add-discard:button");

	By editRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:relationships:0:card-relationship:action-edit-relationship:button");
	By editSaveRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-add-save:button");
	By editQuitRelationButtonSelector = By.id("insure-main-form:fieldset-relationship:fieldset-relationshipAdd:input-relationship-add-discard:button");

}
