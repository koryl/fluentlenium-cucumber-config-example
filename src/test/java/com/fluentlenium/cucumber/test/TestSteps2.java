package com.fluentlenium.cucumber.test;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;

import static org.junit.Assert.assertNotNull;

public class TestSteps2 extends BaseTest {

    @And("^the webdriver is not null$")
    public void webdriverNotNull() {
        assertNotNull(getDriver());
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        before(scenario);
    }

    @After
    public void afterScenario(Scenario scenario) {
        after(scenario);
    }
}
