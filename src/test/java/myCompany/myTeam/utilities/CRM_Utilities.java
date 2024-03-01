package myCompany.myTeam.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class CRM_Utilities {


    public static void login_crm(WebDriver driver){
//3. Enter valid username
        WebElement username = driver.findElement(By.xpath("//input[@class='login-inp']"));
        username.sendKeys("helpdesk3@cydeo.com");

//4. Enter valid password
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser");


//5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }

    public static void login_crm(WebDriver driver, String username, String password){
//3. Enter valid username
        WebElement input_username = driver.findElement(By.xpath("//input[@class='login-inp']"));
        input_username.sendKeys(username);

//4. Enter valid password
        WebElement input_password = driver.findElement(By.xpath("//input[@type='password']"));
        input_password.sendKeys(password);


//5. Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
    }




}
