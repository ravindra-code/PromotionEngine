package exception;

import java.util.List;

public class PromotionsException extends Exception{

    private List<ErrorDetails> errors;

    public PromotionsException(List<ErrorDetails> errors) {
        this.errors = errors;
    }

    public PromotionsException(String s, List<ErrorDetails> errors) {
        super(s);
        this.errors = errors;
    }

    public PromotionsException(String s, Throwable throwable, List<ErrorDetails> errors) {
        super(s, throwable);
        this.errors = errors;
    }

    public PromotionsException(Throwable throwable, List<ErrorDetails> errors) {
        super(throwable);
        this.errors = errors;
    }

    public List<ErrorDetails> getErrors() {
        return errors;
    }
}
