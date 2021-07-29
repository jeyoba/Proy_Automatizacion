package Definitions;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

   HomePage hpage;

    //Constructor
    public Steps() {
       hpage = new HomePage(Hooks.driver);

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
        hpage.clicGenerarPago();
    }

    @And("El usuario selecciona los campos obligatorios")
    public void elUsuarioSeleccioneLosCamposObligatorios() {
        hpage.validarCamposObligatorios();
    }

    @Then("Verificar pago exitoso")
    public void verificarPagoExitoso() {
    }

    @And("Verificar que regrese a pantalla inicio")
    public void verificarQueRegreseAPantallaInicio() {
    }
}
