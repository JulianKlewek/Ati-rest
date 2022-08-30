package pl.klewek.atipera.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import pl.klewek.atipera.model.ExceptionResponse;

@RestControllerAdvice
public class UsernameNotFoundAdvice {

    @ExceptionHandler(UsernameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponse usernameNotFoundHandler(UsernameNotFoundException ex){

        ExceptionResponse exceptionResponse = new ExceptionResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return exceptionResponse;
    }
}
