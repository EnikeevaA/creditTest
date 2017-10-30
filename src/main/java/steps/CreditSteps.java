package steps;

import pages.CreditPage;
import ru.yandex.qatools.allure.annotations.Step;

public class CreditSteps {
    CreditPage creditPage=new CreditPage();
    @Step("Выбран пункт {0}")
    public void stepGoToCalculator(){
        creditPage.calculatorBtn.click();
    }
}
