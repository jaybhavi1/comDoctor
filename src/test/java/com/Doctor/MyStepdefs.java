package com.Doctor;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

/**
 * Created by Jay Vaghani on 10/06/2017.
 */
public class MyStepdefs {

    HomePage homePage = new HomePage();

    @Given("^user is on home page$")
    public void userIsOnHomePage()  {

    }

    @And("^user enter user name$")
    public void userEnterUserName()  {
    homePage.enterEmail("abc@yahoo.com");
    }

    @And("^user enter password$")
    public void userEnterPassword()  {
        homePage.enterPassword("abcdedff12");
    }

    @Then("^user should login successfully$")
    public void userShouldLoginSuccessfully()  {
        Assert.assertTrue(homePage._emailField.isDisplayed());
    }
}
