package StepDefinitions;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		 	features = "src/test/resources/Features",
		    glue = {"StepDefinitions"},		    
		    monochrome = true,
		    plugin = {
		        "pretty",
		        "junit:target/JunitReports/reports.xml",
		        "json:target/JSONReports/reports.json",
		        "html:target/HtmlReports"

		    }
		)

public class TestRunner {

	
		
	
}


