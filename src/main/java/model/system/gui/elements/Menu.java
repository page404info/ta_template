package model.system.gui.elements;

import model.system.gui.SystemWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.codeborne.selenide.Selenide.$$;

public class Menu extends SystemWebDriver {
    @FindBy(xpath = ".//")
    private List<WebElement> menuList = new ArrayList<>();

    public Menu(WebDriver driver) {
        super(driver);
    }

    public Set<String> getMenuList() {
        Set<String> nameList = new HashSet<>();

        for (WebElement item : $$(menuList)) {
            nameList.add(item.getText());
        }
        return nameList;
    }
}
