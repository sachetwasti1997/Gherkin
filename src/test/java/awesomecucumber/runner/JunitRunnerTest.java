package awesomecucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber.html"},
 //       dryRun = true,
        tags = "@feature1 or @multiple",
        glue = {"awesomecucumber.stepdef","awesomecucumber.hook"},
        features = "src/test/resources/awesomecucumber"
)
//If dryRun set true the beforeAll and afterAll hooks not run
public class JunitRunnerTest {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("\nIn the Before class\n");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("\nIn the After class\n");
    }

}
