package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckOutPage extends PageObject {



    public static final Target INPUT_NAME = Target.the("Input name")
            .located(By.id("first-name"));

    public static final Target INPUT_LASTNAME = Target.the("Input last name")
            .located(By.id("last-name"));

    public static final Target INPUT_POSTALCODE = Target.the("Input postal code")
            .located(By.id("postal-code"));

    public static final Target BUTTON_CONTINUE = Target.the("Button continue")
            .located(By.id("continue"));
    



}


