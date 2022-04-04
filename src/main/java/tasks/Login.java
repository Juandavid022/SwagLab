package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.SwagLabsLoginPage;

public class Login implements Task {

    public static Login OnThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("standard_user").into((Target) SwagLabsLoginPage.INPUT_USER),
                Enter.theValue("secret_sauce").into((Target) SwagLabsLoginPage.INPUT_PASSWORD),
                Click.on((Target) SwagLabsLoginPage.ENTER_BUTTON));


    }
}
