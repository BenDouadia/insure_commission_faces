package insure.commission.utility;

import java.io.*;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	protected static WebDriver driver;
	BasePage basePage = new BasePage();
	Properties prop = new Properties();

	protected String getOsDriverPath() {
	    OperatingSystem os;

	    os = OperatingSystemProducer.getCurrent();

	    switch (os) {
            case WINDOWS:
                return "windows" + File.separator + "chromedriver.exe";
            case UNIX:
            case POSIX_UNIX:
                return "linux" + File.separator + "chromedriver";
            case MAC:
                return "macos" + File.separator + "chromedriver";
            default:
                throw new IllegalArgumentException("Unsupported operating system");
        }
    }

    protected String getUrl() {
    	return "http://swisslife-dev01.test-server.ag:8080/swisslife-commission";
//	    return Objects.requireNonNull(System.getProperty("insure.commission.test.url"));
    }

	@Before
	public void setUp() {
        basePage.log.info("Start test ....");
        setBrowserConfiguration();

        driver.get(getUrl());

        basePage.log.info(driver.getCurrentUrl());
	}

	@After
	public void tearDown() {
		driver.quit();
		basePage.log.info("End test ....");
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public void setBrowserConfiguration() {
		try {
			System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator +
                    "browserdriver" + File.separator + "chrome" + File.separator + getOsDriverPath());
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
