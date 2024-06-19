package com.nhy.mtgeenie.exception;

import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import java.time.DateTimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@ControllerAdvice
@RestController
@AllArgsConstructor
public class ExceptionController {

    private final MessageSource messageSource;

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO handleValidationExceptions(MethodArgumentNotValidException ex, Locale locale) {

        List<String> errorMessage = new ArrayList<>();

        ex.getBindingResult().getAllErrors().forEach(error -> {
            if (error.getDefaultMessage() != null)
                errorMessage.add(messageSource.getMessage(error.getDefaultMessage(), null, locale));
        });
        return ErrorDTO.builder()
                .message(String.join("|", errorMessage))
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();
    }

    @ExceptionHandler(MtgeenieException.class)
    public ResponseEntity<ErrorDTO> checkDomicilioException(MtgeenieException ex, Locale locale) {
        return ResponseEntity.status(ex.getStatus()).body(
                ErrorDTO.builder()
                        .message(messageSource.getMessage(ex.getMessage(), ex.getSubstitutionParameter(), locale))
                        .statusCode(ex.getStatus().value())
                        .build());
    }

    @ExceptionHandler(MissingPathVariableException.class)
    public ResponseEntity<ErrorDTO> handleMissingPathVariableException(MissingPathVariableException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                ErrorDTO.builder()
                        .message(ex.getMessage())
                        .statusCode(HttpStatus.BAD_REQUEST.value())
                        .build());
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public ResponseEntity<ErrorDTO> handleMaxSizeException(MaxUploadSizeExceededException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                ErrorDTO.builder()
                        .message(ex.getMessage())
                        .statusCode(HttpStatus.EXPECTATION_FAILED.value())
                        .build());
    }

    @ExceptionHandler(DateTimeException.class)
    public ResponseEntity<ErrorDTO> handleMaxSizeException(DateTimeException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                ErrorDTO.builder()
                        .message(ex.getMessage())
                        .statusCode(HttpStatus.EXPECTATION_FAILED.value())
                        .build());
    }

}
