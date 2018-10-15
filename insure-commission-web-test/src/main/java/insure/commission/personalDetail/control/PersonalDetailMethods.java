package insure.commission.personalDetail.control;

import org.openqa.selenium.WebDriver;

import insure.commission.personalDetail.entity.PersonalDetailModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class PersonalDetailMethods {

	WebDriver driver;
	PersonalDetailModel personalDetailModel = new PersonalDetailModel();
	BasePage basePage = new BasePage();

	public PersonalDetailMethods() {
		this.driver = Hook.getDriver();
		personalDetailModel = PersonalDetailConfiguration.getInstance().getPersonalDetail();
	}

	public void initializePersonalDetail() {
		try {
			driver.findElement(PersonalDetailConstants.inputDateOfBirthSelector).clear();
			driver.findElement(PersonalDetailConstants.inputDateOfBirthSelector).sendKeys(personalDetailModel.getDateOfBirth());

			driver.findElement(PersonalDetailConstants.inputDateOfDeathSelector).clear();
			driver.findElement(PersonalDetailConstants.inputDateOfDeathSelector).sendKeys(personalDetailModel.getDateOfDeath());

			driver.findElement(PersonalDetailConstants.inputNameAtBirthSelector).clear();
			driver.findElement(PersonalDetailConstants.inputNameAtBirthSelector).sendKeys(personalDetailModel.getNameAtBirth());

			driver.findElement(PersonalDetailConstants.inputPlaceOfBirthSelector).clear();
			driver.findElement(PersonalDetailConstants.inputPlaceOfBirthSelector).sendKeys(personalDetailModel.getPlaceOfBirth());

			basePage.selectDropdownByValue(personalDetailModel.getMaritalStatus(), PersonalDetailConstants.inputMaritalStatusSelector);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editPersonalDetailButton() {
		driver.findElement(PersonalDetailConstants.editPersonalDetailButtonSelector).click();
	}

	public void savePersonalDetailButton() {
		driver.findElement(PersonalDetailConstants.savePersonalDetailButtonSelector).click();
	}

	public void quitPersonalDetailButton() {
		driver.findElement(PersonalDetailConstants.quitPersonalDetailButtonSelector).click();
	}

	public void masterdataButton() {
		driver.findElement(PersonalDetailConstants.masterdataButtonSelector).click();
	}
}
