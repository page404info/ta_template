package conf.environment;

import conf.property.OriginApiProperty;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class OriginApi {
    public static RequestSpecification createSpecProd() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        return new RequestSpecBuilder()
                .setBaseUri(OriginApiProperty.PROD)
                .addParam("size", 20000)
//                .addFilter(new RequestLoggingFilter())
//                .addFilter(new ResponseLoggingFilter())
                .build();
    }
}
