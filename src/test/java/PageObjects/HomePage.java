package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Locators
    @FindBy(linkText = "Generate Card Number") private WebElement lnk_generateTarjeta;

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








}
