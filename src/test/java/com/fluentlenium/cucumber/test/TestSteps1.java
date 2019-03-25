package com.fluentlenium.cucumber.test;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class TestSteps1 extends BaseTest {

    private static final String DUCK_DUCK_GO = "https://duckduckgo.com";
    private static final  String DUCK_DUCK_GO_TITLE = "DuckDuckGo";

    @When("^goTo duckduckgo.com with String$")
    public void goToString() {
        goTo(DUCK_DUCK_GO);
    }

    @Then("^the expected page is open$")
    public void checkIfTitleCorrect() {
        assertTrue(window().title().contains(DUCK_DUCK_GO_TITLE));
    }
}
