package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.SearchInventoryPage;
import userinterface.ShoppingCartPage;

public class SearchItems implements Task {

    private String items;

    public SearchItems(String items) {
        this.items = items;
    }

    public static SearchItems the(String items) {
        return Tasks.instrumented(SearchItems.class, items);

    }

    public static SearchItems OnThePage() {
        return Tasks.instrumented(SearchItems.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on((Target) ShoppingCartPage.ADD_CART),
                Click.on((Target) SearchInventoryPage.SELECT_BACKPACK));
    }

}
