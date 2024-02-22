package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", //Directorio de nuestros archivo .features
        glue = "src/test/java/steps", // paquete donde tenemos nuetras clases definiendo los steps en el feature file
        plugin = { "pretty","html:target/cucumber-reports"} // enviamos los reportes
)

public class TestRunner {

}
