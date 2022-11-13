package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.ElementalSeleniumPage;
import pages.GitHubPage;
import pages.LogInSuccesPage;
import pages.LogiInPage;

public class HerokuappTest extends BaseTest {
    private LogiInPage logiInPage;
    private LogInSuccesPage logInSuccesPage;
    private ElementalSeleniumPage elementalSeleniumPage;
    private GitHubPage githubpage;

    @Before

    public void setUpTest() {
        logiInPage = new LogiInPage();
        logInSuccesPage = new LogInSuccesPage();
        elementalSeleniumPage = new ElementalSeleniumPage();
        githubpage = new GitHubPage();
    }

    @Test

    public void logiInPageTest() {
        logiInPage.fillUserName("tomsmith")
                .fillPassword("SuperSecretPassword!")
                .clickOnLogInButton();

        Assert.assertTrue(logInSuccesPage.messageIsDisplayed());
        Assert.assertEquals("You logged into a secure area!" + "\n" + "×", logInSuccesPage.logInSuccessText());


    }

    @Test

    public void gitHubTest() {

        logiInPage.clickOnGithub();
        Assert.assertTrue(githubpage.githubelementIsDisplayed());
        Assert.assertEquals("the-internet", githubpage.githubText());
    }

    @Test

    public void seleniumTest()
    {
        logiInPage.clickOnSeleniumLink();
        elementalSeleniumPage.moveToNewTab();
        Assert.assertTrue(elementalSeleniumPage.titleIsDisplayed());
        Assert.assertEquals("Sauce Labs", elementalSeleniumPage.messageText());
    }
    @Test

    public void logiInPageTestNeg1() {
        logiInPage.fillUserName("tomsmith1")
                .fillPassword("SuperSecretPassword!")
                .clickOnLogInButton();
        Assert.assertTrue(logiInPage.errorIsVisible());
        Assert.assertEquals("Your username is invalid!" +  "\n" + "×", logiInPage.errorText());
    }



    }
