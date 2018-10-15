package insure.commission.externalSalespartner.control;

import org.openqa.selenium.WebDriver;

import insure.commission.utility.Hook;

public class ExternalSalespartnerMethods {
	WebDriver driver;

	public ExternalSalespartnerMethods() {
		this.driver = Hook.getDriver();
	}

	public void returnButton() {
		driver.findElement(ExternalSalespartnerConstants.returnButtonSelector).click();
	}
}
