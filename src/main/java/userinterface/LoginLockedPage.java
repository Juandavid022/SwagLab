package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginLockedPage extends PageObject {

    public static  final Target TEXT_LOCKED = Target.the("Button error")
            .located(By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[3]/h3"));
}
