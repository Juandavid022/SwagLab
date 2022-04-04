package userinterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;



public class SwagLabsLoginPage extends PageObject {

    public static  final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("user-name"));

    public static  final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));

    public static  final Target ENTER_BUTTON = Target.the("Button to confirm login")
            .located(By.id("login-button"));

}
