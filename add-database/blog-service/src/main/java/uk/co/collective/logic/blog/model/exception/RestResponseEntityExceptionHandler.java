package uk.co.collective.logic.blog.model.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by graeme.dougal on 09/04/2017.
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * handlePharmacyNotFoundException
     *
     * @param exception
     * @param webRequest
     * @return ResponseEntity<Object>
     */
    @ExceptionHandler(BlogNotFoundException.class)
    protected ResponseEntity<Object> handlePharmacyNotFoundException(
            RuntimeException exception, WebRequest webRequest) {

        return handleExceptionInternal(
                exception, "Blog Not Found", new HttpHeaders(), HttpStatus.NOT_FOUND, webRequest);
    }

}
