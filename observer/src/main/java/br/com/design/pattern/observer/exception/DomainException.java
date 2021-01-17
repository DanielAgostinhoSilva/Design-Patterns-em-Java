package br.com.design.pattern.observer.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
