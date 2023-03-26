package ru.zinchenko.exception;

public class InvalidSockException extends RuntimeException {
    public InvalidSockException(String message) {
        super(message);
    }
}