package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./Resources/feature",
             glue = "stepDefnition",
             plugin = {"json:target/cucumber.json"})
             
public class Runner {
	
}
