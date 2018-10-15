package insure.commission.dashboard.control;

import org.openqa.selenium.By;

public interface SearchConstants {
	By showMasterdataSelector = By.xpath("//input[contains(@class, 'insure-icon-button insure-icon-view insure-action-button insure-card-action-btn mousetrap')]");
	By masterdataSearchNumberSelector = By.id("insure-main-form:container-masterDataSearch:fieldset-masterDataSearch-common:input-number:input");
	By masterdataSearchSpNumberSelector = By.id("insure-main-form:container-masterDataSearch:fieldset-masterDataSearch-common:input-spNumber:input");
	By masterdataSearchUNumberSelector = By.id("insure-main-form:container-masterDataSearch:fieldset-masterDataSearch-common:input-uNumber:input");
	By masterdataSearchNameSelector = By.id("insure-main-form:container-masterDataSearch:fieldset-masterDataSearch-person:input-name:input");
	By masterdataSearchFitstNameSelector = By.id("insure-main-form:container-masterDataSearch:fieldset-masterDataSearch-person:input-firstName:input");
	By masterdataSearchZipCodeSelector = By.id("");
	By masterdataSearchCitySelector = By.id("");
	By masterdataSearchEmailSelector = By.id("");
	By masterdataSearchPhoneSelector = By.id("");
	By masterdataSearchCategorySelector = By.id("");
	By masterdataSearchCommentOneSelector = By.id("");
	By masterdataSearchCommentTwoSelector = By.id("");

	By createMasterdataButtonSelector = By.id("insure-main-form:add-masterData:button");
	By searchButtonSelector = By.id("insure-main-form:action-search:button");
	By deleteMasterdataSelector = By.xpath("//input[contains(@class,'insure-icon-button insure-icon-delete insure-action-button insure-card-action-btn mousetrap')]");
}
