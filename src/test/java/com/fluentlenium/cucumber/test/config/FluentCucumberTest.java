package com.fluentlenium.cucumber.test.config;

import cucumber.api.Scenario;
import org.fluentlenium.adapter.DefaultFluentControlContainer;
import org.fluentlenium.adapter.FluentTestRunnerAdapter;
import org.fluentlenium.utils.SeleniumVersionChecker;

public class FluentCucumberTest extends FluentTestRunnerAdapter {

    public FluentCucumberTest() {
        super(new DefaultFluentControlContainer(), new FluentCucumberSharedMutator());
    }

    public void before(Scenario scenario) {
        SeleniumVersionChecker.checkSeleniumVersion();
        starting(scenario.getName());
    }

    public void after(Scenario scenario) {
        if (scenario.isFailed()) {
            failed(scenario.getName());
        }
        finished(scenario.getName());
    }
}
