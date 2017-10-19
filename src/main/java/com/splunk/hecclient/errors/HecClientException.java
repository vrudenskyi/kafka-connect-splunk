package com.splunk.hecclient.errors;

/**
 * Created by kchen on 10/17/17.
 */
public class HecClientException extends RuntimeException {
    public HecClientException(String message) {
        super(message);
    }

    public HecClientException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Created by kchen on 10/19/17.
     */
    public static class InvalidDataException {
    }
}
