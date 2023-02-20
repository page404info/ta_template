package testcases;

import conf.environment.OriginApi;
import conf.environment.SystemGui;
import conf.environment.SystemPublicApi;
import io.restassured.specification.RequestSpecification;
import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

@Log4j2
@Getter
public class BaseTest {
    private RequestSpecification originSpecApi;
    private RequestSpecification systemSpecPublicApi;
    private String guiUrl;

    @BeforeSuite(alwaysRun = true)
    @Parameters({"environment"})
    public void projectInit(@Optional("prod") String environment) {
        log.info(new Exception().getStackTrace()[0].getMethodName());

        switch (environment.toLowerCase()) {
            case "test":
                originSpecApi = OriginApi.createSpecProd();
                systemSpecPublicApi = SystemPublicApi.createSpecTest();
                guiUrl = SystemGui.createUrlTest();
                break;
            case "prod":
                originSpecApi = OriginApi.createSpecProd();
                systemSpecPublicApi = SystemPublicApi.createSpecProd();
                guiUrl = SystemGui.createUrlProd();
                break;
            default:
                try {
                    throw new UnsupportedOperationException(log.getName() +
                            " ## use test/prod, your environment: " + environment.toUpperCase());
                } catch (UnsupportedOperationException e) {
                    log.error(e);
                }
        }
    }
}
