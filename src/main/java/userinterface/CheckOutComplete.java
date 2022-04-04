package userinterface;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckOutComplete extends PageObject {

    public static final Target TEXT_ORDER = Target.the("text thank you for you order")
            .located(By.xpath("/html/body/div/div/div/div[2]/h2"));
}


