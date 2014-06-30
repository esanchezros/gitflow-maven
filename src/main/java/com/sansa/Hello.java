package com.sansa;

public class Hello {
    private final long id;
    private final String message;

    public Hello(long id, String message) {

        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
