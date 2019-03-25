package com.fluentlenium.cucumber.test;

import cucumber.api.java.en.And;

import static org.junit.Assert.assertNotNull;

public class TestSteps2 extends BaseTest {

    @And("^the webdriver is not null$")
    public void webdriverNotNull() {
        assertNotNull(getDriver());
    }
}
