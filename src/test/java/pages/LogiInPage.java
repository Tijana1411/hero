package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class LogiInPage extends BaseTest {
    @FindBy(id = "username")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(css = "[type=\"submit\"]")
    WebElement loginbutton;
    @FindBy(linkText = "Elemental Selenium")
    WebElement elementalselenium;
    @FindBy(css = "[alt=\"Fork me on GitHub\"]")
    WebElement github;
    @FindBy(css = "[class=\"flash error\"]")
    WebElement error;

    public LogiInPage() {
        PageFactory.initElements(driver, this);
    }

    public LogiInPage fillUserName(String stringUserName) {
        wdWait.until(ExpectedConditions.elementToBeClickable(username));
        username.clear();
        username.sendKeys(stringUserName);
        return this;
    }

    public LogiInPage fillPassword(String stringPassword) {
        wdWait.until(ExpectedConditions.elementToBeClickable(password));
        password.clear();
        password.sendKeys(stringPassword);
        return this;
    }

    public LogiInPage clickOnLogInButton() {
        wdWait.until(ExpectedConditions.elementToBeClickable(loginbutton));
        loginbutton.click();
        return this;
    }

    public LogiInPage clickOnGithub() {
        wdWait.until(ExpectedConditions.elementToBeClickable(github));
        github.click();
        return this;
    }

    public LogiInPage clickOnSeleniumLink()
    {
        wdWait.until(ExpectedConditions.elementToBeClickable(elementalselenium));
        elementalselenium.click();
        return this;
    }
    public boolean errorIsVisible()
    {

        //wdWait.until(ExpectedConditions.elementToBeClickable(error));
        return error.isDisplayed();
    }

    public String errorText()
    {
        //wdWait.until(ExpectedConditions.elementToBeClickable(error));
        return  error.getText();
    }
}
