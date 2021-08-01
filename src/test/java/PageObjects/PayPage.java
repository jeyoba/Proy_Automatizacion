package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PayPage {

    private WebDriver driver;
    private WebDriverWait wait;
    TarjetaPage tpage;

    //Locators
    @FindBy(xpath = "//*[@id=\"card_nmuber\"]") private WebElement txtNumeroTarj;
    @FindBy(xpath = "//*[@id=\"month\"]") private WebElement txtMes;
    @FindBy(xpath = "//*[@id=\"year\"]") private WebElement txtAnio;
    @FindBy(xpath = "//*[@id=\"cvv_code\"]") private WebElement txtCvv;
    @FindBy(xpath = "//*[@id=\"three\"]/div/form/div[2]/div/ul/li/input") private WebElement btn_generar;

    //Constructor
    public PayPage(WebDriver d){
        driver = d;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }
    public void ingresarNumeroTarjeta(){

        txtNumeroTarj.sendKeys(tpage.vNumTarj);

    }
    public void ingresarMesExp(){
        txtMes.sendKeys(tpage.mes);

    }

    public void ingresarAnioExp(){
        txtAnio.sendKeys(tpage.anio);

    }
    public void ingresarCvv(){
        txtCvv.sendKeys(tpage.vCvv);

    }
    public void generarPago(){
        btn_generar.click();
    }





}
