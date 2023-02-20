package conf.property;

import lombok.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Data
public class PropertyOriginApiReader {
    private static PropertyOriginApiReader instance = null;
    private String fileName = "origin_api.properties";
    private String pathToFile = "src/test/java/configuration/property/" + fileName;
    private String publishDate, requestBody;

    private PropertyOriginApiReader() {
        readProperty();
    }

    public static PropertyOriginApiReader getInstance() {
        if (instance == null) {
            instance = new PropertyOriginApiReader();
        }
        return instance;
    }

    private void readProperty() {
        try (InputStream fis = new FileInputStream(pathToFile)) {
            Properties prop = new Properties();
            prop.load(fis);

            publishDate = prop.getProperty("publishDate");
            requestBody = prop.getProperty("requestBody");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
