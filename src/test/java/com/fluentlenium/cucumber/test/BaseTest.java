package com.fluentlenium.cucumber.test;

import com.fluentlenium.cucumber.test.config.FluentCucumberTest;
import org.fluentlenium.configuration.FluentConfiguration;

@FluentConfiguration(webDriver = "firefox")
public class BaseTest extends FluentCucumberTest {
}
