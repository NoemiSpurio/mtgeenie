package com.nhy.mtgeenie.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class MtgeenieException extends RuntimeException {

	private static final long serialVersionUID = -5371255164304606658L;

	private String message;
    private HttpStatus status;
    private final Object[] substitutionParameter;

    public MtgeenieException(String message,
                             HttpStatus statusCode,
                             Object... substitutionParameter) {

        this.status = statusCode;
        this.message = message;
        this.substitutionParameter = substitutionParameter;
    }
}
