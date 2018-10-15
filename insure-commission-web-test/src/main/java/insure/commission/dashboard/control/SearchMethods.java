package insure.commission.dashboard.control;

import org.openqa.selenium.WebDriver;

import insure.commission.dashboard.control.SearchConstants;
import insure.commission.utility.Hook;

public class SearchMethods {

	WebDriver driver;

	public SearchMethods() {
		this.driver = Hook.getDriver();
	}

	public void createMasterdataButton()
	{
		driver.findElement(SearchConstants.createMasterdataButtonSelector).click();
	}

	public void searchMasterdataId(String id) {
		try {
			driver.findElement(SearchConstants.masterdataSearchNumberSelector).clear();
			driver.findElement(SearchConstants.masterdataSearchNumberSelector).sendKeys(id);

			searchMasterdataButton();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchMasterdataButton()
	{
		driver.findElement(SearchConstants.searchButtonSelector).click();
	}

	public void deleteMasterdata(String id) {
		try {
			searchMasterdataId(id);
			driver.findElement(SearchConstants.deleteMasterdataSelector).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
