package com.fluentlenium.cucumber.test;

import com.fluentlenium.cucumber.test.page.DuckDuckGoPage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import org.fluentlenium.core.annotation.Page;

public class TestSteps3 extends BaseTest {

    @Page
    private DuckDuckGoPage page;


    @When("^goTo duckduckgo.com with Page$")
    public void goToPage() {
        goTo(page);
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
