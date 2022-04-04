package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.SwagLabsLoginPage;

public class LoginLocked implements Task {

    public static LoginLocked OnThePage() {
        return Tasks.instrumented(LoginLocked.class);
    }

      @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue("locked_out_user").into((Target) SwagLabsLoginPage.INPUT_USER),
                Enter.theValue("secret_sauce").into((Target) SwagLabsLoginPage.INPUT_PASSWORD),
                Click.on((Target) SwagLabsLoginPage.ENTER_BUTTON));

    }
}
