// src/main/java/com/nimap/exception/ResourceNotFoundException.java
package com.nimap.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}
