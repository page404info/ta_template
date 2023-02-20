package conf.environment;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Log4j2
public class SystemBrowser {
    public static WebDriver createChrome_107() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chrome_107/chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver createFirefox_25() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        System.setProperty("webdriver.gecko.driver", "src/test/resources/webdrivers/firefox_25_64/geckodriver.exe/");
        return new FirefoxDriver();
    }
}
