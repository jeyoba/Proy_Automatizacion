package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;


public class TarjetaPage {
    private WebDriver driver;
    private WebDriverWait wait;
    protected static String vNumTarj;
    protected static String vCvv;
    protected static String mes;
    protected static String anio;


    //Locators
    @FindBy(xpath ="//*[@id=\"three\"]/div/h4[1]") private WebElement lblNumTarj;
    @FindBy(xpath ="//*[@id=\"three\"]/div/h4[2]") private WebElement lblCvv;
    @FindBy(xpath ="//*[@id=\"three\"]/div/h4[3]") private WebElement lblFechExp;

    //Constructor
    public TarjetaPage(WebDriver d){
        driver = d;
        wait = new WebDriverWait(driver,30);
        //Inicializar todos los elementos
        PageFactory.initElements(driver,this);
    }

    public void obtenerNumeroTarjeta(){
        wait.until(ExpectedConditions.visibilityOf(lblNumTarj));
        vNumTarj=lblNumTarj.getText().replace("Card Number:- ","");
        //vNumTarj= lblNumTarj.getText();
        System.out.println(vNumTarj);

    }
    public void obtenerCvv(){
        wait.until(ExpectedConditions.visibilityOf(lblCvv));
        vCvv=lblCvv.getText().replace("CVV:- ","");
        //vCvv= lblCvv.getText();
        System.out.println(vCvv);

    }
    public void obtenerFechExp(){
        /*wait.until(ExpectedConditions.visibilityOf(lblFechExp));
        vFechExp=lblFechExp.getText().replace("Exp:-","");*/
        //vFechExp= lblFechExp.getText();
        /*wait.until(ExpectedConditions.visibilityOf(lblFechExp));
        String dato []= lblFechExp.getText().replace("Exp:- ","").split("/");

        System.out.println(lblFechExp.getText());*/
        String expDate []=lblFechExp.getText().replace("Exp:- ","").split("/");
        mes = expDate[0];
        anio = expDate[1];
        System.out.println(mes);
        System.out.println(anio);
       }

    public void windowsPosition(){
        Set<String> identificadores= driver.getWindowHandles();
        for (String identificador: identificadores){
            driver.switchTo().window(identificador);
        }
    }
    public void windowsInicial(){
        driver.close();
        driver.switchTo().window("");


    }

}
