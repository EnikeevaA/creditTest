package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{
    public MainPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='sbrf-div-list-inner --area bp-area header_more_nav']//*[contains(text(),'Взять')]")
    public WebElement credit;

    @FindBy(xpath = "//*[contains(text(),'Приобретение готового жилья')]")
    public WebElement goToCreditBtn;

}
