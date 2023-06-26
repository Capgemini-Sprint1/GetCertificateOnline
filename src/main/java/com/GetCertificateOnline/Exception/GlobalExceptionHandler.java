package com.GetCertificateOnline.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
         @ExceptionHandler(value = PaymentNotFoundException.class)
         public ResponseEntity<String> PaymentcardNotFound(PaymentNotFoundException e) {
        	 return new ResponseEntity<>("Payment Not Found", HttpStatus.NOT_FOUND);

}

          @ExceptionHandler(value = PaymentAlreadyExistException.class)
          public ResponseEntity<String> PaymentNotFound(PaymentAlreadyExistException e) {
        	  return new ResponseEntity<>("Payment Already Exists", HttpStatus.NOT_FOUND);
}
}










