package exceptions;

public class InvalidPasswordException extends Throwable {
    private String message;

    public InvalidPasswordException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
