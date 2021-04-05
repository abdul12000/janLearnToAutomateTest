package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursRegisterPage extends BasePage implements INewtoursRegisterPage{
    public NewtoursRegisterPage(WebDriver driver) {
        super(driver);
    }

    //Identifying elements:
    @FindBy(xpath = "//input[@name='firstName']" )
            private WebElement firstName;
    @FindBy(xpath = "//input[@name='lastName']" )
    private WebElement lastName;
    @FindBy(css = "input[name='phone']" )
    private WebElement phone;
    @FindBy(id = "userName" )
    private WebElement email;

    @FindBy(id = "email" )
    private WebElement username;

    @FindBy(css = "input[name='password']" )
    private WebElement password;
    @FindBy(css = "input[name='confirmPassword']" )
    private WebElement confirmPassword;
    @FindBy(css = "input[name='submit']" )
    private WebElement submitButton;

    //Writing methods to identify the elements:
    public void enterFirstname(String fName){
//        firstName.sendKeys(fName);
        sendKeys(firstName, fName);
    }

    public void enterLastname(String lName){
//        lastName.sendKeys(lName);
        sendKeys(lastName, lName);
    }
    public void enterPhoneNumber(String phoneNumber){
        phone.sendKeys(phoneNumber);
    }
    public void enterEmail(String emailAddress){
        email.sendKeys(emailAddress);
    }
    public void enterUsername(String uName){
        username.sendKeys(uName);
    }
    public void enterPassword(String pWord){
        password.sendKeys(pWord);
    }
    public void enterConfirmPassword(String pWord){
        confirmPassword.sendKeys(pWord);
    }
    public void clickOnSubmitButton(){
//        submitButton.click();
        click(submitButton);

    }
//    public void enterPass(){
//        System.out.println("Hello");
//        click(submitButton);
//    }

    public void doSomething(WebElement element){
        element.sendKeys();
    }

}
