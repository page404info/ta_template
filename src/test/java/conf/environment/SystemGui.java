package conf.environment;

import conf.property.SystemGuiProperty;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SystemGui {
    public static String createUrlTest() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return SystemGuiProperty.TEST;
    }

    public static String createUrlProd() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return SystemGuiProperty.PROD;
    }
}
