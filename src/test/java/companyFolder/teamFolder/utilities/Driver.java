package companyFolder.teamFolder.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {


    private Driver(){}

    private static WebDriver driver; //private because we don't want it to be accessed outside the class
                                        //static because we will use it in a static method
                                    //default value is null

    public static WebDriver getDriver(){

        if(driver == null){  //if an instance doesn't exist,

            String browserType = ConfigurationReader.getProperty("browser");

            switch(browserType){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }

        }

        return driver;          // generate a new driver, and always return same instance
    }

    public static void quitDriver(){

        if(driver != null){

            driver.quit();
            driver = null; //so that my singleton can create a new one if needed
        }
    }












}
