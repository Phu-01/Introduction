package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions( 
					features= "src/firstProgram.feature", 
					glue="stepDefinitions"
					)
public class TestRun extends AbstractTestNGCucumberTests {
}
