package com.example.task_01.models;

public class Reply {

    private String message;

    public Reply(){}

    public Reply(String message){
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
