package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckOutSecondStepPage extends PageObject{

    public static final Target BUTTON_FINISH = Target.the("Button finish")
            .located(By.id("finish"));
}


