package WebTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",tags = "SignIn",format = {"pretty","html:target/cucumber-reports"})

public class RunTest {
}
