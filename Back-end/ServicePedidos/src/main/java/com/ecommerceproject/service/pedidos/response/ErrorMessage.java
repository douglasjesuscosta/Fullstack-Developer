package com.ecommerceproject.service.pedidos.response;

import java.util.Date;

/**
 * ErrorMessage
 * 
 * Classe que tem como concepção representar um retorno
 * mediante a um erro no sistema, trazendo uma mensagem
 * amigável ao usuário, horário, exceção entre outras
 * informações.
 */
public class ErrorMessage {

    private Date timeStamp;
    private String userFriendlyMessage;
    private String errorDetails;
    private String exceptionType;

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getUserFriendlyMessage() {
        return userFriendlyMessage;
    }

    public void setUserFriendlyMessage(String userFriendlyMessage) {
        this.userFriendlyMessage = userFriendlyMessage;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public String getExceptionType() {
        return exceptionType;
    }

    public void setExceptionType(String exceptionType) {
        this.exceptionType = exceptionType;
    }
}