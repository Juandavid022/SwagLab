package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.CheckOutPage;
import userinterface.SearchInventoryPage;
import userinterface.ShoppingCartPage;
import userinterface.SwagLabsLoginPage;

import java.security.PrivilegedExceptionAction;

public class CheckOutSteps implements Task {
    private String name,lastName,postalCode;

    public CheckOutSteps(String name, String lastName, String postalCode) {
        this.name = name;
        this.lastName = lastName;
        this.postalCode = postalCode;
    }

    public static CheckOutSteps the(String name, String lastName, String postalCode){
        return Tasks.instrumented(CheckOutSteps.class,name,lastName,postalCode);
    }

    public static CheckOutSteps OnThePage(String name, String lastName, String postalCode) {
        return Tasks.instrumented(CheckOutSteps.class,name,lastName,postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Wait.delaySecond();
        actor.attemptsTo(
                Enter.theValue(name).into((Target) CheckOutPage.INPUT_NAME),
                Enter.theValue(lastName).into((Target) CheckOutPage.INPUT_LASTNAME),
                Enter.theValue( postalCode).into((Target) CheckOutPage.INPUT_POSTALCODE),
                Click.on((Target) CheckOutPage.BUTTON_CONTINUE));
    }
}





