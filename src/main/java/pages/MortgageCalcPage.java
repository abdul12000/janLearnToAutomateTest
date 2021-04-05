package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageCalcPage extends BasePage{
    public MortgageCalcPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "homeval")
    private WebElement hValueLocator;

    @FindBy(id = "downpayment")
    private WebElement downPaymentLocator;
    @FindBy(id = "intrstsrate")
    private WebElement interestRateLocator;
    @FindBy(id = "loanterm")
    private WebElement loanTermLocator;
    @FindBy(css = "select[name='param[start_month]']")
    private WebElement startMonthLocator;
    @FindBy(id = "start_year")
    private WebElement startYearLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[1]/div[1]/h3")
    private WebElement tMonthPaymentLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[2]/div[1]/h3")
    private WebElement downPaymentAmounttLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[2]/div[2]/h3")
    private WebElement downPaymentPercentageLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[4]/div[1]/h3")
    private WebElement dloanPayoffDateLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[4]/div[2]/h3")
    private WebElement totalInterestPaidLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[5]/div[1]/h3")
    private WebElement monthlyTaxPaidLocator;
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement calculateButtonLocator;

    public void enterHomeValue(String hValue) {
        sendKeys(hValueLocator, hValue);
    }
    public void enterDownpaymentAmount(String dPaymentAmount) {
        sendKeys(downPaymentLocator, dPaymentAmount);
    }

    public void enterInterestRate(String intRate) {
        sendKeys(interestRateLocator, intRate);
    }

    public void enterLoanTerm(String loanTerm) {
        sendKeys(loanTermLocator, loanTerm);
    }

    public void selectStartMonth(String sMonth) {
        selectFromDropDownUsingVisibilityOfText(startMonthLocator, sMonth);
    }

    public void enterStartYear(String startYear) {
        sendKeys(startYearLocator, startYear);
    }

    public void clickOnSubmitButton() {
        click(calculateButtonLocator);
    }

    public String getTotalMonthlyPaymentAMount() {
        return tMonthPaymentLocator.getText();
    }

    public String getDownPaymentAmount() {
        return downPaymentAmounttLocator.getText();
    }

    public String getDownPaymentPercentage() {
        return downPaymentPercentageLocator.getText();
    }

    public String getLoanPayoffDate() {
        return dloanPayoffDateLocator.getText();
    }

    public String getTotalInterestPaid() {
        return totalInterestPaidLocator.getText();
    }

    public String getMonthlyTaxPaid() {
        return monthlyTaxPaidLocator.getText();
    }

}
