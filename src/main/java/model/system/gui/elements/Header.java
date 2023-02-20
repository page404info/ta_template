package model.system.gui.elements;

import model.system.gui.SystemWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class Header extends SystemWebDriver {
    @FindBy(xpath = ".//*[@id='header-logo']")
    private WebElement thisSiteLogo;

    public Header(WebDriver driver) {
        super(driver);
    }

    public boolean isPresentedSiteLogo() {
        return $(thisSiteLogo).isDisplayed();
    }
}
