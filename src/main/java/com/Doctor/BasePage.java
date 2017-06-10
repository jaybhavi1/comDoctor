package com.Doctor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani on 10/06/2017.
 */
public class BasePage {

    public static WebDriver driver;

    public BasePage()
    {
        PageFactory.initElements(driver, this);
    }
}
