package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
/**
 *@ControllerAdvice — marks this class as a global handler, applying to every controller in the app (not just one).
 * @ExceptionHandler(ResourceNotFoundException.class) — says "whenever any controller throws this specific exception, run this method instead of letting it crash."
 *
Result: instead of a 500 with a stack trace, the client now gets:

json
{
"status": 404,
"message": "Employee not found: 5"
}

Predictable, clean contract — frontend can reliably check if (response.status === 404) show "Employee not found".
 */