package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.LoginLocked;
import userinterface.LoginLockedPage;
import userinterface.ShoppingCartPage;
import userinterface.SwagLabsLoginPage;

public class AnswerLoginLocked implements Question<Boolean> {

    private String question;

    public AnswerLoginLocked(String question) {
        this.question = question;
    }

    public static AnswerLoginLocked toThe(String question) {
        return new AnswerLoginLocked(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String userLocked = Text.of(LoginLockedPage.TEXT_LOCKED).viewedBy(actor).asString();
        if (question.equals(userLocked)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}





