package steps;

import io.cucumber.java.en.*;
import pages.PrincipalPage;

public class FreeRangeSteps {

    PrincipalPage landingPage = new PrincipalPage();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }
}
