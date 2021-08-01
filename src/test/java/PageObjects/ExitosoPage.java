package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExitosoPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Locators
    @FindBy(xpath = "//*[@id=\"three\"]/div/div/h2") private WebElement lblMensaje;

    //Constructor
    public ExitosoPage(WebDriver d){
        driver = d;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

    public void verificarMensaje(){
        wait.until(ExpectedConditions.elementToBeClickable(lblMensaje));
        Assert.assertEquals("Payment successfull!",lblMensaje.getText());

    }

}
