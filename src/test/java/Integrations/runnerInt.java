package Integrations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Integrations.feature", glue = "Integrations", dryRun = false, monochrome = true)
public class runnerInt {

}
