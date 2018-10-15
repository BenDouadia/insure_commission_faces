package insure.commission.utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import insure.commission.enums.MasterdataGender;

public class BasePage {

	WebDriver driver;
	public final Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public BasePage() {
		this.driver = Hook.getDriver();
	}

	public WebElement waitForElement(WebDriver driver, By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.findElement(by).clear();
		return driver.findElement(by);
	}

	public WebElement waitForElementClickable(WebDriver driver, By by) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver.findElement(by);
	}

	public void selectDropdownByValue(String value, By by){
		try {
			WebElement selectElement = driver.findElement(by);
			Select dropdown = new Select(selectElement);
			dropdown.selectByVisibleText(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectRadioButtonByValue(MasterdataGender gender) {
		try {
			if(gender.equals(MasterdataGender.Male)) {
				driver.findElement(By.id("insure-main-form:fieldset-masterDataAdd:input-gender:radio:0")).click();
			}else {
				driver.findElement(By.id("insure-main-form:fieldset-masterDataAdd:input-gender:radio:1")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectFirstElement(By by) {
		try {
			List<WebElement> rows = driver.findElements(by);
			if (rows.size() > 0) {
				rows.get(0).click();
			} else {
				driver.findElement(by).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectTableElement(String value, By by) {
		try {
			WebElement element = driver.findElement(By.xpath("//td[contains(text(), '"+ value +"')]"));
			element.findElement(by).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public boolean checkIfValuesAreEqual(String value, By by) {
		try {
			String element = driver.findElement(by).getText();
			if (element.equals(value.toString())) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkIfValueExist(String value) {
		try {
			List<WebElement> elements = driver.findElements(By.xpath("//td[contains(text(), '"+ value +"')]"));
			if (elements.size() > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean checkIfValueExist(By by) {
		try {
			List<WebElement> elements = driver.findElements(by);
			if (elements.size() > 0) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public String subString(int from, int to, String value) {
		return value.substring(from, to);
	}

	public static String getCurrentDate() {
		SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
		return formattedDate.format(new Date());
	}

	public static String getDateOfNextDay() {
		SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yyyy");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 1);
		return formattedDate.format(c.getTime());
	}

	public static int randomNumber() {
		int random = (int) (Math.random() * 1000);
		return random;
	}
}
