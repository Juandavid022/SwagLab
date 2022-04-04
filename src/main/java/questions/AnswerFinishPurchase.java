package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import tasks.FinishPurchase;
import userinterface.CheckOutComplete;
import userinterface.ShoppingCartPage;

public class AnswerFinishPurchase implements Question<Boolean> {
    private String question;

    public AnswerFinishPurchase(String question) {
        this.question = question;
    }

    public static AnswerFinishPurchase toThe(String question) {
        return new AnswerFinishPurchase(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textPurchase = Text.of(CheckOutComplete.TEXT_ORDER).viewedBy(actor).asString();
        if (question.equals(textPurchase)) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}
