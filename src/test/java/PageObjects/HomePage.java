package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;


    //Locators
    @FindBy(linkText = "Generate Card Number") private WebElement lnk_generateTarjeta;
    @FindBy(name = "quantity") private WebElement cbo_lista_cantidad;
    @FindBy(xpath = "//*[@id=\"three\"]/div//div/div[8]//li/input") private WebElement btn_comprar;


    //Constructor
    public HomePage(WebDriver d){
        driver = d;
        wait = new WebDriverWait(driver,30);
        //Inicializar todos los elementos
        PageFactory.initElements(driver,this);
    }

    public void clicGenerarTarjeta(){
        wait.until(ExpectedConditions.elementToBeClickable(lnk_generateTarjeta));
        lnk_generateTarjeta.click();

        //System.out.println("test");

    }
    public void seleccionarCantidad(String cant){
        wait.until(ExpectedConditions.elementToBeClickable(cbo_lista_cantidad));
        new Select(cbo_lista_cantidad).selectByValue(cant);
        //cbo_lista_cantidad.click();

        /*driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select/option["+cant+"]")).getText();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"three\"]/div/form/div/div[4]/select/option["+cant+"]")).getText());*/
    }

    public void comprarProducto(){
        wait.until(ExpectedConditions.elementToBeClickable(btn_comprar));
        btn_comprar.click();


    }








}
