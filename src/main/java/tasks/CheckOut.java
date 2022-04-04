package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.CartPage;
import userinterface.ShoppingCartPage;

public class CheckOut implements Task{

    public static tasks.CheckOut OnThePage() {
        return Tasks.instrumented(tasks.CheckOut.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        Wait.delaySecond();
        actor.attemptsTo(
                Click.on((Target) ShoppingCartPage.BUTTON_CHECKOUT));

    }
}