package com.samuel.services.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -2095035505184603803L;

    public ResourceNotFoundException(Object resource) {
        super("Resource not found. Id: " + resource);
    }
}
