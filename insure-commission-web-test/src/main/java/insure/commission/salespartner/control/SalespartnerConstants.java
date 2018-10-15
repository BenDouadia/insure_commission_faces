package insure.commission.salespartner.control;

import org.openqa.selenium.By;

public interface SalespartnerConstants {

	By outputParentNumberSelector = By.id("insure-main-form:fieldset-salesPartner-parent:output-parent-number:output");
	By outputParentNameSelector = By.id("insure-main-form:fieldset-salesPartner-parent:output-name:output");
	By outputParentFirstNameSelector = By.id("insure-main-form:fieldset-salesPartner-parent:output-firstName:output");
	By outputMainAccountNumberSelector = By.id("insure-main-form:fieldset-mainAccountHistory:output-number:output");
	By outputMainAccountNameSelector = By.id("insure-main-form:fieldset-mainAccountHistory:output-name:output");
	By outputMainAccountFirstNameSelector = By.id("insure-main-form:fieldset-mainAccountHistory:output-firstName:output");
	By outputDateOfEntranceSelector = By.id("insure-main-form:fieldset-statusTime:output-entrance:output");

	By outputSalespartnerNnumberSelector = By.xpath("//td[contains(@id, 'spNumber')]");
	By outputSaleschannelSelector = By.id("insure-main-form:fieldset-assignment:output-salesChannelName:output");
	By outputOrganizationRoleSelector = By.id("insure-main-form:fieldset-assignment:output-salesChannelRolle:output");
	By outputStatusSelector = By.xpath("//td[contains(@id, 'salesPartnerStatus')]");

	By editParentSelector = By.id("insure-main-form:fieldset-salesPartner-parent:parentEditSection:input-parent:select");
	By editParentDateOfEntranceSelector = By.id("insure-main-form:fieldset-salesPartner-parent:parentEditSection:input-dateOfChange:inputInputDate");
	By editSaleschannelSelector = By.id("insure-main-form:fieldset-assignment:organizationRoleEditSection:input-saleschannel:select");
	By editOrganizationRoleSelector = By.id("insure-main-form:fieldset-assignment:organizationRoleEditSection:input-organizationrole:select");
	By editMainAccountSelector = By.id("insure-main-form:fieldset-mainAccountHistory:mainAccountEditSection:input-mainAccount:select");
	By editMainAccountDateOfEntranceSelector = By.id("insure-main-form:fieldset-mainAccountHistory:mainAccountEditSection:input-dateOfChange:inputInputDate");

	By inputReasonOfTerminationSelector = By.id("insure-main-form:fieldset-cancellationInput:input-reasonOfTermination:select");
	By inputDateOfTerminationSelector = By.id("insure-main-form:fieldset-cancellationInput:input-dateOfChange:inputInputDate");
	By inputDateOfReactivationSelector = By.id("insure-main-form:fieldset-cancellationInput:input-dateOfChange:inputInputDate");

	By inputSaleschannelSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-saleschannel:select");
	By inputOrganizationRoleSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-organizationRole:select");
	By inputParentSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-parent:select");
	By inputMainAccountSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-mainAccount:select");
	By inputSalespartnerNnumberSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-number:input");
	By inputDateOfEntranceSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-dateOfEntrance:inputInputDate");

	By addSalespartnerButtonSelector = By.id("insure-main-form:fieldset-salespartnerinformation:action-add-salespartner:button");
	By saveSalespartnerButtonSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-addSection-speichern:button");
	By quitSalespartnerButtonSelector = By.id("insure-main-form:salespartner:fieldset-salespartner:addSection:input-addSection-abbrechen:button");
	By showsalespartnerButtonSelector = By.xpath("//input[contains(@id, 'viewButton-salesPartner:button')]");

	By showParentSalespartnerButtonSelector = By.id("insure-main-form:fieldset-salesPartner-parent:viewParentButton:button");
	By changeParentSalespartnerButtonSelector = By.id("insure-main-form:fieldset-salesPartner-parent:button-change:button");
	By showAssignmentButtonSelector = By.id("insure-main-form:fieldset-assignment:view-assignment:button");
	By changeAssignmentButtonSelector = By.id("insure-main-form:fieldset-assignment:button-change:button");
	By showStatusTimeButtonSelector = By.id("insure-main-form:fieldset-statusTime:button-viewStatusTime:button");
	By showMainAccountButtonSelector = By.id("insure-main-form:fieldset-mainAccountHistory:button-viewMainAccountButton:button");
	By changeMainAccountButtonSelector = By.id("insure-main-form:fieldset-mainAccountHistory:button-change:button");
	By returnSalespartnerButtonSelector = By.id("insure-main-form:button-masterDataShow:button");
	By changeLogShowButtonSelector = By.id("insure-main-form:button-changeLogShow:button");
	By externalSystemIdButtonSelector = By.id("insure-main-form:button-externalMappingShow:button");

	By editSaveParentButtonSelector = By.id("insure-main-form:fieldset-salesPartner-parent:parentEditSection:saveButton:button");
	By editQuitParentButtonSelector = By.id("insure-main-form:fieldset-salesPartner-parent:parentEditSection:cancelButton:button");
	By editSaveAssignmentButtonSelector = By.id("insure-main-form:fieldset-assignment:organizationRoleEditSection:saveButton:button");
	By editQuitAssignmentButtonSelector = By.id("insure-main-form:fieldset-assignment:organizationRoleEditSection:cancelButton:button");
	By editSaveMainAccountButtonSelector = By.id("insure-main-form:fieldset-mainAccountHistory:mainAccountEditSection:saveButton:button");
	By editQuitMainAccountButtonSelector = By.id("insure-main-form:fieldset-mainAccountHistory:mainAccountEditSection:cancelButton:button");

	By contractCancellationButtonSelector = By.id("insure-main-form:headerContainer-salesPartner:button-terminate:button");
	By saveContractCancellationButtonSelector = By.id("insure-main-form:button-save:button");
	By quitContractCancellationButtonSelector = By.id("insure-main-form:button-reset:button");

	By contractReactiviteButtonSelector = By.id("insure-main-form:headerContainer-salesPartner:button-reactivate:button");
	By saveContractReactivationButtonSelector = By.id("insure-main-form:button-save:button");
	By quitContractReactivationButtonSelector = By.id("insure-main-form:button-reset:button");

}
