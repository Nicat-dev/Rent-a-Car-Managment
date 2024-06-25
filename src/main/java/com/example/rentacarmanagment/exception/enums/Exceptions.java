package com.example.rentacarmanagment.exception.enums;

import com.example.rentacarmanagment.exception.message.ExceptionMessage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum Exceptions {

    TOKEN_IS_INVALID_EXCEPTION(HttpStatus.BAD_REQUEST, ExceptionMessage.TOKEN_IS_INVALID_EXCEPTION),
    USER_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, ExceptionMessage.USER_NOT_FOUND_EXCEPTION),
    PASSWORD_DOESNT_MATCH(HttpStatus.NOT_FOUND, ExceptionMessage.PASSWORD_DOESNT_MATCH),
    RESOURCE_EXIST_EXCEPTION(HttpStatus.BAD_REQUEST, ExceptionMessage.RESOURCE_EXIST_EXCEPTION),
    RESOURCE_NOT_EXIST_EXCEPTION(HttpStatus.NOT_FOUND, ExceptionMessage.RESOURCE_NOT_EXIST_EXCEPTION),
    RESOURCE_ID_CAN_NOT_BE_NULL(HttpStatus.NOT_FOUND, ExceptionMessage.RESOURCE_ID_CAN_NOT_BE_NULL),
    TOKEN_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, ExceptionMessage.TOKEN_NOT_FOUND_EXCEPTION),
    EMAIL_EXIST_EXCEPTION(HttpStatus.BAD_REQUEST, ExceptionMessage.EMAIL_EXIST_EXCEPTION),
    MEDICINE_NOT_FOUND_EXCEPTION(HttpStatus.NOT_FOUND, ExceptionMessage.MEDICINE_NOT_FOUND_EXCEPTION),
    PAYMENT_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.PAYMENT_NOT_FOUND),
    PRESCRIPTION_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.PRESCRIPTION_NOT_FOUND),
    PROCEDURE_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.PROCEDURE_NOT_FOUND),
    SALARY_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.SALARY_NOT_FOUND),
    SALE_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.SALE_NOT_FOUND),
    WORKER_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.WORKER_NOT_FOUND),
    ROLE_NOT_FOUND(HttpStatus.NOT_FOUND, ExceptionMessage.ROLE_NOT_FOUND);

    private final HttpStatus httpStatus;
    private final String message;
}
