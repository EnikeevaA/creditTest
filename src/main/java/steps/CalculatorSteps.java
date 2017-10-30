package steps;

import pages.CalculatorPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CalculatorSteps {
    CalculatorPage calculatorPage=new CalculatorPage();

    @Step("Выбрано поле Хочу")
    public void stepWantClick(){
        calculatorPage.wantClick.click();
    }

    @Step("Выбрана категория Купить готовую квартиру")
    public void stepFinishedclick(){
        calculatorPage.finishedClick.click();
    }
}
