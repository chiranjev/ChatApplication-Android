package com.chiranjevkoul.flashchatnewfirebase;

/**
 * Created by Chiranjev Koul on 02-03-2018.
 */

public class InstantMessage
{
    private String message;
    private String author;

    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
