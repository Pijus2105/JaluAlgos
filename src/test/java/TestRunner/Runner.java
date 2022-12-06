package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" },
features="C:\\Users\\Elphill\\eclipse-workspace\\JaluAlgos\\src\\main\\java\\Features\\loginfunctional.feature",
glue= {"StepDefinition"},
monochrome = true,
dryRun = false)
public class Runner {
	
	

}
