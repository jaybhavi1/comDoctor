package com.Doctor;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Jay Vaghani on 10/06/2017.
 */
public class Hooks extends BasePage {

    @Before
    public void openBrowser() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://login.timedoctor.com/v2/login.php?locale=en_US");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser()
    {
        //driver.quit();
    }
}
