package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    // Load properties file during class initialization
    static {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\anilk\\eclipse-workspace\\Introduction\\src\\Utility\\config.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file", e);
        }
    }

    /**
     * Returns the value of the given key from the properties file.
     * @param key The property key to look up.
     * @return The property value.
     * @throws IllegalArgumentException If the key does not exist in the properties file.
     */
    public static String getKey(String key) {
        String value = properties.getProperty(key);
        if (value == null) {
            throw new IllegalArgumentException("Property key not found: " + key);
        }
        return value;
    }
}
