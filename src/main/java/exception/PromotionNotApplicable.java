package exception;

import java.util.List;

public class PromotionNotApplicable extends PromotionsException{

    public PromotionNotApplicable(List<ErrorDetails> errors) {
        super(errors);
    }

    public PromotionNotApplicable(String s, List<ErrorDetails> errors) {
        super(s, errors);
    }

    public PromotionNotApplicable(String s, Throwable throwable, List<ErrorDetails> errors) {
        super(s, throwable, errors);
    }

    public PromotionNotApplicable(Throwable throwable, List<ErrorDetails> errors) {
        super(throwable, errors);
    }
}
