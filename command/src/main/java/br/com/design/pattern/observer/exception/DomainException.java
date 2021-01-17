package br.com.design.pattern.command.exception;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
