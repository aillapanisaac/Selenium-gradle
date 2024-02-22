package pages;

public class PrincipalPage extends BasePage{
    public PrincipalPage(){
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com/");
    }
}
