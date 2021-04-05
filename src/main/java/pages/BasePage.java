package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 5);
    }

    public void waitForElementToBeVisibly(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void sendKeys(WebElement element, String text){
        waitForElementToBeVisibly(element);
        element.sendKeys(text);
    }

    public void sendKeys(WebElement element, String text, int a){
        waitForElementToBeVisibly(element);
        element.sendKeys(text);
    }
    public void click(WebElement element){
        waitForElementToBeClickable(element);
        element.click();
    }
public void doSomething(WebElement element){
        element.click();
}

    public void selectFromDropDownUsingVisibilityOfText(WebElement element, String textName){
        waitForElementToBeVisibly(element);
        Select select = new Select(element);
        select.selectByVisibleText(textName);
    }




}
