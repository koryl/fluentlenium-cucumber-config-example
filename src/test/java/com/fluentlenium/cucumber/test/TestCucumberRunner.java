package com.fluentlenium.cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:com.fluentlenium.cucumber.test")
public class TestCucumberRunner {

}
