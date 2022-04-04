package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    public static final Target BUTTON_CART = Target.the("Open shopping cart ")
            .located(By.xpath("//a[@class='shopping_cart_link']"));

}






