package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ShoppingCartPage extends PageObject {

    public static final Target ITEM_BACKPACK = Target.the("where do we search the item")
            .located(By.xpath("/html/body/div/div/div/div[2]/div/div/div[2]/div[1]"));

    public static  final Target ADD_CART = Target.the("Button to add cart")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static  final Target BUTTON_CHECKOUT = Target.the("Shopping cart")
            .located(By.id("checkout"));

}
