package conf.property;

import lombok.extern.log4j.Log4j2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

@Log4j2
public class PropertyOriginApiCreator {
    private String fileName = "origin_api.properties";
    private String pathToFile = "src/test/java/configuration/property/" + fileName;

    public void create(String publishDate, String sessionId) {
        log.debug(new Exception().getStackTrace()[0].getMethodName());

        try (OutputStream fos = new FileOutputStream(pathToFile)) {
            Properties prop = new PropertyAlteredOrder();

            prop.setProperty("publishDate", publishDate);
            prop.setProperty("requestBody", "{\"SessionId\": \"" + sessionId + "\"}");

            prop.store(fos, null);
            log.debug("Created origin api property = " + fileName);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
