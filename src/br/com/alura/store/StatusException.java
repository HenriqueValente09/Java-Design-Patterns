package br.com.alura.store;

public class StatusException extends RuntimeException{
    private static final long SerialVersionUID = 1;

    public StatusException (String message) {
        super(message);
    }
}
