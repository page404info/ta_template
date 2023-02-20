package conf.property;

public interface SystemDatabaseProperty {
    String TEST = "jdbc:oracle:thin:@test:port:schema";
    String PROD = "jdbc:oracle:thin:@prod:port:schema";
}
