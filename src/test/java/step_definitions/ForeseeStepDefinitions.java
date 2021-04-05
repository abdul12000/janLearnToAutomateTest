package step_definitions;

import base.Baseutil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ForeseeStepDefinitions extends Baseutil {
    private Baseutil base;

    public ForeseeStepDefinitions(Baseutil base) {
        this.base = base;
    }

    @Given("I am on the Forsee home page")
    public void i_am_on_the_forsee_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://www.foresee.com/");
    }

    @When("I click on Webinars")
    public void i_click_on_webinars() {
        WebElement insights = base.driver.findElement(By.id("menu-item-33415"));
        Actions actionProvider = new Actions(base.driver);
        actionProvider.moveToElement(insights).build().perform();
        WebElement webinars = base.driver.findElement(By.id("menu-item-33433"));
        webinars.click();
    }

    @Then("I should see {int} Webinars")
    public void i_should_see_webinars(Integer num) {
        List<WebElement> webinar_List = base.driver.findElements(By.xpath("//article/dl/dd"));
        int numOfWebinar = webinar_List.size();
        System.out.println("number of webinar onb the page is : " + numOfWebinar);
        assertThat(numOfWebinar, is(equalTo(num)));

    }
    @Given("I have logged into the Foresee Website")
    public void i_have_logged_into_the_foresee_website() {
        //To maximise screen
        base.driver.manage().window().maximize();

        //Open the website - https://www.foresee.com/ using the 'get' method to open site
        base.driver.get("https://www.foresee.com/");
    }



    @When("I navigate to {string}")
    public void i_navigate_to(String strMainMenu) {
        //Menu options - 'MoveToElement' will be used to access sub menus
        WebElement menuInsights = base.driver.findElement(By.id("menu-item-33415"));
        WebElement menuSolutions = base.driver.findElement(By.id("menu-item-43429"));

        Actions actionProvider = new Actions(base.driver);

        switch(strMainMenu) {
            case "Insights":
                //Use Move to Element to hover over menu
                actionProvider.moveToElement(menuInsights).build().perform();
                break;
            case "Solutions":
                actionProvider.moveToElement(menuSolutions).build().perform();
            default:

        }

    }

    @When("I click {string}")
    public void i_click(String strSubMenus) {

        switch(strSubMenus) {
            case "Webinars":
                //Sub Menu options
                WebElement subMenuWebinars = base.driver.findElement(By.id("menu-item-33433"));
                subMenuWebinars.click();
                break;
            case "Methodology":
                //Sub Menu options
                WebElement subMethodology = base.driver.findElement(By.id("menu-item-44136"));
                subMethodology.click();
                break;
            default:

        }

    }

//    @Then("{int} webinar sections are displayed")
//    public void webinarSectionsAreDisplayed(int num) {
//        List<WebElement> webinarList = base.driver.findElements(By.xpath("//article/dl/dd"));
//
//        int numOfWebinarOptions = webinarList.size();
//        System.out.println("The number of Webinar Lists: " + numOfWebinarOptions);
//
//        assertThat(numOfWebinarOptions, is(equalTo(num)));
//
//    }

    @Then("the {string} methodology section is displayed")
    public void the_methodology_section_is_displayed(String subMenuSection) {

        switch(subMenuSection){
            case "Prescriptive":
//                assertThat(subMenuSection,is(equalTo(base.driver.findElement(By.xpath("//strong[contains(text(),'Prescriptive')]")).getText())));
                assertThat(base.driver.findElements(By.xpath("//div[@class='animated-gif']/p/strong")).get(0).getText(), is(equalTo(subMenuSection)));
                System.out.println("The Methodology sub menu shows : " +  subMenuSection);
                break;
            case "Predictive":
//                assertThat(subMenuSection,is(equalTo(base.driver.findElement(By.xpath("//strong[contains(text(),'Predictive')]")).getText())));
                System.out.println("The Methodology sub menu shows : " +  subMenuSection);
                assertThat(base.driver.findElements(By.xpath("//div[@class='animated-gif']/p/strong")).get(1).getText(), is(equalTo(subMenuSection)));
                break;
            case "Benchmarkable":
//                assertThat(subMenuSection,is(equalTo(base.driver.findElement(By.xpath("//strong[contains(text(),'Benchmarkable')]")).getText())));
                System.out.println("The Methodology sub menu shows : " +  subMenuSection);
                assertThat(base.driver.findElements(By.xpath("//div[@class='animated-gif']/p/strong")).get(2).getText(), is(equalTo(subMenuSection)));
                break;
            default:

        }

    }
    @Then("the page header {string} is displayed")
    public void the_page_header_is_displayed(String strPageHeader) {
        assertThat(strPageHeader,is(equalTo(base.driver.findElement(By.xpath("//h1[contains(text(),'The Verint Methodology')]")).getText())));
        System.out.println("The Methodology sub menu shows : " +  strPageHeader);
    }


    @When("I click on contact and click submit")
    public void iClickOnContactAndClickSubmit() {
        WebElement contactUs = base.driver.findElement(By.id("menu-item-45088"));
        contactUs.click();
        WebElement fName = base.driver.findElement(By.id("fe93996"));
        fName.sendKeys("lateeeF");

        WebElement submitButton = base.driver.findElement(By.id("fe94023"));
        submitButton.click();


    }

    @Then("I should see {string}")
    public void iShouldSee(String msg) {
        assertThat(base.driver.findElement(By.xpath("//div/img/..")).getText().contains(msg), equalTo(true));
    }
}
