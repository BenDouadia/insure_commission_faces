package insure.commission.salesChannel.control;

import org.openqa.selenium.WebDriver;

import insure.commission.salesChannel.entity.SalesChannelModel;
import insure.commission.utility.BasePage;
import insure.commission.utility.Hook;

public class SalesChannelMethods {
	WebDriver driver;
	BasePage basePage = new BasePage();
	SalesChannelModel salesChannelModel = new SalesChannelModel();

	public SalesChannelMethods() {
		this.driver = Hook.getDriver();
		salesChannelModel = SalesChannelConfiguration.getInstance().getSalesChannel();
	}

	public void initializeSalesChannel() {
		try {

			driver.findElement(SalesChannelConstants.inputNumberSelector).clear();
			driver.findElement(SalesChannelConstants.inputNumberSelector).sendKeys(salesChannelModel.getNumber());

			driver.findElement(SalesChannelConstants.inputShortNameSelector).clear();
			driver.findElement(SalesChannelConstants.inputShortNameSelector).sendKeys(salesChannelModel.getShortName());

			driver.findElement(SalesChannelConstants.inputNameSelector).clear();
			driver.findElement(SalesChannelConstants.inputNameSelector).sendKeys(salesChannelModel.getName());

			driver.findElement(SalesChannelConstants.inputCompanyNameSelector).clear();
			driver.findElement(SalesChannelConstants.inputCompanyNameSelector).sendKeys(salesChannelModel.getCompanyName());

			driver.findElement(SalesChannelConstants.inputExecutiveNameSelector).clear();
			driver.findElement(SalesChannelConstants.inputExecutiveNameSelector).sendKeys(salesChannelModel.getExecutiveName());

			driver.findElement(SalesChannelConstants.inputTradeRegisterSelector).clear();
			driver.findElement(SalesChannelConstants.inputTradeRegisterSelector).sendKeys(salesChannelModel.getTradeRegister());

			driver.findElement(SalesChannelConstants.inputCreditorIdSelector).clear();
			driver.findElement(SalesChannelConstants.inputCreditorIdSelector).sendKeys(salesChannelModel.getCreditorId());

			basePage.selectDropdownByValue(salesChannelModel.getCountry(), SalesChannelConstants.inputCountrySelector);

			driver.findElement(SalesChannelConstants.inputZipcodeSelector).clear();
			driver.findElement(SalesChannelConstants.inputZipcodeSelector).sendKeys(salesChannelModel.getZipcode());

			driver.findElement(SalesChannelConstants.inputCitySelector).clear();
			driver.findElement(SalesChannelConstants.inputCitySelector).sendKeys(salesChannelModel.getCity());

			driver.findElement(SalesChannelConstants.inputStreetSelector).clear();
			driver.findElement(SalesChannelConstants.inputStreetSelector).sendKeys(salesChannelModel.getStreet());

			driver.findElement(SalesChannelConstants.inputHouseNumberSelector).clear();
			driver.findElement(SalesChannelConstants.inputHouseNumberSelector).sendKeys(salesChannelModel.getHouseNumber());

			basePage.selectDropdownByValue(salesChannelModel.getLanguage(), SalesChannelConstants.inputLanguageSelector);
			basePage.selectDropdownByValue(salesChannelModel.getCurrency(), SalesChannelConstants.inputCurrencySelector);

			driver.findElement(SalesChannelConstants.inputContractStatusSelector).clear();
			driver.findElement(SalesChannelConstants.inputContractStatusSelector).sendKeys(salesChannelModel.getContractStatus());

			driver.findElement(SalesChannelConstants.inputContractFormSelector).clear();
			driver.findElement(SalesChannelConstants.inputContractFormSelector).sendKeys(salesChannelModel.getContractForm());

			driver.findElement(SalesChannelConstants.inputProbationTimeSelector).clear();
			driver.findElement(SalesChannelConstants.inputProbationTimeSelector).sendKeys(salesChannelModel.getProbationTime());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void editSalesChannel() {
		try {

			driver.findElement(SalesChannelConstants.editNumberSelector).clear();
			driver.findElement(SalesChannelConstants.editNumberSelector).sendKeys(salesChannelModel.getNumber());

			driver.findElement(SalesChannelConstants.editShortNameSelector).clear();
			driver.findElement(SalesChannelConstants.editShortNameSelector).sendKeys(salesChannelModel.getShortName());

//			driver.findElement(SalesChannelConstants.editNameSelector).clear();
//			driver.findElement(SalesChannelConstants.editNameSelector).sendKeys(salesChannelModel.getName());

			driver.findElement(SalesChannelConstants.editCompanyNameSelector).clear();
			driver.findElement(SalesChannelConstants.editCompanyNameSelector).sendKeys(salesChannelModel.getCompanyName());

			driver.findElement(SalesChannelConstants.editExecutiveNameSelector).clear();
			driver.findElement(SalesChannelConstants.editExecutiveNameSelector).sendKeys(salesChannelModel.getExecutiveName());

			driver.findElement(SalesChannelConstants.editTradeRegisterSelector).clear();
			driver.findElement(SalesChannelConstants.editTradeRegisterSelector).sendKeys(salesChannelModel.getTradeRegister());

			driver.findElement(SalesChannelConstants.editCreditorIdSelector).clear();
			driver.findElement(SalesChannelConstants.editCreditorIdSelector).sendKeys(salesChannelModel.getCreditorId());

			basePage.selectDropdownByValue(salesChannelModel.getCountry(), SalesChannelConstants.editCountrySelector);

			driver.findElement(SalesChannelConstants.editZipcodeSelector).clear();
			driver.findElement(SalesChannelConstants.editZipcodeSelector).sendKeys(salesChannelModel.getZipcode());

			driver.findElement(SalesChannelConstants.editCitySelector).clear();
			driver.findElement(SalesChannelConstants.editCitySelector).sendKeys(salesChannelModel.getCity());

			driver.findElement(SalesChannelConstants.editStreetSelector).clear();
			driver.findElement(SalesChannelConstants.editStreetSelector).sendKeys(salesChannelModel.getStreet());

			driver.findElement(SalesChannelConstants.editHouseNumberSelector).clear();
			driver.findElement(SalesChannelConstants.editHouseNumberSelector).sendKeys(salesChannelModel.getHouseNumber());

			basePage.selectDropdownByValue(salesChannelModel.getLanguage(), SalesChannelConstants.editLanguageSelector);
			basePage.selectDropdownByValue(salesChannelModel.getCurrency(), SalesChannelConstants.editCurrencySelector);

			driver.findElement(SalesChannelConstants.editContractStatusSelector).clear();
			driver.findElement(SalesChannelConstants.editContractStatusSelector).sendKeys(salesChannelModel.getContractStatus());

			driver.findElement(SalesChannelConstants.editContractFormSelector).clear();
			driver.findElement(SalesChannelConstants.editContractFormSelector).sendKeys(salesChannelModel.getContractForm());

			driver.findElement(SalesChannelConstants.editProbationTimeSelector).clear();
			driver.findElement(SalesChannelConstants.editProbationTimeSelector).sendKeys(salesChannelModel.getProbationTime());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickSalesChannelButton() {
		driver.findElement(SalesChannelConstants.salesChannelButtonSelector).click();
	}

	public void clickAddSalesChannelButton() {
		driver.findElement(SalesChannelConstants.addButtonSelector).click();
	}

	public void clickInputSaveSalesChannelButton() {
		driver.findElement(SalesChannelConstants.inputSaveButtonSelector).click();
	}

	public void clickEditSaveSalesChannelButton() {
		driver.findElement(SalesChannelConstants.editSaveButtonSelector).click();
	}

	public void clickShowSalesChannelButton() {
		driver.findElement(SalesChannelConstants.showButtonSelector).click();
	}

	public void clickDeleteSalesChannelButton() {
		driver.findElement(SalesChannelConstants.deleteButtonSelector).click();
	}

	public void clickSearchSalesChannelButton() {
		driver.findElement(SalesChannelConstants.searchButtonSelector).click();
	}

	public void clickLogoutSalesChannelButton() {
		driver.findElement(SalesChannelConstants.logoutButtonSelector).click();
	}

	public void clickReturnSalesChannelButton() {
		driver.findElement(SalesChannelConstants.returnButtonSelector).click();
	}

	public void clickQuitSalesChannelButton() {
		driver.findElement(SalesChannelConstants.inputQuitButtonSelector).click();
	}

	public void clickEditQuitSalesChannelButton() {
		driver.findElement(SalesChannelConstants.editQuitButtonSelector).click();
	}

	public void clickEditSalesChannelButton() {
		driver.findElement(SalesChannelConstants.editButtonSelector).click();
	}

	public void clickSearchMasterdataButton() {
		driver.findElement(SalesChannelConstants.searchMasterdataButtonSelector).click();
	}

	public void searchSalesChannelName(String name) {
		try {
			driver.findElement(SalesChannelConstants.searchNameSelector).clear();
			driver.findElement(SalesChannelConstants.searchNameSelector).sendKeys(name);

			clickSearchSalesChannelButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
