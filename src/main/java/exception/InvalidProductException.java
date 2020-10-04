package exception;

import java.util.List;

public class InvalidProductException extends PromotionsException{

    public InvalidProductException(List<ErrorDetails> errors) {
        super(errors);
    }

    public InvalidProductException(String s, List<ErrorDetails> errors) {
        super(s, errors);
    }

    public InvalidProductException(String s, Throwable throwable, List<ErrorDetails> errors) {
        super(s, throwable, errors);
    }

    public InvalidProductException(Throwable throwable, List<ErrorDetails> errors) {
        super(throwable, errors);
    }
}
