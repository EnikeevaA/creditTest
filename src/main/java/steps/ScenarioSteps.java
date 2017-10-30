package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.CreditPage;
import pages.MainPage;

public class ScenarioSteps {
    MainSteps mainSteps=new MainSteps();
    CreditSteps creditSteps=new CreditSteps();

    @When("^выбран пункт меню (.*)$")
    public void creditClick(){mainSteps.stepCredit();}
    @And("^выбран пункт(.*)$")
    public void goToCreditClick(){mainSteps.stepGoToCredit();}
    @When("^выбран пункт (.*)$")
    public void goToCalculator(){creditSteps.stepGoToCalculator();}
}
