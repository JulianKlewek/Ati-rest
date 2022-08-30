package pl.klewek.atipera.exception;

public class InvalidHeaderException extends RuntimeException{

    public InvalidHeaderException() {
        super("Accept: application/xml is not acceptable header");
    }
}
