package com.h2.jah.dtos;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class NotFoundDTO {
    private Date date;
    private HttpStatus httpStatus;
    private String message;

    public NotFoundDTO() {
    }

    public NotFoundDTO(Date date, HttpStatus httpStatus, String message) {
        this.date = date;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
