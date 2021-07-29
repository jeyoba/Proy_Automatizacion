package Definitions;

import PageObjects.ExitosoPage;
import PageObjects.HomePage;
import PageObjects.PayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

   HomePage hpage;
   PayPage ppage;
   ExitosoPage epage;

    //Constructor
    public Steps() {
       hpage = new HomePage(Hooks.driver);
       ppage = new PayPage(Hooks.driver);
       epage = new ExitosoPage(Hooks.driver);

    }
    @Given("Web page is available")
    public void webPageIsAvailable() {
        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");

    }

    @When("The user generates a card number")
    public void theUserGeneratesACardNumber() {

        hpage.clicGenerar();
    }

    @And("The user pay a product")
    public void theUserPayAProduct() {
        hpage.seleccionarCantidad();
        hpage.clicGenerarPago();
    }

    @And("El usuario selecciona los campos obligatorios")
    public void elUsuarioSeleccioneLosCamposObligatorios() {
        ppage.ingresarNumeroTarjeta();
        ppage.ingresarMesExp();
        ppage.ingresarAnioExp();
        ppage.ingresarCvv();

    }
    @And("El usuario genera pago")
    public void elUsuarioGeneraPago() {
        ppage.procederPago();
    }

    @Then("Verificar pago exitoso")
    public void verificarPagoExitoso() {
        epage.VerificarPagoExitoso();
    }

    @And("Verificar que regrese a pantalla inicio")
    public void verificarQueRegreseAPantallaInicio() {
        epage.MostrarHomePage();
    }


}
