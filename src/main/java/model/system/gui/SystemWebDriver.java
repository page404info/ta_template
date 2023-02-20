package model.system.gui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SystemWebDriver {
    protected WebDriver driver;

    public SystemWebDriver(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}
