package com.appium.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "json:cucumber.json",
        features = {
                "src/test/resources/features/ProductDetails.feature"
        },
        glue = {"com.appium.demo.steps", "com.appium.demo.base"},
        tags = {"@SomeTag"}
)
public class RunTest {

}
