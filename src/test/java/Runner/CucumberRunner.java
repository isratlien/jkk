package Runner;

        import io.cucumber.testng.AbstractTestNGCucumberTests;
        import io.cucumber.testng.CucumberOptions;
        import org.testng.annotations.Test;

@CucumberOptions(tags ="@smoke", features = {"src/test/resources/Feature/TC1_addCustomer.feature","src/test/resources/Feature/TC2_OpenAccount.feature","src/test/resources/Feature/TC3_DeleteCustomer.feature"},
        glue = {"StepDefination"},   monochrome = true,
        dryRun = false,
        plugin = {
                "pretty","html:src/feature.html"
        })
@Test
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
