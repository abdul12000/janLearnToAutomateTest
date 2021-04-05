package step_definitions;

import base.Baseutil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UkbaStepDefinitions extends Baseutil {
    private Baseutil base;

    public UkbaStepDefinitions(Baseutil base) {
        this.base = base;
    }


    @Given("I am on the UKBA website")
    public void i_am_on_the_ukba_website() {
        //To maximise the screen
        base.driver.manage().window().maximize();
        base.driver.get("https://www.gov.uk/check-uk-visa/y");
//        base.driver.navigate().to("https://www.gov.uk/check-uk-visa/y");
        base.driver.findElement(By.xpath("//button[contains(text(),'Accept additional cookies')]")).click();

    }
    @When("I provide nationality of {string}")
    public void i_provide_nationality_of(String countryName) {
        Select select = new Select(base.driver.findElement((By.id("response"))));
        select.selectByVisibleText(countryName);

    }
    @When("I click on the Continue button")
    public void i_click_on_the_continue_button() {
        base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
    }
    @When("I select the reason {string}")
    public void i_select_the_reason(String string) {
        base.driver.findElement(By.id("response-2")).click();
    }
    @When("I state I am intending to stay for more than {int} months")
    public void i_state_i_am_intending_to_stay_for_more_than_months(Integer int1) {
        WebElement ele = base.driver.findElement(By.id("response-1"));
        ele.click();

    }
    @When("I submit the form")
    public void i_submit_the_form() {
        i_click_on_the_continue_button();
    }
    @Then("I will be informed {string}")
    public void i_will_be_informed(String message) {
//        assertThat(base.driver.findElement(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).getText(), is(equalTo(message)));
        assertThat(base.driver.findElements(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).get(0).getText(), is(equalTo(message)));


    }

    @And("I select the reason as Tourism")
    public void iSelectTheReasonAsTourism() {
        base.driver.findElement(By.id("response-0")).click();
    }

    @And("I state that I am not visiting a partner of family")
    public void iStateThatIAmNotVisitingAPartnerOfFamily() {
        base.driver.findElement(By.id("response-1")).click();
    }


    @When("I select {string} as a nationality from the Country drop down")

    public void i_select_as_a_nationality_from_the_country_drop_down(String countryName) {
        // We need to select a value from the drop down so the 'Select' is used
        if (countryName.equals("Hong Kong")) {
            Select selectCountry = new Select(base.driver.findElement(By.id("response")));
            selectCountry.selectByVisibleText(countryName);
            System.out.println("this is the value clicked:" + countryName);
            //Click the Continue button
            base.driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
            //select option for the travel document you have
            base.driver.findElement(By.xpath("//label[@for='response-1']")).click();
        }
        else {
            Select selectCountry = new Select(base.driver.findElement(By.id("response")));
            selectCountry.selectByVisibleText(countryName);
        }

    }

    @And("I select Study option")
    public void iSelectStudyOption() {
        base.driver.findElement(By.xpath("//label[(@for='response-2')]")).click();
    }


    @When("I select longer than {int} months")
    public void i_select_longer_than_months(Integer int1) {
        //base.driver.findElement(By.xpath("//button[contains(text(),'longer than 6 months')]")).click();
        base.driver.findElement(By.id("response-1")).click();
    }
    @Then("the message {string} will be displayed")
    public void the_message_will_be_displayed(String message) {
//        assertThat(base.driver.findElements(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).get(0).getText(), equalTo(message));
//        reverse the Expected and Actual results in the assertThat
//        assertThat(message, is(equalTo(base.driver.findElement(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).getText())));
        assertThat(base.driver.findElement(By.xpath("//h2[starts-with(@class,'gem-c-heading')]")).getText(), is(equalTo(message)));

    }




}
