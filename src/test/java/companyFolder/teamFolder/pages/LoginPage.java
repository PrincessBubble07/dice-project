package companyFolder.teamFolder.pages;

import companyFolder.teamFolder.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@type='text']")
    public WebElement myEmail;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement myPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;



    public void login(String email, String password) {
        myEmail.sendKeys(email);
        myPassword.sendKeys(password);
        submit.click();
    }



}
