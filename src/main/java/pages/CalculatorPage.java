package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class CalculatorPage extends BasePage {
    public CalculatorPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='inner___2Hdp']")
    public WebElement wantClick;

    @FindBy(xpath = "//*[text()='Купить готовую квартиру']")
    public  WebElement finishedClick;


    @FindBy(id = "estateCost")
    public WebElement sumCridit;

    @FindBy(id = "initialFee")
    public WebElement sumHave;

    @FindBy(id = "//*[@id='creditTerm']")
    public  WebElement creditTerm;

public void cleanElements(WebElement element){
    Actions act=new Actions(driver);
    //?
}

}
