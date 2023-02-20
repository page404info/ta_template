package conf.environment;

import conf.property.SystemDatabaseProperty;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SystemDatabase {
    public static SessionFactory createSessionTest() {
        return new Configuration()
                .setProperty("hibernate.connection.url", SystemDatabaseProperty.TEST)
                .configure("system_database.cfg.xml")
                .buildSessionFactory();
    }

    public static SessionFactory createSessionProd() {
        return new Configuration()
                .setProperty("hibernate.connection.url", SystemDatabaseProperty.PROD)
                .configure("system_database.cfg.xml")
                .buildSessionFactory();
    }
}
