package step_definitions;

import base.Baseutil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.NewtoursLandingPage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;
import utilities.ConfigReader;
import utilities.Utility;
import utilities.UtilityUsage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursRegistrationStepDefinitions extends Baseutil {
    private Baseutil base;

    public NewtoursRegistrationStepDefinitions(Baseutil base) {
        this.base = base;
    }

    @Given("I am on the Newtours Landing page")
    public void i_am_on_the_newtours_landing_page() throws Exception {
        base.driver.manage().window().maximize();
//        base.driver.get("http://demo.guru99.com/test/newtours");
        ConfigReader configReader = new ConfigReader();
        base.driver.get(configReader.getNewtoursURL());
        System.out.println("THIS IS THE TEST ACCOUNT: " + configReader.getTestAccountA());
    }

    @When("i Click on {string} link")
    public void i_click_on_link(String menuLink) {
//        making use of the String menuLink
//        WebElement a = base.driver.findElement(By.linkText(menuLink));
//        a.click();
        NewtoursLandingPage newtoursLandingPage = new NewtoursLandingPage(base.driver);
        newtoursLandingPage.clickOnRegisterLink();

    }

    @When("I enter all the contact information as {string}, {string}, {string} and {string}")
    public void i_enter_all_the_contact_information_as_and(String fName, String lName, String pNumber, String email) throws InterruptedException {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterFirstname(fName);
        newtoursRegisterPage.enterLastname(lName);
        newtoursRegisterPage.enterPhoneNumber(pNumber);

//        newtoursRegisterPage.enterEmail(email);

        //using randonNumbersOnly
//        UtilityUsage.setRandomNum(Utility.getRandomNumbers());
//        newtoursRegisterPage.enterEmail(UtilityUsage.getRandomNum()+email);


        //using randomEmail
        UtilityUsage.setFinalRandomEmail(Utility.getRandomEmail());
        newtoursRegisterPage.enterEmail(UtilityUsage.getFinalRandomEmail());
//        Thread.sleep(5000);
    }

    @When("I enter User information as {string} and {string}")
    public void i_enter_user_information_as_and(String uName, String pWord) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUsername(uName);
        newtoursRegisterPage.enterPassword(pWord);
        newtoursRegisterPage.enterConfirmPassword(pWord);
        newtoursRegisterPage.clickOnSubmitButton();
//        newtoursRegisterPage.enterPass();
    }

    @Then("I should be able to create a new User and verify with {string}, {string} and {string}")
    public void i_should_be_able_to_create_a_new_user_and_verify_with_and(String fName, String lName, String uName) {
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
        System.out.println("First and LastName : " + newtoursRegisterConfirmationPage.getfirstNameAndLastName());
        assertThat(newtoursRegisterConfirmationPage.getfirstNameAndLastName().contains(fName), equalTo(true));
        assertThat(newtoursRegisterConfirmationPage.getfirstNameAndLastName().contains(lName), equalTo(true));

        assertThat(newtoursRegisterConfirmationPage.getNoteText().contains(uName), equalTo(true));

    }

}
