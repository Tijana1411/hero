package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Base64;

public class ElementalSeleniumPage extends BaseTest {
    @FindBy(partialLinkText = "Sauce Labs")
    WebElement title;

    public ElementalSeleniumPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean titleIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(title));
        return title.isDisplayed();
    }


    public String messageText() {
        wdWait.until(ExpectedConditions.visibilityOf(title));
        return title.getText();

    }

    public void moveToNewTab() {

        wdWait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

    }
}

