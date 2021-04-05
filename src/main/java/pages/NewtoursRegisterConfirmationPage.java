package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewtoursRegisterConfirmationPage extends BasePage{
    public NewtoursRegisterConfirmationPage(WebDriver driver) {
        super(driver);
    }

    //Identifying elements:
    @FindBy(xpath = "//font/b" )
            private List<WebElement> names;


    //Alternatively you can identify the webElements uniquely:
    @FindBy(xpath = "//td/p[1]/font/b" ) private WebElement firstAndLastName;
    @FindBy(xpath = "//td/p[3]/font/b" ) private WebElement userName;


    //Writing methods to identify the elements:
public String getfirstNameAndLastName(){
    String fNameAndLastName = names.get(0).getText();
    return(fNameAndLastName);
}

    public String getNoteText(){
        String noteText = names.get(1).getText();
        return(noteText);
    }


}
