package projeto.testes.web.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "projeto.testes.web.steps",
		tags = "@smoke and not @ct01",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","json:target/cucumber-report.json","html:target/cucumber-report.html"}
		
		
		)

public class Executa {

}
