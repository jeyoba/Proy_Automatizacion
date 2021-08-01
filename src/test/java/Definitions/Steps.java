package Definitions;

import PageObjects.ExitosoPage;
import PageObjects.HomePage;
import PageObjects.PayPage;
import PageObjects.TarjetaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

   HomePage hpage;
   TarjetaPage tpage;
   PayPage ppage;
   ExitosoPage epage;

    //Constructor
    public Steps() {
       hpage = new HomePage(Hooks.driver);
       tpage = new TarjetaPage(Hooks.driver);
       ppage = new PayPage(Hooks.driver);
       epage = new ExitosoPage(Hooks.driver);

    }
    @Given("Web page is available")
    public void webPageIsAvailable() {
        Hooks.driver.get("http://demo.guru99.com/payment-gateway/index.php");

    }

    @When("The user generates a card number")
    public void theUserGeneratesACardNumber() {

        hpage.clicGenerarTarjeta();
    }

    @And("Usuario obtiene valores de tarjeta")
    public void usuarioObtieneValoresDeTarjeta() {
        tpage.windowsPosition();
        tpage.obtenerNumeroTarjeta();
        tpage.obtenerCvv();
        tpage.obtenerFechExp();
        tpage.windowsInicial();
    }

    @And("El usuario compra {string} productos")
    public void elUsuarioCompraProductos(String cant) {
        hpage.seleccionarCantidad(cant);
        hpage.comprarProducto();
    }

    @And("El usuario ingresa los campos obligatorios")
    public void elUsuarioIngresaLosCamposObligatorios() {
        ppage.ingresarNumeroTarjeta();
        ppage.ingresarMesExp();
        ppage.ingresarAnioExp();
        ppage.ingresarCvv();

    }

    @And("El usuario genera pago")
    public void elUsuarioGeneraPago() {
        ppage.generarPago();
    }


    @Then("Verificar pago exitoso")
    public void verificarPagoExitoso() {
        epage.verificarMensaje();

    }
}
