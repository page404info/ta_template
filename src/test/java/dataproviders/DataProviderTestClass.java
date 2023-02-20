package dataproviders;

import org.testng.annotations.DataProvider;

public class DataProviderTestClass {
    @DataProvider(name = "incoCodeResponseCorrect")
    public Object[][] incoCodeResponseCorrect() {
        return new Object[][]{
                {"18010200"},
        };
    }

    @DataProvider(name = "code200")
    public Object[][] code200() {
        return new Object[][]{
                {"4", " 2020 ", ""},
                {" 4 ", "", "26"},
                {"", "", ""},
                {"", "2020", " 26 "},
        };
    }

    @DataProvider(name = "code400")
    public Object[][] code400() {
        return new Object[][]{
                {"q", "", ""},
                {"21474836502147483650214748365021474836502147483650214748365021474836502147483650", "", ""},
                {"", "qqqq", ""},
                {"", "21474836502147483650214748365021474836502147483650214748365021474836502147483650", ""},
                {"", "", "qq"},
                {"", "", "21474836502147483650214748365021474836502147483650214748365021474836502147483650"},
                {"' --", "", ""},
        };
    }
}
