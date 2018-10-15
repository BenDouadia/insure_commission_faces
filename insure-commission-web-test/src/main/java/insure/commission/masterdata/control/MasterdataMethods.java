package insure.commission.masterdata.control;

import org.openqa.selenium.WebDriver;

import insure.commission.masterdata.entity.MasterdataModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class MasterdataMethods {

	WebDriver driver;
	MasterdataModel masterdataModel = new MasterdataModel();
	BasePage basePage = new BasePage();

	public MasterdataMethods() {
		this.driver = Hook.getDriver();
		masterdataModel = MasterdataConfiguration.getInstance().getMasterdata();
	}

	public void initializeMasterdata() {
		try {
			basePage.selectDropdownByValue(masterdataModel.getType().toString(), MasterdataConstants.inputTypeSelector);
			basePage.selectRadioButtonByValue(masterdataModel.getGender());
			basePage.selectDropdownByValue(masterdataModel.getTitle(), MasterdataConstants.inputTitelSelector);

			basePage.waitForElement(driver, MasterdataConstants.inputFirstNameSelector).sendKeys(masterdataModel.getFirstName());


//			driver.findElement(MasterdataConstants.inputFirstNameSelector).clear();
//			driver.findElement(MasterdataConstants.inputFirstNameSelector).sendKeys(masterdataModel.getFirstName());

			driver.findElement(MasterdataConstants.inputNameSelector).clear();
			driver.findElement(MasterdataConstants.inputNameSelector).sendKeys(masterdataModel.getName());

			driver.findElement(MasterdataConstants.inputAdditionalNameOneSelector).clear();
			driver.findElement(MasterdataConstants.inputAdditionalNameOneSelector).sendKeys(masterdataModel.getAdditionalNameOne());

			basePage.selectDropdownByValue(masterdataModel.getLanguage(), MasterdataConstants.inputLanguageSelector);
			basePage.selectDropdownByValue(masterdataModel.getCommentOne(), MasterdataConstants.inputCommentOneSelector);
			basePage.selectDropdownByValue(masterdataModel.getCommentTwo(), MasterdataConstants.inputCommentTwoSelector);
			basePage.selectDropdownByValue(masterdataModel.getCategory(), MasterdataConstants.inputCategorySelector);

			driver.findElement(MasterdataConstants.inputPersonalSalutationSelector).clear();
			driver.findElement(MasterdataConstants.inputPersonalSalutationSelector).sendKeys(masterdataModel.getPersonalSalutation());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editMasterdata() {
		try {
			driver.findElement(MasterdataConstants.editNameSelector).clear();
			driver.findElement(MasterdataConstants.editNameSelector).sendKeys(masterdataModel.getName());

			driver.findElement(MasterdataConstants.editFirstNameSelector).clear();
			driver.findElement(MasterdataConstants.editFirstNameSelector).sendKeys(masterdataModel.getFirstName());

			basePage.selectDropdownByValue(masterdataModel.getTitle(), MasterdataConstants.editTitelSelector);
			basePage.selectDropdownByValue(masterdataModel.getGender().toString(), MasterdataConstants.editGenderSelector);

			driver.findElement(MasterdataConstants.editAdditionalNameOneSelector).clear();
			driver.findElement(MasterdataConstants.editAdditionalNameOneSelector).sendKeys(masterdataModel.getAdditionalNameOne());

			driver.findElement(MasterdataConstants.editAdditionalNameTwoSelector).clear();
			driver.findElement(MasterdataConstants.editAdditionalNameTwoSelector).sendKeys(masterdataModel.getAdditionalNameTwo());

			basePage.selectDropdownByValue(masterdataModel.getNationality(), MasterdataConstants.editNationalitySelector);
			basePage.selectDropdownByValue(masterdataModel.getLanguage(), MasterdataConstants.editLanguageSelector);
			basePage.selectDropdownByValue(masterdataModel.getCommentOne(), MasterdataConstants.editCommentOneSelector);
			basePage.selectDropdownByValue(masterdataModel.getCommentTwo(), MasterdataConstants.editCommentTwoSelector);

			driver.findElement(MasterdataConstants.editPersonalSalutationSelector).clear();
			driver.findElement(MasterdataConstants.editPersonalSalutationSelector).sendKeys(masterdataModel.getPersonalSalutation());

			basePage.selectDropdownByValue(masterdataModel.getCategory(), MasterdataConstants.editCategorySelector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSaveButton() {
		driver.findElement(MasterdataConstants.saveButtonSelector).click();
	}

	public void clickEditButton() {
		driver.findElement(MasterdataConstants.editButtonSelector).click();
	}

	public void editSaveMasterdataButton() {
		driver.findElement(MasterdataConstants.editSaveButtonSelector).click();
	}

	public void editQuitMasterdataButton() {
		driver.findElement(MasterdataConstants.editQuitButtonSelector).click();
	}

	public void personalDetailButton() {
		driver.findElement(MasterdataConstants.personalDetailButtonSelector).click();
	}

	public void searchMasterdataButton() {
		driver.findElement(MasterdataConstants.searchButtonSelector).click();
	}

	public void quitMasterdataButton() {
		driver.findElement(MasterdataConstants.quitButtonSelector).click();
	}

	public void backButton() {
		driver.findElement(MasterdataConstants.backButtonSelector).click();
	}

	public void addExternalSalespartnerButton() {
		driver.findElement(MasterdataConstants.addExternalSalespartnerButtonSelector).click();
	}

	public void addAddressAndCommunicatioButton() {
		driver.findElement(MasterdataConstants.addAddressAndCommunicationButtonSelector).click();
	}
}
