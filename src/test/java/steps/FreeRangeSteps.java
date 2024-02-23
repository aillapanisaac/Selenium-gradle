package steps;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PrincipalPage;

public class FreeRangeSteps {

    PrincipalPage landingPage = new PrincipalPage();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new  PaginaFundamentosTesting();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }

   @And("select Introducción al Testing")
    public void navigateToIntro(){
       cursosPage.clickFundamentosTestingLink();
       fundamentosPage.clickFundamentosTestingLink();
   }
}
