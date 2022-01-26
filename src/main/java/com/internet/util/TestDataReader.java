package com.internet.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {

    //static Properties properties;
    public static Properties getTestData() throws IOException {
        FileInputStream fp = new FileInputStream("src\\main\\resources\\testdata.properties");
        Properties properties = new Properties();
        properties.load(fp);
        return properties;
    }

    public static String getUrl() throws IOException {
        return getTestData().getProperty("baseUrl");
    }

    public static String getBrowser() throws IOException {
        return getTestData().getProperty("browser");
    }
}
