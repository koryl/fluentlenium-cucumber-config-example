package com.fluentlenium.cucumber.test;

import com.fluentlenium.cucumber.test.config.Config;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class, classes = Config.class)
public class SpringTestCucumberRunner {
    @Before
    public void SetupCucumberSpringContext() {
        //dummy method so cucumber will recognize this class as glue
        //and use its context configuration
    }
}
