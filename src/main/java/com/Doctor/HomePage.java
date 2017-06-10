package com.Doctor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani on 10/06/2017.
 */
public class HomePage extends Utils {

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement _emailField;

    @FindBy(id = "password")
    WebElement _password;

    public void enterEmail(String email)
    {
        _emailField.sendKeys(email);
    }

    public void enterPassword(String password)
    {
        _password.sendKeys(password);
    }
}
