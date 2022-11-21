package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath= System.getProperty("user.dir") + "/src/test/resources/global.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getUrl(){
        String url = properties.getProperty("url");
        if(url!= null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public String getBrowser(){
        String browser = properties.getProperty("browser");
        if(browser!= null) return browser;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }


}
