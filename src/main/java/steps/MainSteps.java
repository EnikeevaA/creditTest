package steps;

import pages.MainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MainSteps {
    MainPage mainPage=new MainPage();
    @Step("выбран пункт {0} кредит")
    public void stepCredit(){
        mainPage.credit.click();
    }
    @Step("выбран пункт {0}")
    public  void stepGoToCredit(){
        mainPage.goToCreditBtn.click();
    }
}
