package org.karpukhin.lab2.ex1;

/**
 * @author Pavel Karpukhin
 * @since 01.10.12
 */
public class ApplicationException extends RuntimeException {

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
