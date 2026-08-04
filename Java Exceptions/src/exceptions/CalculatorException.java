package exceptions;

public class CalculatorException extends RuntimeException {
    public CalculatorException(String message) {
        //messages are stored in the parent class (all the way up to Exception)
        super(message);
    }
}
