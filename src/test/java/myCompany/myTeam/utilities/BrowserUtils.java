package myCompany.myTeam.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {


   public static void sleep(int seconds){
        seconds *= 1000;

        try{
            Thread.sleep(seconds);
        }catch(InterruptedException e){

        }
    }
    //this method accepts int in seconds, executes Thread.sleep() for given duration

   public static void switchWindowAndVerify(WebDriver driver, String expectedInURL, String expectedInTitle){
       Set<String> allWindowHandles = driver.getWindowHandles();

       for (String each : allWindowHandles) {

           driver.switchTo().window(each);
           System.out.println("Current url: "+ driver.getCurrentUrl());

           if(driver.getCurrentUrl().contains(expectedInURL)){
               break;
           }
       }

       String actualTitle = driver.getTitle();
       Assert.assertTrue(actualTitle.contains(expectedInTitle));
   }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }
    public static void verifyTitleContains(WebDriver driver, String expectedInTitle){
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
    }



    public static void waitForInvisibilityOf(WebElement target){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(target));
    }

















   }









