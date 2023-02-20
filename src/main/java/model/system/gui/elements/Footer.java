package model.system.gui.elements;

import model.system.gui.SystemWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class Footer  extends SystemWebDriver {
    @FindBy(xpath = ".//footer//span")
    private WebElement copyrightText;

    public Footer(WebDriver driver) {
        super(driver);
    }

    public String getCopyrightText() {
        return $(copyrightText).getText();
    }
}
