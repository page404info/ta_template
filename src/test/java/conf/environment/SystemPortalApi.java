package conf.environment;

import conf.property.SystemPortalApiProperty;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SystemPortalApi {
    public static RequestSpecification createSpecTest() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return new RequestSpecBuilder()
                .setBaseUri(SystemPortalApiProperty.TEST)
                .addParam("size", 20000)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }

    public static RequestSpecification createSpecProd() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return new RequestSpecBuilder()
                .setBaseUri(SystemPortalApiProperty.PROD)
                .addParam("size", 20000)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }
}
