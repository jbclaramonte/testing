package io.coderelief.springboot.model;


import com.fasterxml.jackson.annotation.JsonView;

public class Message {

    private String content;
    private User from;

    @JsonView(User.Views.Internal.class)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @JsonView(User.Views.Internal.class)
    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }
}
