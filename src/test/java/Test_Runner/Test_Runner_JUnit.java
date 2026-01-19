package Test_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//Features",
glue= {"Step_definition"},
plugin= {"junit:target/junitReports/report.xml"})


public class Test_Runner_JUnit {
	
}
