package pages;

public class PrincipalPage extends BasePage{

    private String sectionLink = "//a[normalize-space()='%s' and @href]";
    //%s marcador de posicíon
    public PrincipalPage(){
        super(driver);
    }

    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
        //clickElement(searchButton);
    }
    public void clickOnSectionNavigationBar(String section){
        //Remplazar el marcador de posicion en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }


}
