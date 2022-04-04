package tasks;

import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.ShoppingCartPage;


public class AddToCart implements Task {
    public static tasks.AddToCart OnThePage() {
        return Tasks.instrumented(tasks.AddToCart.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) ShoppingCartPage.ADD_CART));

    }

}
