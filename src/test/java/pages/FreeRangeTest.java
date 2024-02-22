package pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeRangeTest {
    private static WebDriver driver;


    @BeforeEach
    public void setUp(){
        // Inicializa el WebDriver para Chrome
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void navegamosAFreeRangeTest(){
        // navega a la pagina web
        driver.get("https://www.freerangetesters.com/");
    }

    @AfterEach
    public void tearDrow(){
        // Cierra el navegador despues de la prueba
        if (driver != null){
            driver.quit();
        }
    }

}
