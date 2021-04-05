package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursLandingPage extends BasePage{
    public NewtoursLandingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnLink;
    @FindBy(linkText = "REGISTER") private WebElement registerLink;
    @FindBy(linkText = "SUPPORT") private WebElement supportLink;
    @FindBy(linkText = "CONTACT") private WebElement contactLink;


    public void clickOnSignOnLink(){
        signOnLink.click();
    }

    public void clickOnRegisterLink(){
        registerLink.click();
    }

}
