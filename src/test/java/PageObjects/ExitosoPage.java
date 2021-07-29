package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExitosoPage {

    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public ExitosoPage(WebDriver d){
        driver = d;
        wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }

}
