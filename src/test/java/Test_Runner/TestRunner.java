package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features="src//test//resources//Features",
glue= {"Step_definition","Hooks"},
plugin= {"pretty","html:target/htmlreports"})

public class TestRunner extends AbstractTestNGCucumberTests {
	
}
