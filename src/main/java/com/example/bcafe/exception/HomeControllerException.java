package com.example.bcafe.exception;

public class HomeControllerException extends Exception {
    public HomeControllerException() {
        super();
    }

    public HomeControllerException(String message) {
        super(message);
    }

    public HomeControllerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HomeControllerException(Throwable cause) {
        super(cause);
    }

    protected HomeControllerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
