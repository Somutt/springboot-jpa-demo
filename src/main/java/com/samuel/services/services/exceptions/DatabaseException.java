package com.samuel.services.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 6298951985334374436L;

    public DatabaseException(String message) {
        super(message);
    }
}
