package companyFolder.teamFolder.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader{

//private = not accessible outside the class //static is loaded first
    private static Properties properties = new Properties();

    static{
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            file.close();

        } catch (IOException e) {
            System.out.println("File not found with given path");
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }



}
