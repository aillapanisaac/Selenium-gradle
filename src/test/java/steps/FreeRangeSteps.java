package steps;

import io.cucumber.java.en.*;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaRegistro;
import pages.PrincipalPage;

import java.util.Arrays;
import java.util.List;

public class FreeRangeSteps {
    SoftAssert soft = new SoftAssert();

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

   @And("^(?:I|The user|The client) selects? Introducción al Testing$")
    public void navigateToIntro(){
       cursosPage.clickFundamentosTestingLink();
       fundamentosPage.clickFundamentosTestingLink();
   }
   @Then("^(?:I|The user|The client) can validate the options in the checkout page$")
    public void validateCheckoutPlans(){
       List<String> lista = registro.returnPlanDropdownValues();
       List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 11 productos",
               "Academia: $176 / año • 11 productos","Free: Gratis • 1 producto");

       Assert.assertEquals(listaEsperada,lista);

    }

    public void Ejempluli(){
        String palabraEssperaa = "Pepe";
        String palabraEncontrada = "Papa";

        Integer numeroloco = 1;
        Integer numeroloco2 = 2;

        // Verificar que los valores son iguales
        Assert.assertEquals(numeroloco,numeroloco2);
        Assert.assertNotEquals(palabraEssperaa,palabraEncontrada);

        // Verificar que dos valores no son iguales
        Assert.assertEquals(palabraEssperaa,palabraEncontrada);
        // Verficar qu una conicion es verdadera
        Assert.assertTrue(palabraEncontrada.contains(palabraEssperaa));
        //Verificar que una condicion es falsa
        Assert.assertFalse(palabraEncontrada.contains(palabraEssperaa));

        /// Soft Assertions: No detienen la ejecución al fallar. Ideal para verificar
        // muchas cossas pequeñas a la veez

        soft.assertEquals(palabraEssperaa,palabraEncontrada);
        soft.assertTrue(palabraEncontrada.contains(palabraEssperaa));
        soft.assertNotEquals(palabraEssperaa,palabraEncontrada);

        soft.assertAll();

    }
}
