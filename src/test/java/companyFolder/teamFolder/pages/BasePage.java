package companyFolder.teamFolder.pages;

import companyFolder.teamFolder.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }





}
