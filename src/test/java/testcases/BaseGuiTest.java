package testcases;

import conf.environment.SystemBrowser;
import lombok.extern.log4j.Log4j2;
import model.system.gui.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

@Log4j2
public class BaseGuiTest extends BaseTest{
    protected WebDriver driver;
    protected String baseUrl;
    protected MainPage mainPage;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    public void openBrowser(@Optional("chrome") String browser) {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = SystemBrowser.createChrome_107();
                break;
            case "firefox":
                driver = SystemBrowser.createFirefox_25();
                break;
            default:
                try {
                    throw new UnsupportedOperationException(log.getName() + " ## invalid environment: " + browser.toUpperCase());
                } catch (UnsupportedOperationException e) {
                    log.error(e);
                }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        baseUrl = getGuiUrl();
        System.out.println(baseUrl);
        driver.get(baseUrl);
        mainPage = new MainPage(driver);
    }

    @AfterClass(alwaysRun = true)
    public void closeBrowser() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        if (driver != null) {
            driver.close();
        }
    }
}
