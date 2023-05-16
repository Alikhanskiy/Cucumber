package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src//test//resources//features//Login.feature",//without Login.f/at the end
        glue = "com.automation.steps",
        tags = "@smoke and not @chirag",
        plugin = {"html:target/report.html", "json:target/cucumber.json"}
)
public class TestRunner {

}
