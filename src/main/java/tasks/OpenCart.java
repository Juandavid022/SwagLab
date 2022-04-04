package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.CartPage;


public class OpenCart implements Task {
    public static tasks.OpenCart OnThePage() {
        return Tasks.instrumented(tasks.OpenCart.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Wait.delaySecond();
        actor.attemptsTo(
                Click.on((Target) CartPage.BUTTON_CART));

    }
}