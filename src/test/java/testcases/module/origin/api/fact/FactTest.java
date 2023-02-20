package testcases.module.origin.api.fact;

import conf.property.OriginApiProperty;
import lombok.extern.log4j.Log4j2;
import model.origin.api.fact.FactListRS;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import testcases.BaseTest;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertTrue;

@Log4j2
public class FactTest extends BaseTest {
    private FactListRS response;

    @BeforeClass(alwaysRun = true)
    public void beforeStateTest() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        response =
                given().spec(getOriginSpecApi())
                        .when().post(OriginApiProperty.FACT_OBJECT)
                        .then().statusCode(200)
                        .extract().as(FactListRS.class);
    }

    @Test
    public void factIdIsNotNullTest() {
        log.info(new Exception().getStackTrace()[0].getMethodName());
        assertTrue(response.isFactIdNotNull());
    }
}
