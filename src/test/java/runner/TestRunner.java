package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", //Directorio de nuestros archivo .features
        glue = "steps", // paquete donde tenemos nuetras clases definiendo los steps en el feature file
        plugin = { "pretty","html:target/cucumber-reports"}, // enviamos los reportes
        tags = "@Plans"
)

public class TestRunner {
    @AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser();
    }
}
