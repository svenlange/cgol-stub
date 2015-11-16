package cgol.bdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        glue = {"/home/sven/Desktop/cgol-stub/src/test/java/cgol/bbd"},
        features = {"/home/sven/Desktop/cgol-stub/src/test/java/cgol/bdd"})
public class RunCukesTest {
}