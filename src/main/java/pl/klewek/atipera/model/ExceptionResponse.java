package pl.klewek.atipera.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExceptionResponse {
    @JsonProperty("status")
    private final int statusCode;
    @JsonProperty("Message")
    private final String message;

    public ExceptionResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

}
