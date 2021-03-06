package com.ecommerceproject.service.pedidos.exception;

import java.util.Date;

import com.ecommerceproject.service.pedidos.constants.MessagesPortuguese;
import com.ecommerceproject.service.pedidos.response.ErrorMessage;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * AppExceptionHandler
 * 
 * Classe para controle centralizado das exceções do sistema.
 */
@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Método para tratar exceções de modo geral.
     * Retorna uma mensagem de caráter mais genérico.
     * 
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {

        /* Creating an returned object of type ErrorMessage */
        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setUserFriendlyMessage(MessagesPortuguese.GENERAL_SYSTEM_ERROR);
        errorMessage.setErrorDetails(ex.getLocalizedMessage());
        errorMessage.setTimeStamp(new Date());
        errorMessage.setExceptionType(ex.getClass().getName());

        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    
    /**
     * Método para tratamento de exceções de tipo NullPointerException.
     * 
     * @param ex
     * @param request
     * @return
     */
    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> handleNullPointerException(NullPointerException ex, WebRequest request) {

        ErrorMessage errorMessage = new ErrorMessage();
        errorMessage.setUserFriendlyMessage(MessagesPortuguese.CODE_SYSTEM_ERROR);
        errorMessage.setErrorDetails(ex.getLocalizedMessage());
        errorMessage.setTimeStamp(new Date());
        errorMessage.setExceptionType(ex.getClass().getName());

        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    
}