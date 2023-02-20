package conf.environment;

import conf.property.SystemPublicApiProperty;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SystemPublicApi {
    public static RequestSpecification createSpecTest() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return new RequestSpecBuilder()
                .setBaseUri(SystemPublicApiProperty.TEST)
                .addParam("size", 20000)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public static RequestSpecification createSpecProd() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return new RequestSpecBuilder()
                .setBaseUri(SystemPublicApiProperty.PROD)
                .addParam("size", 20000)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }
}
