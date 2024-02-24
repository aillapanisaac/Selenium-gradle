package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks extends BasePage {
    public Hooks(){
        super(driver);
    }
    @After
    public void tearDrown(Scenario scenario){
        if (scenario.isFailed()){
            scenario.log("Scenario failing, please to the image attached to this report");
            final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            //scenario.attach(screenshot, mediaType:"image/png", name:"Screenshot of the error");
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
