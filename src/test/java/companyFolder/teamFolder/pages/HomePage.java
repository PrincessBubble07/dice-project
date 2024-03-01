package companyFolder.teamFolder.pages;

import companyFolder.teamFolder.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
