package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;

public class GitHubPage extends BaseTest {
    @FindBy(linkText = "the-internet")
    WebElement githubelement;

    public GitHubPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean githubelementIsDisplayed() {
        wdWait.until(ExpectedConditions.visibilityOf(githubelement));
        return githubelement.isDisplayed();
    }


    public String githubText() {
        wdWait.until(ExpectedConditions.visibilityOf(githubelement));
        return githubelement.getText();

    }

    public void moveToNewPage() {

        wdWait.until(ExpectedConditions.numberOfWindowsToBe(1));
        ArrayList<String> page = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(page.get(1));

    }


}
