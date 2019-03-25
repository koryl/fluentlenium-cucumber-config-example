package com.fluentlenium.cucumber.test;

import com.fluentlenium.cucumber.test.page.DuckDuckGoPage;
import cucumber.api.java.en.When;
import org.fluentlenium.core.annotation.Page;

import static org.junit.Assert.assertTrue;

public class TestSteps3 extends BaseTest {

    @Page
    private DuckDuckGoPage page;


    @When("^goTo duckduckgo.com with Page$")
    public void goToPage() {
        goTo(page);
    }

}
