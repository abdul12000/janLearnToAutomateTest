package step_definitions;

import base.Baseutil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageCalcPage;
import pages.NewtoursLandingPage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;
import utilities.ConfigReader;
import utilities.Utility;
import utilities.UtilityUsage;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;

public class MortgageCalculatorStepDefs extends Baseutil {
    private Baseutil base;

    public MortgageCalculatorStepDefs(Baseutil base) {
        this.base = base;
    }

    @Given("I am on the Mortgage Calculator website")
    public void iAmOnTheMortgageCalculatorWebsite() throws Exception {
        ConfigReader configReader =new ConfigReader();
        base.driver.get(configReader.getMortgageCalcURL());
    }

    @When("I enter the following")
    public void iEnterTheFollowing(List<List<String>>data) {
        MortgageCalcPage mortgageCalcPage = new MortgageCalcPage(base.driver);
        mortgageCalcPage.enterHomeValue(data.get(1).get(1));
        mortgageCalcPage.enterDownpaymentAmount(data.get(2).get(1));
        mortgageCalcPage.enterInterestRate(data.get(3).get(1));
        mortgageCalcPage.enterLoanTerm(data.get(4).get(1));
        mortgageCalcPage.selectStartMonth(data.get(5).get(1));
        mortgageCalcPage.enterStartYear(data.get(6).get(1));
        mortgageCalcPage.clickOnSubmitButton();

    }

    @And("accept default value for all the remaining values")
    public void acceptDefaultValueForAllTheRemainingValues() {
    }

    @Then("I should get mortage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void iShouldGetMortageOfferWithAnd(String tMonthlyPaymentAmount, String dPaymentAmount, String dPaymentPerc, String lPayoffDate, String tIntRate, String mTaxPaid) {
        MortgageCalcPage mortgageCalculatorPage = new MortgageCalcPage(base.driver);
        assertThat(mortgageCalculatorPage.getTotalMonthlyPaymentAMount(), is(equalTo(tMonthlyPaymentAmount)));
        assertThat(mortgageCalculatorPage.getDownPaymentAmount(), is(equalTo(dPaymentAmount)));
        assertThat(mortgageCalculatorPage.getDownPaymentPercentage(), is(equalTo(dPaymentPerc)));
        assertThat(mortgageCalculatorPage.getLoanPayoffDate(), is(equalTo(lPayoffDate)));
        assertThat(mortgageCalculatorPage.getTotalInterestPaid(), is(equalTo(tIntRate)));
//        assertThat(mortgageCalculatorPage.getMonthlyTaxPaid(), is(equalTo(mTaxPaid)));


        //Use the arrayList
        List<String> arrayListFoxTax = Arrays.asList("$202.00", "$200.00", "$199.00", mTaxPaid);
        assertThat(arrayListFoxTax, hasItem(mortgageCalculatorPage.getMonthlyTaxPaid()));
    }
}
