package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaRegistro;
import pages.PrincipalPage;

import java.util.Arrays;
import java.util.List;

public class FreeRangeSteps {

    PrincipalPage landingPage = new PrincipalPage();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new  PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT(){
        landingPage.navigateToFreeRangeTesters();
    }
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section){
        landingPage.clickOnSectionNavigationBar(section);
    }
    @When("I select Elegir plan")
    public void selectElegirPlan(){
        landingPage.clickOnElegirPlanButton();
    }

   @And("select Introducción al Testing")
    public void navigateToIntro(){
       cursosPage.clickFundamentosTestingLink();
       fundamentosPage.clickFundamentosTestingLink();
   }
   @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans(){
       List<String> lista = registro.returnPlanDropdownValues();
       List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 11 productos",
               "Academia: $176 / año • 11 productos","Free: Gratis • 1 producto");

       Assert.assertEquals(listaEsperada,lista);

    }
}
