package model.system.gui;

import model.system.gui.elements.Footer;
import model.system.gui.elements.Header;
import model.system.gui.elements.Menu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage extends SystemWebDriver {
    public Header header;
    public Footer footer;
    public Menu menu;

    @FindBy(xpath = ".//h2")
    private WebElement pageName;

    public BasePage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
        footer = new Footer(driver);
        menu = new Menu(driver);
    }

    public String getPageName() {
        return pageName.getText();
    }
}
