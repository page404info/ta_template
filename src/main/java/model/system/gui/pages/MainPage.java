package model.system.gui.pages;

import model.system.gui.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage  extends BasePage {
    @FindBy(xpath = ".//section//div[1]/h3")
    private List<WebElement> sectionsList;

    public MainPage(WebDriver driver) {
        super(driver);
    }
}
