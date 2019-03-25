package com.fluentlenium.cucumber.test;

import org.fluentlenium.adapter.cucumber.FluentCucumberTest;
import org.fluentlenium.configuration.FluentConfiguration;

@FluentConfiguration(webDriver = "firefox")
public class BaseTest extends FluentCucumberTest {
}
