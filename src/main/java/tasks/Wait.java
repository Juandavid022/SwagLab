package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Wait implements Task {

    public static Performable delaySecond()
    {
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        return null;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
