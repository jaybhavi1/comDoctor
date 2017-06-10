package com.Doctor;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Jay Vaghani on 10/06/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = "html:/target/cucumber.report",tags = "@test")
public class RunTest {
}
