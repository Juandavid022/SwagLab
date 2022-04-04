package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchInventoryPage extends PageObject {

    public static final Target SELECT_BACKPACK = Target.the("where do we search the item")
            .located(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));

}
