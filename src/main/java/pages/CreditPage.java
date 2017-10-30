package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreditPage extends BasePage {
    public CreditPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[contains(text(),'Рассчитать')]")
    public WebElement calculatorBtn;

}
