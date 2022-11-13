package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogInSuccesPage extends BaseTest {
    @FindBy(id = "flash-messages")
    WebElement message;

    public LogInSuccesPage() {
        PageFactory.initElements(driver, this);
    }

    public LogInSuccesPage goToSuccessPage() {
        driver.get("https://the-internet.herokuapp.com/secure");
        return this;
    }

    public boolean messageIsDisplayed() {
        wdWait.until(ExpectedConditions.elementToBeClickable(message));
        return message.isDisplayed();

    }

    public String logInSuccessText() {
        wdWait.until(ExpectedConditions.elementToBeClickable(message));
        return message.getText();
    }


}
