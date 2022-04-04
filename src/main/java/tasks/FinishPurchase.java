package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.CheckOutComplete;
import userinterface.CheckOutSecondStepPage;


public class FinishPurchase implements Task {

    public static tasks.FinishPurchase OnThePage() {
        return Tasks.instrumented(tasks.FinishPurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) CheckOutSecondStepPage.BUTTON_FINISH));

    }
}
