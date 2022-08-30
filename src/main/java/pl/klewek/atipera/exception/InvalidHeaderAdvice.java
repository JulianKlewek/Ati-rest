package pl.klewek.atipera.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.klewek.atipera.model.ExceptionResponse;

@RestControllerAdvice
public class InvalidHeaderAdvice {

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ExceptionResponse invalidHeaderHandler(HttpMediaTypeNotAcceptableException ex){

        ExceptionResponse exceptionResponse = new ExceptionResponse(HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage());
        return exceptionResponse;
    }
}
