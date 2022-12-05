package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Elphill\\eclipse-workspace\\JaluAlgos\\src\\main\\java\\Features\\loginfunctional.feature",
glue= {"StepDefinition"},

dryRun = false)
public class Runner {
	
	

}
