package steps;

import io.cucumber.java.en.Given;
import pages.PrincipalPage;

public class FreeRangeSteps {

    PrincipalPage landingPage = new PrincipalPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
}
